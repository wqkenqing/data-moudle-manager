package com.data.manager.model.es;

import lombok.Data;
import sun.jvm.hotspot.types.CIntegerField;

import java.util.Date;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/26
 * @desc
 */
@Data
public class People {

    private String name;
    private int age;
    private Date birthday;
    private String address;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
