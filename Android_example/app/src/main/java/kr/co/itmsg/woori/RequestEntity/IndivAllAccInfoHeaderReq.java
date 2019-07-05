package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IndivAllAccInfoHeaderReq implements Serializable {
    private String UTZPE_CNCT_IPAD;
    private String UTZPE_CNCT_MCHR_UNQ_ID;
    private String UTZPE_CNCT_TEL_NO_TXT;
    private String UTZPE_CNCT_MCHR_IDF_SRNO;
    private String UTZ_MCHR_OS_DSCD;
    private String UTZ_MCHR_OS_VER_NM;
    private String UTZ_MCHR_MDL_NM;
    private String UTZ_MCHR_APP_VER_NM;
}
