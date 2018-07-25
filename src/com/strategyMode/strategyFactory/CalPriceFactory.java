package com.strategyMode.strategyFactory;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CalPriceFactory {
	private static final String CAL_PRICE_PACKAGE = "com.strategyMode.strategyFactory";//������һ����������ʾ����ɨ����Եİ�

    private ClassLoader classLoader = getClass().getClassLoader();

    private List<Class<? extends CalPrice>> calPriceList;//�����б�

    //������ҵ��ܽ�������Ӧ�Ĳ���
    public CalPrice createCalPrice(Player player) {
        //�ڲ����б���Ҳ���
        for (Class<? extends CalPrice> clazz : calPriceList) {
            PriceRegion validRegion = handleAnnotation(clazz);//��ȡ�ò��Ե�ע��
            //�жϽ���Ƿ���ע�������
            if (player.getTotalAmount() > validRegion.min() && player.getTotalAmount() < validRegion.max()) {
                try {
                    //�ǵĻ����Ƿ���һ����ǰ���Ե�ʵ��
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("���Ի��ʧ��");
                }
            }
        }
        throw new RuntimeException("���Ի��ʧ��");
    }

    //����ע�⣬���Ǵ���һ�������࣬��������ע��
    private PriceRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i] instanceof PriceRegion) {
                return (PriceRegion) annotations[i];
            }
        }
        return null;
    }

    //����
    private CalPriceFactory() {
        init();
    }

    //�ڹ�����ʼ��ʱҪ��ʼ�������б�
    private void init() {
        calPriceList = new ArrayList<Class<? extends CalPrice>>();
        File[] resources = getResources();//��ȡ���������е�class�ļ�
        Class<CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());//ʹ����ͬ�ļ��������ز��Խӿ�
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException("δ�ҵ����Խӿ�");
        }
        for (int i = 0; i < resources.length; i++) {
            try {
                //������µ���
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resources[i].getName().replace(".class", ""));
                //�ж��Ƿ���CalPrice��ʵ���ಢ�Ҳ���CalPrice����������Ļ����뵽�����б�
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    //��ȡɨ��İ��������е�class�ļ�
    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {//����ֻɨ��class�ļ�
                        return true;
                    }
                    return false;
                }
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("δ�ҵ�������Դ");
        }
    }

    public static CalPriceFactory getInstance() {
        return StrategyFactoryInstance.instance;
    }

    private static class StrategyFactoryInstance {

        private static CalPriceFactory instance = new CalPriceFactory();
    }
}
