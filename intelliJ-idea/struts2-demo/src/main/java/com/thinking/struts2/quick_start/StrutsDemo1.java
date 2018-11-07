package com.thinking.struts2.quick_start;

import java.util.concurrent.*;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/15
 */
public class StrutsDemo1 {

    public String execute() {
        System.out.println("StrutsDemo1中的execute执行了");
        return "success";
    }

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future = executorService.submit(new Task());
//        if(future.isDone()){
            try {
                System.out.println(future.get());
                System.out.println(future.isDone());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
//        }

    }


}


class Task implements Callable{

    @Override
    public Object call() throws Exception {
        return "success";
    }
}
