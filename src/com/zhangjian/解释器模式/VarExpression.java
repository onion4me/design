package com.zhangjian.解释器模式;


import java.util.HashMap;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String _key) {
        this.key = _key;
    }

    // 从map中取之
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
