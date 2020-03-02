package com.example.demo.multiThreat;

import org.testng.annotations.Test;

public class multiThread {
    /**
     * nvocationCount----表示执行的次数
     * threadPoolSize-----表示线程池的内线程的个数
     * timeOut-------超时时间-毫秒
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void thread1(){

        System.out.printf("线程数:%s%n",Thread.currentThread().getId() );

    }

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void thread2(){

        System.out.printf("线程数:%s%n",Thread.currentThread().getId() );

    }

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void thread3(){

        System.out.printf("线程数:%s%n",Thread.currentThread().getId() );

    }

}
