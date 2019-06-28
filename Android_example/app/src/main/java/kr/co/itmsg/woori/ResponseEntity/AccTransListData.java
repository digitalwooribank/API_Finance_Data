package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;

public class AccTransListData implements Serializable {
    private AccTransListHeader dataHeader;
    private AccTransListBody dataBody;

    public AccTransListHeader getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(AccTransListHeader dataHeader) {
        this.dataHeader = dataHeader;
    }

    public AccTransListBody getDataBody() {
        return dataBody;
    }

    public void setDataBody(AccTransListBody dataBody) {
        this.dataBody = dataBody;
    }
}
