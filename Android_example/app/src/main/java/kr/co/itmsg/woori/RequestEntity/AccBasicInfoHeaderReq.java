package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

public class AccBasicInfoHeaderReq implements Serializable {
    private String UTZPE_CNCT_IPAD;
    private String UTZPE_CNCT_MCHR_UNQ_ID;
    private String UTZPE_CNCT_TEL_NO_TXT;
    private String UTZPE_CNCT_MCHR_IDF_SRNO;
    private String UTZ_MCHR_OS_DSCD;
    private String UTZ_MCHR_OS_VER_NM;
    private String UTZ_MCHR_MDL_NM;
    private String UTZ_MCHR_APP_VER_NM;

    public String getUTZPE_CNCT_IPAD() {
        return UTZPE_CNCT_IPAD;
    }

    public void setUTZPE_CNCT_IPAD(String UTZPE_CNCT_IPAD) {
        this.UTZPE_CNCT_IPAD = UTZPE_CNCT_IPAD;
    }

    public String getUTZPE_CNCT_MCHR_UNQ_ID() {
        return UTZPE_CNCT_MCHR_UNQ_ID;
    }

    public void setUTZPE_CNCT_MCHR_UNQ_ID(String UTZPE_CNCT_MCHR_UNQ_ID) {
        this.UTZPE_CNCT_MCHR_UNQ_ID = UTZPE_CNCT_MCHR_UNQ_ID;
    }

    public String getUTZPE_CNCT_TEL_NO_TXT() {
        return UTZPE_CNCT_TEL_NO_TXT;
    }

    public void setUTZPE_CNCT_TEL_NO_TXT(String UTZPE_CNCT_TEL_NO_TXT) {
        this.UTZPE_CNCT_TEL_NO_TXT = UTZPE_CNCT_TEL_NO_TXT;
    }

    public String getUTZPE_CNCT_MCHR_IDF_SRNO() {
        return UTZPE_CNCT_MCHR_IDF_SRNO;
    }

    public void setUTZPE_CNCT_MCHR_IDF_SRNO(String UTZPE_CNCT_MCHR_IDF_SRNO) {
        this.UTZPE_CNCT_MCHR_IDF_SRNO = UTZPE_CNCT_MCHR_IDF_SRNO;
    }

    public String getUTZ_MCHR_OS_DSCD() {
        return UTZ_MCHR_OS_DSCD;
    }

    public void setUTZ_MCHR_OS_DSCD(String UTZ_MCHR_OS_DSCD) {
        this.UTZ_MCHR_OS_DSCD = UTZ_MCHR_OS_DSCD;
    }

    public String getUTZ_MCHR_OS_VER_NM() {
        return UTZ_MCHR_OS_VER_NM;
    }

    public void setUTZ_MCHR_OS_VER_NM(String UTZ_MCHR_OS_VER_NM) {
        this.UTZ_MCHR_OS_VER_NM = UTZ_MCHR_OS_VER_NM;
    }

    public String getUTZ_MCHR_MDL_NM() {
        return UTZ_MCHR_MDL_NM;
    }

    public void setUTZ_MCHR_MDL_NM(String UTZ_MCHR_MDL_NM) {
        this.UTZ_MCHR_MDL_NM = UTZ_MCHR_MDL_NM;
    }

    public String getUTZ_MCHR_APP_VER_NM() {
        return UTZ_MCHR_APP_VER_NM;
    }

    public void setUTZ_MCHR_APP_VER_NM(String UTZ_MCHR_APP_VER_NM) {
        this.UTZ_MCHR_APP_VER_NM = UTZ_MCHR_APP_VER_NM;
    }
}
