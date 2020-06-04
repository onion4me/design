package com.zhangjian.合成模式;

/**抽象文件对象
 * @author zhangjian
 * @date 2018/7/13
 */
public interface IFile {
    /**
     *  返回自己的实例
     * @return
     */
    IFile getComposite();

    /**
     *  某个商业方法
     */
    void sampleOperation();

    /**
     *  获取深度
     * @return
     */
    int getDeep();

    /**
     *  设置深度
     * @param x
     */
    void setDeep(int x);

}
