package com.zhangjian.解释器模式;

import java.util.HashMap;

/**减法解析器
 * @author zhangjian
 * @date 2018/7/13
 */
public class SubExpression  extends SymbolExpression{

    public SubExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    // 左右两个表达式相减

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
