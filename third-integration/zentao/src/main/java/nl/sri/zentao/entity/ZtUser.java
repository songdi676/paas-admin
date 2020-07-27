package nl.sri.zentao.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer dept;

    private String account;

    private String password;

    private String realname;

    private String role;

    private String nickname;

    private String commiter;

    private String avatar;

    private LocalDate birthday;

    private String gender;

    private String email;

    private String skype;

    private String qq;

    private String yahoo;

    private String gtalk;

    private String wangwang;

    private String mobile;

    private String phone;

    private String address;

    private String zipcode;

    @TableField("`join`")
    private LocalDate join;

    private Integer visits;

    private String ip;

    private Integer last;

    private Integer fails;

    private LocalDateTime locked;

    private String ranzhi;

    private Integer score;

    @TableField("scoreLevel")
    private Integer scoreLevel;

    private String deleted;

    private String status;


}
