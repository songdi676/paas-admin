package nl.sri.zentao.entity.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PieDataBaseList {

    private String name;

    private String type = "line";

    private String stack = "";
    private Integer barWidth = 20;

    private List<Object> data = new ArrayList<>();

    public PieDataBaseList() {
    }

    public PieDataBaseList(String name, List<Object> data) {
        this.name = name;
        this.data = data;
    }

    public List<Object> addData(Object item) {
        data.add(item);
        return data;
    }

}
