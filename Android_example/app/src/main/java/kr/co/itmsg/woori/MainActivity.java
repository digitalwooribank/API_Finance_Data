package kr.co.itmsg.woori;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;

import kr.co.itmsg.woori.Http.HttpUrl;
import kr.co.itmsg.woori.RequestEntity.IndivAllAccInfoHeaderReq;
import kr.co.itmsg.woori.RequestEntity.IndivAllAccInfoBodyReq;
import kr.co.itmsg.woori.RequestEntity.IndivAllAccInfoDataReq;
import kr.co.itmsg.woori.ResponseEntity.IndivAllAccInfoData;
import kr.co.itmsg.woori.ResponseEntity.IndivAllAccInfoBodyGRID;
import kr.co.itmsg.woori.define.Urldefine;
import kr.co.itmsg.woori.view.AccBasicInfoActivity;
import kr.co.itmsg.woori.view.AccTransListActivity;

/**
 * 전계좌 조회 화면
 */
public class MainActivity extends AppCompatActivity {

    private IndivAllAccInfoTask task = new IndivAllAccInfoTask();
    private IndivAllAccInfoData list;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init(){
        ActionBar setTitle = getSupportActionBar();
        setTitle.setTitle("계좌조회");
        listView = (ListView) findViewById(R.id.listview);
        task.execute();
    }

    /**
     * 통신
     */
    public class IndivAllAccInfoTask extends AsyncTask<String, String, String>{

        @Override
        protected void onPreExecute(){
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            String response;

            try {
                IndivAllAccInfoHeaderReq requestHeader = new IndivAllAccInfoHeaderReq();
                requestHeader.setUTZPE_CNCT_IPAD("127.0.0.1");
                requestHeader.setUTZPE_CNCT_MCHR_UNQ_ID("");
                requestHeader.setUTZPE_CNCT_TEL_NO_TXT("");
                requestHeader.setUTZPE_CNCT_MCHR_IDF_SRNO("");
                requestHeader.setUTZ_MCHR_OS_DSCD("");
                requestHeader.setUTZ_MCHR_OS_VER_NM("");
                requestHeader.setUTZ_MCHR_MDL_NM("");
                requestHeader.setUTZ_MCHR_APP_VER_NM("");

                IndivAllAccInfoBodyReq requestBody = new IndivAllAccInfoBodyReq();

                IndivAllAccInfoDataReq request = new IndivAllAccInfoDataReq();
                request.setDataHeader(requestHeader);
                request.setDataBody(requestBody);

                String data = new Gson().toJson(request);
                String uri = Urldefine.URL + Urldefine.getIndivAllAccInfo;
                response = new HttpUrl().sendREST(uri, data);
            }
            catch (Exception e) {
                response = e.getMessage();
            }

            return response;
        }

        @Override
        protected void onPostExecute(String s){
            super.onPostExecute(s);
            if (!s.equals("")) {
                try {
                    list = new Gson().fromJson(s, IndivAllAccInfoData.class);
                    if(list.getDataBody().getGRID().size() > 0 ){
                        ListViewAdapter listViewAdapter = new ListViewAdapter(list.getDataBody().getGRID());
                        listView.setAdapter(listViewAdapter);
                    }
                }
                catch (Exception e) {
                    ErrorNotify(s + "\n" + e.getMessage());
                }
            }
            else {
                ErrorNotify(s);
            }
        }
    }

    public class ListViewAdapter extends BaseAdapter {
        private ArrayList<IndivAllAccInfoBodyGRID> listViewItemList = new ArrayList<IndivAllAccInfoBodyGRID>() ;

        public ListViewAdapter(ArrayList<IndivAllAccInfoBodyGRID> grid) {
            listViewItemList = grid;
        }
        @Override
        public int getCount() {
            return listViewItemList.size() ;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final int pos = position;
            final Context context = parent.getContext();

            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.list_item_view, parent, false);
            }

            TextView prdnm = (TextView) convertView.findViewById(R.id.prdnm);
            TextView acno = (TextView) convertView.findViewById(R.id.acno);
            TextView pbokbal = (TextView) convertView.findViewById(R.id.pbokbal);
            Button button1 = (Button) convertView.findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO : 거래내역 조회
                    Intent intent = new Intent(MainActivity.this, AccTransListActivity.class);
                    startActivity(intent);
                }
            });

            Button button2 = (Button) convertView.findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO : 기본 정보 조회
                    Intent intent = new Intent(MainActivity.this, AccBasicInfoActivity.class);
                    startActivity(intent);
                }
            });

            IndivAllAccInfoBodyGRID listViewItem = listViewItemList.get(position);

            prdnm.setText(listViewItem.getPRD_NM());
            acno.setText(listViewItem.getACNO());
            pbokbal.setText(listViewItem.getWDR_AVL_AM());

            return convertView;
        }

        @Override
        public long getItemId(int position) {
            return position ;
        }

        @Override
        public Object getItem(int position) {
            return listViewItemList.get(position) ;
        }
    }

    private void ErrorNotify(String errorMessage)
    {
        String title = "통신장애";
        String message = "통신이 월활하지 않습니다. 다시 시도하여 주세요.";

        if (!errorMessage.equals("")) {
            title = "예외발생";
            message = errorMessage;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        builder.show();
    }
}
