package kr.co.itmsg.woori.RequestEntity;

import java.io.Serializable;

public class IndivAllAccInfoDataReq implements Serializable {
    private IndivAllAccInfoHeaderReq dataHeader;
    private IndivAllAccInfoBodyReq dataBody;

    public IndivAllAccInfoHeaderReq getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(IndivAllAccInfoHeaderReq dataHeader) {
        this.dataHeader = dataHeader;
    }

    public IndivAllAccInfoBodyReq getDataBody() {
        return dataBody;
    }

    public void setDataBody(IndivAllAccInfoBodyReq dataBody) {
        this.dataBody = dataBody;
    }
}
