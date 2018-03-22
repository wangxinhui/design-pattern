package com.birdgePattern;

public abstract class Image {
    protected ImageImp imageImp;

    public ImageImp getImageImp() {
        return imageImp;
    }

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract void parseFile(String fileName);
}
