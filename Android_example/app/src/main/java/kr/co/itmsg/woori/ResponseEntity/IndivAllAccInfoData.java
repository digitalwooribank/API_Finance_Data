package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IndivAllAccInfoData implements Serializable {
    private IndivAllAccInfoHeader dataHeader;
    private IndivAllAccInfoBody dataBody;
}
