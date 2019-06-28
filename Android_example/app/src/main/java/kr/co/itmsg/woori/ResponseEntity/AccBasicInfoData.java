package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

public class AccBasicInfoData implements Serializable {
    private AccBasicInfoHeader dataHeader;
    private AccBasicInfoBody dataBody;

    public AccBasicInfoHeader getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(AccBasicInfoHeader dataHeader) {
        this.dataHeader = dataHeader;
    }

    public AccBasicInfoBody getDataBody() {
        return dataBody;
    }

    public void setDataBody(AccBasicInfoBody dataBody) {
        this.dataBody = dataBody;
    }
}
