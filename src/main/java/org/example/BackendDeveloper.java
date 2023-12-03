package org.example;

public class BackendDeveloper extends Developer implements BackMaker{
    @Override
    public void makeBack() {
        System.out.println("back is ready");
    }

}
