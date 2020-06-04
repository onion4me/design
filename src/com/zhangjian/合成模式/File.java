package com.zhangjian.合成模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class File implements IFile {
    private String name; // 文件名字
    private int deep; // 层级深度

    public File(String name) {
        this.name = name;
    }

    /**
     * 返回自己的实例
     */
    @Override
    public IFile getComposite() {
        return this;
    }

    /**
     * 某个商业方法
     */
    @Override
    public void sampleOperation() {
        System.out.println("执行了某个商业方法！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDeep() {
        return deep;
    }

    @Override
    public void setDeep(int deep) {
        this.deep = deep;
    }
}
