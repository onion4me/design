package com.zhangjian.解释器模式;

import java.util.HashMap;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public abstract class Expression {

    /**
     *  解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);

}