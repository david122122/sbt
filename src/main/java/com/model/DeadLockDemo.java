package com.model;

public class DeadLockDemo extends Thread{
    String lockA ;
    String lockB;
    public DeadLockDemo(String name,String lockA,String lockB){
        super(name);
        this.lockA = lockA;
        this.lockB = lockB;
    }
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() + "拿到了" + lockA + ",等待拿到" + lockB);
            try {
                Thread.sleep(1000);
                synchronized (lockB){
                    System.out.println(Thread.currentThread().getName() + "拿到了" + lockB);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
