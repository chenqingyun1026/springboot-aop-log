package cn.cqy.springaopdemo.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 7628696682586991328L;

    private Integer id;
    private String name;
    private BigDecimal price;
    private Type type;
    private Boolean state;
}
