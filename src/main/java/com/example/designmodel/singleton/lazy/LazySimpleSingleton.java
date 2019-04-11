package com.example.designmodel.singleton.lazy;

/**
 * 懒汉式单例
 * 类加载的时候不初始化，类使用的时候初始化
 * 缺点：线程不安全
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySingleton = null;
    //构造方法私有化
    private LazySimpleSingleton(){}
    //提供全局的访问点
    public static LazySimpleSingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySimpleSingleton();
        }
        return lazySingleton;
    }
}
