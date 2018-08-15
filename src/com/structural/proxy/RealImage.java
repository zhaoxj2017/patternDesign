package com.structural.proxy;

public class RealImage implements Image {
    String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("open the image : " + fileName);
    }
}
