package com.zhangjian.代理模式;

/**真实主题角色,这里指红酒工厂角色,它实现了SellInterface接口
 * @author zhangjian
 * @date 2018/7/13
 */
public class RedWineFactory implements SellInterface{
    //持有一个RedWineFactory对象的引用
    private RedWineFactory redWineFactory;

    //销售总量
    private static int sell_count = 0;

    @Override
    public Object sell(){
        if(checkUser()){//在通过代理主题角色,我们可以在真实主题角色被调用前做一些诸如权限判断的事情
            Object obj = redWineFactory.sell();
            sell_count ++;//同样,在调用后我们也可以执行一些额外的动作.
            return obj ;
        }else{
            throw new RuntimeException();
        }
    }

    protected boolean checkUser(){
        //do something
        return true;
    }
}
