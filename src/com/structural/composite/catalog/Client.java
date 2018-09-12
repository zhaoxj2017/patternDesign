package com.structural.composite.catalog;

import java.io.File;
/**
 * 组合模式
 *    将对象组合成树形结构
 * 特征：
 *    树形数据结构
 * 关键代码：
 *    结点Node，叶节点Leaf。可以包含一个及以上的叶节点。
 * 关系：
 *    结点包含结点和叶节点
 * 
 */

public class Client {
	private static void createTree(AbstractNode abstractNode) throws Exception {
		File file = new File(abstractNode.name);
		File[] files = file.listFiles();
		for (File f: files) {
			if (f.isFile()) {
				Filer filer = new Filer(f.getAbsolutePath());
				abstractNode.addNode(filer);
			}
			if (f.isDirectory()) {
				Noder noder = new Noder(f.getAbsolutePath());
				abstractNode.addNode(noder);
				createTree(abstractNode);
			}
		}
	} 
	
	public static void main(String[] args) {
		AbstractNode noder = new Noder("src/com/structural/composite/catalog/testDir");
		try {
			createTree(noder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		noder.display();
	}
}
