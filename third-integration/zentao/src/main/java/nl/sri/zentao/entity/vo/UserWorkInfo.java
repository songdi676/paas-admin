package nl.sri.zentao.entity.vo;

import lombok.Data;
import nl.sri.zentao.entity.ZtUser;

@Data
public class UserWorkInfo extends ZtUser {
    private Integer project;
    private Integer totalManHour;
    private Integer expendManHour;
    private Integer leftManHour;
    private Integer bugs;
    private Integer resolveBugs;
    private Integer tasks;
    private Integer finishedTasks;

}
