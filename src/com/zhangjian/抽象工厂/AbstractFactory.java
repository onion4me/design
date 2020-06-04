package com.zhangjian.抽象工厂;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class AbstractFactory extends AbstractFactoryConcrete {

    @Override
    Product getProduct() {
        return new Product();
    }

}
