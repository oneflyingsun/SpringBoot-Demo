package com.apollo.modules.test1.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;


public class Test1 extends Model<Test1> {

    private static final long serialVersionUID = 1L;

    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Test1{" +
        "id=" + id +
        "}";
    }
}
