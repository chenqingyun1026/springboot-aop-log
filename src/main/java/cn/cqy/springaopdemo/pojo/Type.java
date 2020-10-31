package cn.cqy.springaopdemo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Type implements Serializable {

    private static final long serialVersionUID = 8294675478345392208L;

    private Integer id;
    private String name;
}
