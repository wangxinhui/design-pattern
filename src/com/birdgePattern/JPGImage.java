package com.birdgePattern;

public class JPGImage extends Image{
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImp.doPaint(matrix);
        System.out.println(fileName + " type is jpg");
    }
}
