package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccBasicInfoHeader implements Serializable {
    private String GLBL_ID;
}
