package com.freeloop.prototype.deepclone;

import lombok.Data;

import java.io.Serializable;

/**
 * DeepCloneableTarget
 *
 * @author fj
 * @since 2023/4/8 13:44
 */

public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID =1L;
    private String cloneName;
    private String cloneClass;
    //因为该类的属性都是String，因此我们这里使用默认的克隆的方法完成即可
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String cloneName() {
        return cloneName;
    }

    public DeepCloneableTarget setCloneName(String cloneName) {
        this.cloneName = cloneName;
        return this;
    }

    public String cloneClass() {
        return cloneClass;
    }

    public DeepCloneableTarget setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
        return this;
    }
}
