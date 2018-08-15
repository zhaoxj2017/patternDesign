package com.structural.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage (String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (!filterImage(fileName)) {
            return;
        }
        realImage = new RealImage(fileName);
        realImage.display();
    }

    private boolean filterImage(String fileName) {
        if (fileName != null && (fileName.endsWith(".jpg") || fileName.endsWith(".png"))) {
            return true;
        }
        return false;
    }
}
