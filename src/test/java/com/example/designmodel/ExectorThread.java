package com.example.designmodel;

import com.example.designmodel.singleton.lazy.LazySimpleSingleton;

/**
 * 测试多线程
 */
public class ExectorThread  implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);
    }
}
