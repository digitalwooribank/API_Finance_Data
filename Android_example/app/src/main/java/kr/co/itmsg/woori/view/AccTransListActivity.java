package kr.co.itmsg.woori.view;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

import kr.co.itmsg.woori.Http.HttpUrl;
import kr.co.itmsg.woori.MainActivity;
import kr.co.itmsg.woori.R;
import kr.co.itmsg.woori.RequestEntity.AccTransListBodyReq;
import kr.co.itmsg.woori.RequestEntity.AccTransListDataReq;
import kr.co.itmsg.woori.RequestEntity.AccTransListHeaderReq;
import kr.co.itmsg.woori.RequestEntity.IndivAllAccInfoBodyReq;
import kr.co.itmsg.woori.RequestEntity.IndivAllAccInfoDataReq;
import kr.co.itmsg.woori.RequestEntity.IndivAllAccInfoHeaderReq;
import kr.co.itmsg.woori.ResponseEntity.AccTransListBodyGRID;
import kr.co.itmsg.woori.ResponseEntity.AccTransListData;
import kr.co.itmsg.woori.ResponseEntity.IndivAllAccInfoBodyGRID;
import kr.co.itmsg.woori.ResponseEntity.IndivAllAccInfoData;
import kr.co.itmsg.woori.define.Urldefine;

/**
 * 거래내역조회
 */
public class AccTransListActivity extends AppCompatActivity {
    private AccTransTask accTransTask = new AccTransTask();
    private AccTransListData accTransListData;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc_trans_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Init();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // API 5+ solution
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void Init(){
        ActionBar setTitle = getSupportActionBar();
        setTitle.setTitle("거래내역조회");
        listView = (ListView) findViewById(R.id.list);
        accTransTask.execute();
    }

    /**
     * 통신
     */
    public class AccTransTask extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute(){
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            String response;

            try {
                AccTransListHeaderReq requestHeader = new AccTransListHeaderReq();
                requestHeader.setUTZPE_CNCT_IPAD("127.0.0.1");
                requestHeader.setUTZPE_CNCT_MCHR_UNQ_ID("");
                requestHeader.setUTZPE_CNCT_TEL_NO_TXT("");
                requestHeader.setUTZPE_CNCT_MCHR_IDF_SRNO("");
                requestHeader.setUTZ_MCHR_OS_DSCD("");
                requestHeader.setUTZ_MCHR_OS_VER_NM("");
                requestHeader.setUTZ_MCHR_MDL_NM("");
                requestHeader.setUTZ_MCHR_APP_VER_NM("");

                AccTransListBodyReq requestBody = new AccTransListBodyReq();
                requestBody.setINQ_ACNO("");
                requestBody.setINQ_END_DT("");
                requestBody.setINQ_STA_DT("");

                AccTransListDataReq request = new AccTransListDataReq();
                request.setDataHeader(requestHeader);
                request.setDataBody(requestBody);

                String data = new Gson().toJson(request);
                String uri = Urldefine.URL + Urldefine.getAccTransList;
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
                    accTransListData = new Gson().fromJson(s, AccTransListData.class);
                    if(accTransListData.getDataBody().getGRID().size() > 0 ){
                        ListViewAdapter listViewAdapter = new ListViewAdapter(accTransListData.getDataBody().getGRID());
                        listView.setAdapter(listViewAdapter);
                    }
                }
                catch (Exception e) {
                    errorNotify(s + "\n" + e.getMessage());
                }
            }
            else {
                errorNotify(s);
            }
        }
    }

    public class ListViewAdapter extends BaseAdapter {
        private ArrayList<AccTransListBodyGRID> listViewItemList = new ArrayList<AccTransListBodyGRID>() ;

        public ListViewAdapter(ArrayList<AccTransListBodyGRID> grid) {
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
                convertView = inflater.inflate(R.layout.list_item_view_trans, parent, false);
            }

            TextView Trndt = (TextView) convertView.findViewById(R.id.trndt);
            TextView Trntm = (TextView) convertView.findViewById(R.id.trntm);
            TextView Cucd = (TextView) convertView.findViewById(R.id.cucd);
            TextView Pbok = (TextView) convertView.findViewById(R.id.pbokprngotlncd);
            TextView Dps = (TextView) convertView.findViewById(R.id.dpsrapkdcd);
            TextView Md = (TextView) convertView.findViewById(R.id.mdkdcd);
            TextView Rcv = (TextView) convertView.findViewById(R.id.rcvam);
            TextView Pay = (TextView) convertView.findViewById(R.id.payam);
            TextView Dpsval = (TextView) convertView.findViewById(R.id.dpsbal);
            TextView Trntxt = (TextView) convertView.findViewById(R.id.trntxt);
            TextView Rq = (TextView) convertView.findViewById(R.id.rqspenm);
            TextView Pid = (TextView) convertView.findViewById(R.id.pidsq);
            TextView Trnst = (TextView) convertView.findViewById(R.id.trnstcd);

            AccTransListBodyGRID listViewItem = listViewItemList.get(position);

            Trndt.setText(listViewItem.getTRN_DT());
            Trntm.setText(listViewItem.getTRN_TM());
            Cucd.setText(listViewItem.getCUCD());
            Pbok.setText(listViewItem.getPBOK_PRNG_OTLN_CD());
            Dps.setText(listViewItem.getDPS_RAP_KDCD());
            Md.setText(listViewItem.getMD_KDCD());
            Rcv.setText(listViewItem.getRCV_AM());
            Pay.setText(listViewItem.getPAY_AM());
            Dpsval.setText(listViewItem.getDPS_BAL());
            Trntxt.setText(listViewItem.getTRN_TXT());
            Rq.setText(listViewItem.getRQSPE_NM());
            Pid.setText(listViewItem.getPID_SQ());
            Trnst.setText(listViewItem.getTRN_STCD());

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

    private void errorNotify(String errorMessage) {
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
