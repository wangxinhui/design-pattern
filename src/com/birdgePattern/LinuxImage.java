package com.birdgePattern;

public class LinuxImage implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("linux show");
    }
}
