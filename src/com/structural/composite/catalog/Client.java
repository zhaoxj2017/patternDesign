package com.structural.composite.catalog;

import java.io.File;
/**
 * 
 * @author ���˾�_F
 * ���ģʽ
 * ��������ϳ����νṹ
 * �ؼ�����
 * ���Node��Ҷ�ڵ�Leaf�����԰���һ�������ϵ�Ҷ�ڵ㡣
 * ��ϵ
 * ����������Ҷ�ڵ�
 * 
 */

public class Client {
	private static void createTree(Node node) throws Exception {
		File file = new File(node.name);
		File[] files = file.listFiles();
		for (File f: files) {
			if (f.isFile()) {
				Filer filer = new Filer(f.getAbsolutePath());
				node.addNode(filer);
			}
			if (f.isDirectory()) {
				Noder noder = new Noder(f.getAbsolutePath());
				node.addNode(noder);
				createTree(node);
			}
		}
	} 
	
	public static void main(String[] args) {
		Node noder = new Noder("src/com/structural/composite/catalog/testDir");
		try {
			createTree(noder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		noder.display();
	}
}
