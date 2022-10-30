package SneakSleep;
import java.util.*;

public class RollCall {
    static Students students = new Students();
    static Scanner scanner = new Scanner(System.in);
    static Methods timer = new Methods();

    public static void rCall() {       
        //  Prologue
        System.out.println();
        Methods.displayString("    zzz...zzz...zzz\n");
        Methods.countdown(1);
        Methods.displayString("    sleepy...\n");
        Methods.countdown(1);
        System.out.println();
        Methods.displayString("    Kubilay: 'Hey~, let's get started!'\n");
        System.out.println();
        Methods.countdown(1);
        Methods.displayString("    ...Ah, roll call begins.\n");
        Methods.countdown(1);
        System.out.println();
        System.out.println("=================================================================");
        Methods.displayString(" ▼ Stage 2 ▼\n");
        Methods.countdown(1);
        Methods.displayString("Kubilay takes roll call.\n");
        Methods.countdown(1);
        Methods.displayString("Answer 'Here' when your name is called\n");
        Methods.displayString("so that he doesn't notice you're sleeping.\n");
        System.out.println("=================================================================");
        System.out.println();
        Methods.countdown(3);  
        // Roll-call
        for(String stu : Students.stuList){
            Methods.displayString(stu + "\n");
            Methods.countdown(1);
            if(stu.equals(Students.yourName.toUpperCase())){
                String reply = scanner.nextLine();
                if(reply.equalsIgnoreCase("HERE")){
                    Methods.countdown(1);
                    Methods.displayString("    Kubilay: '...OK, " + Students.yourName + " is here.'\n");
                    System.out.println();
                    System.out.println("=================================================================");
                    Methods.displayString("You successfully pretended to be awake!\n");
                    System.out.println("=================================================================");
                    System.out.println();
                    Methods.countdown(2);
                    System.out.println("＿人人人人人人人＿");
                    System.out.println("＞　STAGE CLEAR　＜");
                    System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y￣");
                    System.out.println();
                    break;
                }else{
                    Methods.countdown(1);
                    Methods.displayString("    Kubilay: '...haha, " + Students.yourName + " is sleeping.'\n");
                    System.out.println();
                    System.out.println("=================================================================");
                    Methods.displayString("Kubilay noticed you are sleeping!\n");
                    Methods.countdown(2);
                    Methods.displayString("You lose his trust little bit.\n");
                    Students.trustPt -= 1;    // trustPt = 1
                    System.out.println("=================================================================");
                    System.out.println();
                    Methods.countdown(2);
                    System.out.println("＿人人人人人人人人＿");
                    System.out.println("＞　STAGE FAILED　＜");
                    System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y￣");
                    System.out.println();              
                    break;
                }
            }
        }
    }
}
