package com.example.designmodel.singleton.lazy;

/**
 * 懒汉式单例+Synchrnized 保障线程安全
 * 类加载的时候不初始化，类使用的时候初始化
 * 缺点：可能会发生死锁
 */
public class LazySimpleSynchronizedSingleton {

    private static LazySimpleSynchronizedSingleton lazySingleton = null;
    //构造方法私有化
    private LazySimpleSynchronizedSingleton(){}
    //提供全局的访问点
    public static synchronized  LazySimpleSynchronizedSingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySimpleSynchronizedSingleton();
        }
        return lazySingleton;
    }
}
