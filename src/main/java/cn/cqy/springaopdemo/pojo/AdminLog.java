package cn.cqy.springaopdemo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminLog implements Serializable {

    private static final long serialVersionUID = -291495801959706565L;

    private Integer id; //日志记录id
    private Integer userId;//操作人id
    private String userName;//操作人name
    private String loginip;//登录ip
    private int type;
    private String url;
    private String operation;
    private String createtime;
    private String remark;

}
