package SneakSleep;

import java.util.Scanner;
import java.util.TimerTask;

public class Methods extends Thread{
    // Countdown
    static void countdown(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    
    // Display letters one by one
    static void displayStringHelper(double sec){    // countdown Double sec
        try {
            Thread.sleep((long) (sec * 100));
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    static void displayString(String str){
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
            displayStringHelper(0.5);
        }
    }
}







    // static boolean inputFlag=false;

    // static TimerTask countDownWithTimer(String str) {

        
    //     return task;
    // }

    // Time limitation for 
    // static void timelimit(int sec){
    //     try {
    //         Thread.sleep(sec * 1000);

    //     } catch(InterruptedException e){
    //         e.printStackTrace();
            
    //     }
    // }
