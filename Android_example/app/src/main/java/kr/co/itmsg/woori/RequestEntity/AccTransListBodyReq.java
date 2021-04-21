package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccTransListBodyReq implements Serializable {
    private String INQ_ACNO;
    private String INQ_STA_DT;
    private String INQ_END_DT;
}
