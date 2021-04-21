package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
}
