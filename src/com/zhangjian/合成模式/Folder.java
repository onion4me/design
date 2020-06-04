package com.zhangjian.合成模式;

import java.util.Vector;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class Folder  implements IFile {
    /** 文件名字 */
    private String name;
    /** 层级深度，根深度为0 */
    private int deep;
    private Vector<IFile> componentVector = new Vector<>();

    public Folder(String name) {
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

    /**
     * 增加一个文件或文件夹
     *
     * @param IFile
     */
    public void add(IFile IFile) {
        componentVector.addElement(IFile);
        IFile.setDeep(this.deep + 1);

    }

    /**
     * 删除一个文件或文件夹
     * @param IFile
     */
    public void remove(IFile IFile) {
        componentVector.removeElement(IFile);
    }

    /**
     *  返回直接子文件（夹）集合
     * @return
     */
    public Vector getAllComponent() {
        return componentVector;
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
