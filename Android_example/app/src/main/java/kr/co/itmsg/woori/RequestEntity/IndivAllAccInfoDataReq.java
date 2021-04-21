package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IndivAllAccInfoDataReq implements Serializable {
    private IndivAllAccInfoHeaderReq dataHeader;
    private IndivAllAccInfoBodyReq dataBody;
}
