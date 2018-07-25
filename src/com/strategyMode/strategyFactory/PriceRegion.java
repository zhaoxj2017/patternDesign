package com.strategyMode.strategyFactory;

import java.lang.annotation.*;

//������Ч�۸�����ע�⣬���Ը����������Ч���������
@Target(ElementType.TYPE)		//��ʾֻ�ܸ�����Ӹ�ע��
@Retention(RetentionPolicy.RUNTIME)		//�������Ҫ��ע�Ᵽ��������ʱ
public @interface PriceRegion {
	int max() default Integer.MAX_VALUE;
    int min() default Integer.MIN_VALUE;
}
