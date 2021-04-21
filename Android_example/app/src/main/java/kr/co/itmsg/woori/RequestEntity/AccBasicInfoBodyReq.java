package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccBasicInfoBodyReq implements Serializable {
    private String INQ_ACNO;
    private String INQ_BAS_DT;
}
