package nl.sri.vo;

public class DataBoxSubDataVo {
    private String title;
    private String value="";

    public DataBoxSubDataVo() {
    }

    public DataBoxSubDataVo(String title, String value) {
        this.title = title;
        this.value = value;
    }

    public DataBoxSubDataVo(String title, Long value) {
        this.title = title;
        if (value > 0) {
            this.value += '+';
        }
        this.value += value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
