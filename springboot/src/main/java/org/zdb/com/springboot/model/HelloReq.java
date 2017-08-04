package org.zdb.com.springboot.model;

import java.io.Serializable;

/**
 * 请求的实体类
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public class HelloReq implements Serializable{

    private static final long serialVersionUID = -8351643877854926390L;
    private int id;
    private String name;

    public HelloReq(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
