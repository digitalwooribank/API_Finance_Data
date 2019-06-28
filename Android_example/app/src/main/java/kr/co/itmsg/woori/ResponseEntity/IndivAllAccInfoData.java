package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

public class IndivAllAccInfoData implements Serializable {
    private IndivAllAccInfoHeader dataHeader;
    private IndivAllAccInfoBody dataBody;

    public IndivAllAccInfoHeader getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(IndivAllAccInfoHeader dataHeader) {
        this.dataHeader = dataHeader;
    }

    public IndivAllAccInfoBody getDataBody() {
        return dataBody;
    }

    public void setDataBody(IndivAllAccInfoBody dataBody) {
        this.dataBody = dataBody;
    }
}
