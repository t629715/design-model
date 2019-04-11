package com.example.designmodel.singleton.innerclass;

/**
 * 内部类式单例
 * 没有用到synchronized 没有性能问题
 * 巧妙用到内部类的加载特性
 * JVM底层的执行逻辑  完美避免了线程安全问题
 */
public class InnerClassSingleton {
    private InnerClassSingleton(){}
    public static final InnerClassSingleton getInstance(){
        return SingletonHolder.innerClassSingleton();
    }

    private static class SingletonHolder{
        private static final InnerClassSingleton innerClassSingleton(){
            return new InnerClassSingleton();
        }
    }
}
