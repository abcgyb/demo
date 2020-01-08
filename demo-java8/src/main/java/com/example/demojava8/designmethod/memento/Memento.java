package com.example.demojava8.designmethod.memento;

/**
 * @ClassName: Memento
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-23 10:19
 * @Version 1.0
 **/
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
