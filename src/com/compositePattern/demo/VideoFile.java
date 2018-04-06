package com.compositePattern.demo;

public class VideoFile extends AbstractFile{

    private String name;
    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void addFile(AbstractFile file) {
        System.out.println("sorry , cat't support the method");
    }

    @Override
    public void removeFile(AbstractFile file) {
        System.out.println("sorry , cat't support the method");
    }

    @Override
    public AbstractFile getFile(int i) {
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("----search video file " +name+" kill virus!");
    }
}
