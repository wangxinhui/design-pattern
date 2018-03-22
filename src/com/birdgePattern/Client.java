package com.birdgePattern;

public class Client {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImp imageImp = new WindowsImage();
        image.setImageImp(imageImp);
        image.parseFile("ee");
    }
}
