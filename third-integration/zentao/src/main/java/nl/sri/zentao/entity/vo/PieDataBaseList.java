package nl.sri.zentao.entity.vo;

import java.util.List;

public class PieDataBaseList {

    private String name;

    private String type = "line";

    private String stack = "";

    private List<String> data;

    public PieDataBaseList(){}

    public PieDataBaseList(String name, List<String> data){
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
