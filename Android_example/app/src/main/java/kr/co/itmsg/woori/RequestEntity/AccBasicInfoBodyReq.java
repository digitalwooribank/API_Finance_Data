package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

public class AccBasicInfoBodyReq implements Serializable {
    private String INQ_ACNO;
    private String INQ_BAS_DT;

    public String getINQ_ACNO() {
        return INQ_ACNO;
    }

    public void setINQ_ACNO(String INQ_ACNO) {
        this.INQ_ACNO = INQ_ACNO;
    }

    public String getINQ_BAS_DT() {
        return INQ_BAS_DT;
    }

    public void setINQ_BAS_DT(String INQ_BAS_DT) {
        this.INQ_BAS_DT = INQ_BAS_DT;
    }
}
