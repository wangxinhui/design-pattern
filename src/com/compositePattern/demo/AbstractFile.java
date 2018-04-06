package com.compositePattern.demo;

public abstract class AbstractFile {
    public abstract void addFile(AbstractFile file);

    public abstract void removeFile(AbstractFile file);

    public abstract AbstractFile getFile(int i);

    public abstract void killVirus();
}
