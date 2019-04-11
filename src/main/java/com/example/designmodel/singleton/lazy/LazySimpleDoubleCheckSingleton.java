package com.example.designmodel.singleton.lazy;

/**
 * 懒汉式单例+双重检查 保障线程安全
 * 类加载的时候不初始化，类使用的时候初始化
 */
public class LazySimpleDoubleCheckSingleton {

    private static LazySimpleDoubleCheckSingleton lazySingleton = null;
    //构造方法私有化
    private LazySimpleDoubleCheckSingleton(){}
    //提供全局的访问点
    public static synchronized LazySimpleDoubleCheckSingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySimpleDoubleCheckSingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySimpleDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
