package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;
import java.util.ArrayList;

public class IndivAllAccInfoBody implements Serializable {
    private String GRID_CNT;
    private ArrayList<IndivAllAccInfoBodyGRID> GRID;

    public String getGRID_CNT() {
        return GRID_CNT;
    }

    public void setGRID_CNT(String GRID_CNT) {
        this.GRID_CNT = GRID_CNT;
    }

    public ArrayList<IndivAllAccInfoBodyGRID> getGRID() {
        return GRID;
    }

    public void setGRID(ArrayList<IndivAllAccInfoBodyGRID> GRID) {
        this.GRID = GRID;
    }
}
