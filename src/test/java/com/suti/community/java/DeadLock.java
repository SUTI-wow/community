package com.suti.community.java;


public class DeadLock {
    private static Object resource1= new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource1){
                System.out.println(Thread.currentThread()+" get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                System.out.println(Thread.currentThread()+" waiting resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread()+" get resource2");
                }
            }
        },"thread 1").start();

        new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread()+" get resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                System.out.println(Thread.currentThread()+" waiting resource1");
                synchronized (resource1){
                    System.out.println(Thread.currentThread()+" get resource1");
                }
            }
        },"Thread 2").start();
    }
}
