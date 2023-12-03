package org.example;

public class FrontendDeveloper extends Developer implements FrontMaker{

    @Override
    public void makeFront() {
        System.out.println("front is ready");
    }
}
