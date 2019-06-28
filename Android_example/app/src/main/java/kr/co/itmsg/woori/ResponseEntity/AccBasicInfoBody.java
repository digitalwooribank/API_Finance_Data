package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

public class AccBasicInfoBody implements Serializable {
    private String ACNO;
    private String ACT_STS;
    private String CUCD;
    private String PDCD;
    private String CT_BAL;
    private String NEW_DT;
    private String XPR_DT;
    private String TXPR_PDCD;
    private String MM_PID_AM;
    private String TDY_BSPR;
    private String TDY_EVL_AM;
    private String IVST_PRN;
    private String SMPL_PRFT_RT;
    private String CT_ATCNT_BAL;
    private String LST_LN_PCS_AM;

    public String getACNO() {
        return ACNO;
    }

    public void setACNO(String ACNO) {
        this.ACNO = ACNO;
    }

    public String getACT_STS() {
        return ACT_STS;
    }

    public void setACT_STS(String ACT_STS) {
        this.ACT_STS = ACT_STS;
    }

    public String getCUCD() {
        return CUCD;
    }

    public void setCUCD(String CUCD) {
        this.CUCD = CUCD;
    }

    public String getPDCD() {
        return PDCD;
    }

    public void setPDCD(String PDCD) {
        this.PDCD = PDCD;
    }

    public String getCT_BAL() {
        return CT_BAL;
    }

    public void setCT_BAL(String CT_BAL) {
        this.CT_BAL = CT_BAL;
    }

    public String getNEW_DT() {
        return NEW_DT;
    }

    public void setNEW_DT(String NEW_DT) {
        this.NEW_DT = NEW_DT;
    }

    public String getXPR_DT() {
        return XPR_DT;
    }

    public void setXPR_DT(String XPR_DT) {
        this.XPR_DT = XPR_DT;
    }

    public String getTXPR_PDCD() {
        return TXPR_PDCD;
    }

    public void setTXPR_PDCD(String TXPR_PDCD) {
        this.TXPR_PDCD = TXPR_PDCD;
    }

    public String getMM_PID_AM() {
        return MM_PID_AM;
    }

    public void setMM_PID_AM(String MM_PID_AM) {
        this.MM_PID_AM = MM_PID_AM;
    }

    public String getTDY_BSPR() {
        return TDY_BSPR;
    }

    public void setTDY_BSPR(String TDY_BSPR) {
        this.TDY_BSPR = TDY_BSPR;
    }

    public String getTDY_EVL_AM() {
        return TDY_EVL_AM;
    }

    public void setTDY_EVL_AM(String TDY_EVL_AM) {
        this.TDY_EVL_AM = TDY_EVL_AM;
    }

    public String getIVST_PRN() {
        return IVST_PRN;
    }

    public void setIVST_PRN(String IVST_PRN) {
        this.IVST_PRN = IVST_PRN;
    }

    public String getSMPL_PRFT_RT() {
        return SMPL_PRFT_RT;
    }

    public void setSMPL_PRFT_RT(String SMPL_PRFT_RT) {
        this.SMPL_PRFT_RT = SMPL_PRFT_RT;
    }

    public String getCT_ATCNT_BAL() {
        return CT_ATCNT_BAL;
    }

    public void setCT_ATCNT_BAL(String CT_ATCNT_BAL) {
        this.CT_ATCNT_BAL = CT_ATCNT_BAL;
    }

    public String getLST_LN_PCS_AM() {
        return LST_LN_PCS_AM;
    }

    public void setLST_LN_PCS_AM(String LST_LN_PCS_AM) {
        this.LST_LN_PCS_AM = LST_LN_PCS_AM;
    }
}
