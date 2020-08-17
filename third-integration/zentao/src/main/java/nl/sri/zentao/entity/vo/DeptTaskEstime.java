package nl.sri.zentao.entity.vo;

import lombok.Data;
import nl.sri.zentao.entity.ZtTaskestimate;

@Data
public class DeptTaskEstime extends ZtTaskestimate {
    private Integer dept;
    private String deptName;

    public static DeptTaskEstime sum(DeptTaskEstime a, DeptTaskEstime b) {
        Float sum =a.getConsumed() + b.getConsumed();
        a.setConsumed(sum);
        return a;
    }
}
