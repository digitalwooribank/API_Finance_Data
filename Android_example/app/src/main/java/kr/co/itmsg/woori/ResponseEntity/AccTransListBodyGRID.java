package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

public class AccTransListBodyGRID implements Serializable {
    private String TRN_DT;
    private String TRN_TM;
    private String CUCD;
    private String PBOK_PRNG_OTLN_CD;
    private String DPS_RAP_KDCD;
    private String MD_KDCD;
    private String RCV_AM;
    private String PAY_AM;
    private String DPS_BAL;
    private String TRN_TXT;
    private String RQSPE_NM;
    private String PID_SQ;
    private String TRN_STCD;

    public String getTRN_DT() {
        return TRN_DT;
    }

    public void setTRN_DT(String TRN_DT) {
        this.TRN_DT = TRN_DT;
    }

    public String getTRN_TM() {
        return TRN_TM;
    }

    public void setTRN_TM(String TRN_TM) {
        this.TRN_TM = TRN_TM;
    }

    public String getCUCD() {
        return CUCD;
    }

    public void setCUCD(String CUCD) {
        this.CUCD = CUCD;
    }

    public String getPBOK_PRNG_OTLN_CD() {
        return PBOK_PRNG_OTLN_CD;
    }

    public void setPBOK_PRNG_OTLN_CD(String PBOK_PRNG_OTLN_CD) {
        this.PBOK_PRNG_OTLN_CD = PBOK_PRNG_OTLN_CD;
    }

    public String getDPS_RAP_KDCD() {
        return DPS_RAP_KDCD;
    }

    public void setDPS_RAP_KDCD(String DPS_RAP_KDCD) {
        this.DPS_RAP_KDCD = DPS_RAP_KDCD;
    }

    public String getMD_KDCD() {
        return MD_KDCD;
    }

    public void setMD_KDCD(String MD_KDCD) {
        this.MD_KDCD = MD_KDCD;
    }

    public String getRCV_AM() {
        return RCV_AM;
    }

    public void setRCV_AM(String RCV_AM) {
        this.RCV_AM = RCV_AM;
    }

    public String getPAY_AM() {
        return PAY_AM;
    }

    public void setPAY_AM(String PAY_AM) {
        this.PAY_AM = PAY_AM;
    }

    public String getDPS_BAL() {
        return DPS_BAL;
    }

    public void setDPS_BAL(String DPS_BAL) {
        this.DPS_BAL = DPS_BAL;
    }

    public String getTRN_TXT() {
        return TRN_TXT;
    }

    public void setTRN_TXT(String TRN_TXT) {
        this.TRN_TXT = TRN_TXT;
    }

    public String getRQSPE_NM() {
        return RQSPE_NM;
    }

    public void setRQSPE_NM(String RQSPE_NM) {
        this.RQSPE_NM = RQSPE_NM;
    }

    public String getPID_SQ() {
        return PID_SQ;
    }

    public void setPID_SQ(String PID_SQ) {
        this.PID_SQ = PID_SQ;
    }

    public String getTRN_STCD() {
        return TRN_STCD;
    }

    public void setTRN_STCD(String TRN_STCD) {
        this.TRN_STCD = TRN_STCD;
    }
}
