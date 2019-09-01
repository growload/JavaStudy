package com.zde.study.system12306;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 17:52
 */
public class Window extends Thread {

    private String windowName;
    public Window(String windowName){
        this.windowName = windowName;
    }
    @Override
    public void run() {
        this.sellTicket();
    }

    private void sellTicket() {
        while (true){
            System12306 sys = System12306.getInstance();
            Ticket ticket = sys.getTicket();
            if (ticket == null){
                System.out.println("对不起"+windowName+"窗口车票已售完");
                break;
            }
            System.out.println("从"+windowName+"售出："+ticket);
        }

    }


}
