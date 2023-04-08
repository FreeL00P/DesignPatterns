package com.freeloop.prototype.deepclone;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/8 14:05
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        DeepProtoType deepProtoType = new DeepProtoType();
//        deepProtoType.setName("松江");
//        deepProtoType.setDeepCloneTarget(new DeepCloneableTarget("牛头","人"));
//        System.out.println("deepProtoType = " + deepProtoType.hashCode());
//        System.out.println("deepProtoType = " + deepProtoType);
//        System.out.println("deepProtoType.getDeepCloneTarget() = " + deepProtoType.deepCloneTarget().hashCode());
//        DeepProtoType clone =(DeepProtoType) deepProtoType.clone();
//        System.out.println("clone = " + clone.hashCode());
//        System.out.println("clone = " + clone);
//        System.out.println("clone.getDeepCloneTarget() = " + clone.deepCloneTarget().hashCode())
        //方式2实现深拷贝
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("松江");
        deepProtoType.setDeepCloneTarget(new DeepCloneableTarget("牛头","人"));
        System.out.println("deepProtoType = " + deepProtoType.hashCode());
        System.out.println("deepProtoType = " + deepProtoType);
        System.out.println("deepProtoType.getDeepCloneTarget() = " + deepProtoType.deepCloneTarget().hashCode());
        DeepProtoType clone =(DeepProtoType) deepProtoType.deepClone();
        System.out.println("clone = " + clone.hashCode());
        System.out.println("clone = " + clone);
        System.out.println("clone.getDeepCloneTarget() = " + clone.deepCloneTarget().hashCode());


    }
}
