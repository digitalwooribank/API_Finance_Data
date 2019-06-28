package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

public class AccBasicInfoDataReq implements Serializable {
    private AccBasicInfoHeaderReq dataHeader;
    private AccBasicInfoBodyReq dataBody;

    public AccBasicInfoHeaderReq getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(AccBasicInfoHeaderReq dataHeader) {
        this.dataHeader = dataHeader;
    }

    public AccBasicInfoBodyReq getDataBody() {
        return dataBody;
    }

    public void setDataBody(AccBasicInfoBodyReq dataBody) {
        this.dataBody = dataBody;
    }
}
