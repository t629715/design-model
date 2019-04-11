package com.example.designmodel.singleton.hungry;

/**
 * 饿汉式单例
 * 缺点：在首次加载时就创建单例  无论用没用的到 浪费内存
 */
public class HungrySingleton {
    //构造方法私有化
    private static final HungrySingleton  hungrySinfleton = new HungrySingleton();
    //提供全局的访问点
    public static HungrySingleton getInstance(){
        return hungrySinfleton;
    }
}
