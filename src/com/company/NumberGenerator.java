package com.company;

public class NumberGenerator implements Runnable{
    @Override
    public void run(){
        int count = 10;
        for (int i = count; i > 0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Hết giờ");
    }
}
