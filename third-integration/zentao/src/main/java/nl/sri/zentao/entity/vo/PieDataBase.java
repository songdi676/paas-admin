package nl.sri.zentao.entity.vo;

public class PieDataBase {

    private String name;

    private Object value;

    public PieDataBase() {
    }

    public PieDataBase(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
