package org.example;

public class FullStackDeveloper extends Developer implements FrontMaker, BackMaker {
    @Override
    public void makeBack() {
        System.out.println("fullstack makes back");
    }

    @Override
    public void makeFront() {
        System.out.println("fullstack makes front");
    }
}
