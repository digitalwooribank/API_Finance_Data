package kr.co.itmsg.woori.view;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

import kr.co.itmsg.woori.Http.HttpUrl;
import kr.co.itmsg.woori.R;
import kr.co.itmsg.woori.RequestEntity.AccBasicInfoBodyReq;
import kr.co.itmsg.woori.RequestEntity.AccBasicInfoDataReq;
import kr.co.itmsg.woori.RequestEntity.AccBasicInfoHeaderReq;
import kr.co.itmsg.woori.RequestEntity.AccTransListBodyReq;
import kr.co.itmsg.woori.RequestEntity.AccTransListDataReq;
import kr.co.itmsg.woori.RequestEntity.AccTransListHeaderReq;
import kr.co.itmsg.woori.ResponseEntity.AccBasicInfoData;
import kr.co.itmsg.woori.ResponseEntity.AccTransListBodyGRID;
import kr.co.itmsg.woori.ResponseEntity.AccTransListData;
import kr.co.itmsg.woori.define.Urldefine;

/**
 * 기본계좌조회화면
 */
public class AccBasicInfoActivity extends AppCompatActivity {

    private AccBasicInfoTask accBasicInfoTask = new AccBasicInfoTask();
    private AccBasicInfoData accBasicInfoData;
    private TextView Acno;
    private TextView Actsts;
    private TextView Cucd;
    private TextView Pdcd;
    private TextView Ctbal;
    private TextView Newdt;
    private TextView Xprdt;
    private TextView Txprpdcd;
    private TextView Mmpidam;
    private TextView Tdybspr;
    private TextView Tdyevlam;
    private TextView Ivstprn;
    private TextView Smplprftrt;
    private TextView Ctatcntbal;
    private TextView Lstlnpcsam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc_basic_info);
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
        setTitle.setTitle("기본정보조회");
        Acno = (TextView) findViewById(R.id.acno);
        Actsts = (TextView) findViewById(R.id.actsts);
        Cucd = (TextView) findViewById(R.id.cucd);
        Pdcd = (TextView) findViewById(R.id.pdcd);
        Ctbal = (TextView) findViewById(R.id.ctval);
        Newdt = (TextView) findViewById(R.id.newdt);
        Xprdt = (TextView) findViewById(R.id.xprdt);
        Txprpdcd = (TextView) findViewById(R.id.txprpdcd);
        Mmpidam = (TextView) findViewById(R.id.mmpidam);
        Tdybspr = (TextView) findViewById(R.id.tdybspr);
        Tdyevlam = (TextView) findViewById(R.id.tdyevlam);
        Ivstprn = (TextView) findViewById(R.id.ivstprn);
        Smplprftrt = (TextView) findViewById(R.id.smplprftrt);
        Ctatcntbal = (TextView) findViewById(R.id.ctatcntbal);
        Lstlnpcsam = (TextView) findViewById(R.id.lstlnpcsam);
        accBasicInfoTask.execute();
    }

    /**
     * 통신
     */
    public class AccBasicInfoTask extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute(){
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            String response;

            try {
                AccBasicInfoHeaderReq requestHeader = new AccBasicInfoHeaderReq();
                requestHeader.setUTZPE_CNCT_IPAD("127.0.0.1");
                requestHeader.setUTZPE_CNCT_MCHR_UNQ_ID("");
                requestHeader.setUTZPE_CNCT_TEL_NO_TXT("");
                requestHeader.setUTZPE_CNCT_MCHR_IDF_SRNO("");
                requestHeader.setUTZ_MCHR_OS_DSCD("");
                requestHeader.setUTZ_MCHR_OS_VER_NM("");
                requestHeader.setUTZ_MCHR_MDL_NM("");
                requestHeader.setUTZ_MCHR_APP_VER_NM("");

                AccBasicInfoBodyReq requestBody = new AccBasicInfoBodyReq();
                requestBody.setINQ_ACNO("");
                requestBody.setINQ_BAS_DT("");

                AccBasicInfoDataReq request = new AccBasicInfoDataReq();
                request.setDataHeader(requestHeader);
                request.setDataBody(requestBody);

                String data = new Gson().toJson(request);
                String uri = Urldefine.URL + Urldefine.getAccBasicInfo;
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
                    accBasicInfoData = new Gson().fromJson(s, AccBasicInfoData.class);
                    if(accBasicInfoData != null ){
                        Acno.setText(accBasicInfoData.getDataBody().getACNO());
                        Actsts.setText(accBasicInfoData.getDataBody().getACT_STS());
                        Cucd.setText(accBasicInfoData.getDataBody().getCUCD());
                        Pdcd.setText(accBasicInfoData.getDataBody().getPDCD());
                        Ctbal.setText(accBasicInfoData.getDataBody().getCT_BAL());
                        Newdt.setText(accBasicInfoData.getDataBody().getNEW_DT());
                        Xprdt.setText(accBasicInfoData.getDataBody().getXPR_DT());
                        Txprpdcd.setText(accBasicInfoData.getDataBody().getTXPR_PDCD());
                        Mmpidam.setText(accBasicInfoData.getDataBody().getMM_PID_AM());
                        Tdybspr.setText(accBasicInfoData.getDataBody().getTDY_BSPR());
                        Tdyevlam.setText(accBasicInfoData.getDataBody().getTDY_EVL_AM());
                        Ivstprn.setText(accBasicInfoData.getDataBody().getIVST_PRN());
                        Smplprftrt.setText(accBasicInfoData.getDataBody().getSMPL_PRFT_RT());
                        Ctatcntbal.setText(accBasicInfoData.getDataBody().getCT_ATCNT_BAL());
                        Lstlnpcsam.setText(accBasicInfoData.getDataBody().getLST_LN_PCS_AM());
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
