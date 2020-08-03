package nl.sri.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBoxVo {
    private String title;
    private int count;
    private boolean showIcon;
    private String icon;
    private String color;
    private List<DataBoxSubDataVo> subData = new ArrayList<>();
    ;

    public DataBoxVo() {
    }

    public DataBoxVo(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public DataBoxVo(String title, int count, Map<String, Long> statusMap) {
        this.title = title;
        this.count = count;
        statusMap.forEach((k, v) -> {
            DataBoxSubDataVo dataBoxSubDataVo = new DataBoxSubDataVo(k, v);
            this.subData.add(dataBoxSubDataVo);
        });
    }

    public void addSub(String k, String v) {
        DataBoxSubDataVo dataBoxSubDataVo = new DataBoxSubDataVo(k, v);
        this.subData.add(dataBoxSubDataVo);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isShowIcon() {
        return showIcon;
    }

    public void setShowIcon(boolean showIcon) {
        this.showIcon = showIcon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<DataBoxSubDataVo> getSubData() {
        return subData;
    }

    public void setSubData(List<DataBoxSubDataVo> subData) {
        this.subData = subData;
    }
}
