package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

public class IndivAllAccInfoHeader implements Serializable {
    private String GLBL_ID;

    public String getGLBL_ID() {
        return GLBL_ID;
    }

    public void setGLBL_ID(String GLBL_ID) {
        this.GLBL_ID = GLBL_ID;
    }
}
