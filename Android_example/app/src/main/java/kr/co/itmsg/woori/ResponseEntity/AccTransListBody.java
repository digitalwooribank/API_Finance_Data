package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;
import java.util.ArrayList;

public class AccTransListBody implements Serializable {
    private int GRID_CNT;
    private ArrayList<AccTransListBodyGRID> GRID;

    public int getGRID_CNT() {
        return GRID_CNT;
    }

    public void setGRID_CNT(int GRID_CNT) {
        this.GRID_CNT = GRID_CNT;
    }

    public ArrayList<AccTransListBodyGRID> getGRID() {
        return GRID;
    }

    public void setGRID(ArrayList<AccTransListBodyGRID> GRID) {
        this.GRID = GRID;
    }
}
