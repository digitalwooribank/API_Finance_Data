package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IndivAllAccInfoBodyGRID implements Serializable {
    private String ACNO;
    private String PDCD;
    private String PRD_NM;
    private String CUCD;
    private String PDOK_BAL;
    private String WDR_AVL_AM;
    private String NEW_DT;
    private String LST_TRN_DT;
    private String XPR_DT;
    private String ADNT_RGS_YN;
    private String ACCT_KND;
}


