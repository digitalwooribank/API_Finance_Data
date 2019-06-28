package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

public class AccTransListBodyReq implements Serializable {
    private String INQ_ACNO;
    private String INQ_STA_DT;
    private String INQ_END_DT;

    public String getINQ_ACNO() {
        return INQ_ACNO;
    }

    public void setINQ_ACNO(String INQ_ACNO) {
        this.INQ_ACNO = INQ_ACNO;
    }

    public String getINQ_STA_DT() {
        return INQ_STA_DT;
    }

    public void setINQ_STA_DT(String INQ_STA_DT) {
        this.INQ_STA_DT = INQ_STA_DT;
    }

    public String getINQ_END_DT() {
        return INQ_END_DT;
    }

    public void setINQ_END_DT(String INQ_END_DT) {
        this.INQ_END_DT = INQ_END_DT;
    }
}
