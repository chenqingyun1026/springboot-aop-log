package cn.cqy.springaopdemo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private static final long serialVersionUID = 6371693818486691698L;

    private Integer id;
    private String name;
    private String password;
    private Integer permission;
}
