package com.example.demojava8.designmethod.memento;

/**
 * @ClassName: Caretaker
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-23 11:04
 * @Version 1.0
 **/
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
