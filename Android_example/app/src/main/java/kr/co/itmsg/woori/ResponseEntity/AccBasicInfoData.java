package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccBasicInfoData implements Serializable {
    private AccBasicInfoHeader dataHeader;
    private AccBasicInfoBody dataBody;
}
