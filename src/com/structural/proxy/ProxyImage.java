package com.structural.proxy;

import java.util.ArrayList;

/**
 * @author 赵兴君_F
 */
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
        // filter list
        ArrayList<String> suffixList = new ArrayList<>();
        suffixList.add(".jpg");
        suffixList.add(".png");

        return suffixList.stream().anyMatch((it) -> fileName.endsWith(it));
    }
}
