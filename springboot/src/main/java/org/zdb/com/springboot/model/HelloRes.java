package org.zdb.com.springboot.model;

import java.io.Serializable;

/**
 * 响应的实体类
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public class HelloRes implements Serializable{

    private static final long serialVersionUID = -5974330335633177615L;
    private int code;
    private String content;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HelloRes(int code, String content, String msg) {
        this.code = code;
        this.content = content;
        this.msg = msg;
    }
}
