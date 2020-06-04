package com.zhangjian.解释器模式;

import java.util.HashMap;

/**加法解析器
 * @author zhangjian
 * @date 2018/7/13
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    /**
     *  把左右两个表达式运算的结果加起来
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
