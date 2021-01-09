package com.controller;

import com.common.SimpleResponse;
import com.model.DeadLockDemo;
import com.model.Dog;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Controller
public class DogController implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    @RequestMapping(value = "/getdog")
    @ResponseBody
    public String getDog(@RequestParam(value = "name") String name){
        //DispatcherServlet dispatcherServlet = (DispatcherServlet) applicationContext.getBean("dispatcherServlet");
        //List<HandlerMapping> handlerMappings = dispatcherServlet.getHandlerMappings();
        //ContextLoaderListener contextLoaderListener
        List<byte[]> array = new ArrayList<>();
        for(int i=0;i<300;i++){
            array.add(new byte[1024*1024*2]);
        }
        return "my"+"|"+name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @RequestMapping(value = "/testBlock")
    @ResponseBody
    public String testBlock(){
        new Thread(){
            public void run(){
                lock1.lock();
                try{
                    for(int i=0;i<10000;i++){
                        if(i==9999){
                            lock2.lock();
                            try{
                                System.out.println(Thread.currentThread().getName()+":运行数据:"+i);
                            }catch (Exception e1){
                                e1.printStackTrace();
                            }finally{
                                lock2.unlock();
                            }
                        }else{
                            System.out.println(Thread.currentThread().getName()+":运行数据:"+i);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally{
                    lock1.unlock();
                }
            }
        }.start();

        new Thread(){
            public void run(){
                lock2.lock();
                try{
                    for(int i=0;i<10000;i++){
                        if(i==9999){
                            lock1.lock();
                            try{
                                System.out.println(Thread.currentThread().getName()+":运行数据:"+i);
                            }catch (Exception e1){
                                e1.printStackTrace();
                            }finally{
                                lock1.unlock();
                            }
                        }else{
                            System.out.println(Thread.currentThread().getName()+":运行数据:"+i);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally{
                    lock2.unlock();
                }
            }
        }.start();
        return "success";
    }

    @RequestMapping(value = "/querydog",method = RequestMethod.GET)
    @ResponseBody
    public SimpleResponse queryDog(int num){
        int i  = 100/num;
        return new SimpleResponse(new Dog());
    }

    @RequestMapping(value = "/getRecource",method = RequestMethod.GET)
    @ResponseBody
    public String getRecource(){
        return "aa";
    }

    public void getSun(List<String []> list){
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("+++++++");
        String[] a = new  String[50];
        list.add(a);
        getSun(list);
    }

}
