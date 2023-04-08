package com.freeloop.prototype.deepclone;

import lombok.Data;

import java.io.*;

/**
 * DeepProtoType
 *
 * @author fj
 * @since 2023/4/8 13:52
 */

public class DeepProtoType implements Serializable,Cloneable{
    private String name;
    private DeepCloneableTarget deepCloneTarget;
    public DeepProtoType(){
        super();
    }
    //深拷贝 方法1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        try {
            //这里完成对基本（数据类型）属性的克隆
            deep = super.clone();
            //对引用类型的属性进行单独处理
            DeepProtoType deepProtoType=(DeepProtoType) deep;
            deepProtoType.deepCloneTarget=(DeepCloneableTarget) deepCloneTarget.clone();

        }catch (CloneNotSupportedException e){

        }
        return super.clone();
    }
    //深拷贝，通过对象序列化实现
    public Object deepClone(){
        //创建到流对象
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);//当前对象以对象流方式输出
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            return (DeepProtoType) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                if (bos != null) bos.close();
                if (oos != null) oos.close();
                if (bis != null) bis.close();
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String name() {
        return name;
    }

    public DeepProtoType setName(String name) {
        this.name = name;
        return this;
    }

    public DeepCloneableTarget deepCloneTarget() {
        return deepCloneTarget;
    }

    public DeepProtoType setDeepCloneTarget(DeepCloneableTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
        return this;
    }
}
