/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class dingshi {

    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTask task = new MyTask();
        //表示在1秒之后开始执行，并且每2秒执行一次
        timer.schedule(task, 1000, 1000);
    }
}

class MyTask extends TimerTask {

    //在run方法中的语句就是定时任务执行时运行的语句。
    @Override
    public void run() {
        System.out.println("Hello!! 现在是：" + new Date());
    }
}
