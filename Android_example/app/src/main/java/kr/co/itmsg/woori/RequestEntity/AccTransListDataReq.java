package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

public class AccTransListDataReq implements Serializable {
    private AccTransListHeaderReq dataHeader;
    private AccTransListBodyReq dataBody;

    public AccTransListHeaderReq getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(AccTransListHeaderReq dataHeader) {
        this.dataHeader = dataHeader;
    }

    public AccTransListBodyReq getDataBody() {
        return dataBody;
    }

    public void setDataBody(AccTransListBodyReq dataBody) {
        this.dataBody = dataBody;
    }
}
