package cn.ynm.jsonUtil;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResultBean {
    private int code;
    private String msg;
    private List<UserBean> muser;
}
