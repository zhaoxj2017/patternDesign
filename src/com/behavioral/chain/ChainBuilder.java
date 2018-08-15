package com.behavioral.chain;

/**
 * 通过建造者模式来生成链
 */
public class ChainBuilder {
    AbstractLogger headLogger;  // 头指针
    AbstractLogger logger;  // 控制指针移动

    ChainBuilder (AbstractLogger logger) {
        this.logger = logger;
        this.headLogger = logger;
    }

    public ChainBuilder addNextChain(AbstractLogger logger) {
        // 创建责链
        this.logger.setNextLogger(logger);
        this.logger = logger;
        return this;
    }
}
