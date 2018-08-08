package com.creator.factory_abstract;

import com.creator.factory_abstract.alibaba_factory.AlibabaFactory;
import com.creator.factory_abstract.tencent_factory.TencentFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		switch (factoryType) {
		case "alibaba":
			return new AlibabaFactory();
		case "tencent":
			return new TencentFactory();
		default:
			return null;
		}
	}
}
