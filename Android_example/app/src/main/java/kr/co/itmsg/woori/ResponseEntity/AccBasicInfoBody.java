package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
}
