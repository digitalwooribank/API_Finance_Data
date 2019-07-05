package kr.co.itmsg.woori.ResponseEntity;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccTransListBody implements Serializable {
    private int GRID_CNT;
    private ArrayList<AccTransListBodyGRID> GRID;
}
