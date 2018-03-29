package com.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void addFile(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void removeFile(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getFile(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("**search folder ***" +name +" kill virus!");
        for (AbstractFile file:fileList) {
            file.killVirus();
        }
    }
}
