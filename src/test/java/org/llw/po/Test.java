package org.llw.po;

import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

    @org.junit.Test
    public void Test1(){
        Object key = new Test();
        int n = 1;
        System.out.println(n = key.hashCode()>>>16);
    }
    //HashMap  (n = key.hashCode())^(n>>>16)

    @org.junit.Test
    public void Test2Properties(){
        URL resource = Test.class.getClassLoader().getResource("dd.properties");
        System.out.println(resource);

    }


    @org.junit.Test
    public void test2thread() {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Future<Object> submit = pool.submit(new CallThread());

        System.out.println(submit.toString());
    }



    class CallThread implements Callable {

        @Override
        public Object call() throws Exception {
            System.out.println("111111111111");




            System.out.println("222222222ssss2222222");
            return null;
        }
    }


}
