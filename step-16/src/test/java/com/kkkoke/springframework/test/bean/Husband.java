package com.kkkoke.springframework.test.bean;

/**
 * @author KeyCheung
 * @date 2023/06/23
 * @desc
 */
public class Husband {

    private Wife wife;

    public String queryWife(){
        return "Husband.wife";
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}