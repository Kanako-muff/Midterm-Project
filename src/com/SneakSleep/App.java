package SneakSleep;
import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        JoinZoom jZoom = new JoinZoom();
        RollCall rCall = new RollCall();
        Question question = new Question();
        Methods timer = new Methods();
        Scanner scanner = new Scanner(System.in);
        
        //stage1
        if(JoinZoom.connectZoom() == 1){
            Methods.countdown(2);
            Methods.displayString("PRESS ENTER FOR STAGE2 ▶︎\n");

            //stage2
            String input1 = scanner.nextLine();
            if(input1 == "") RollCall.rCall();
            Methods.countdown(2);
            Methods.displayString("PRESS ENTER FOR STAGE3 ▶︎\n");

            //stage3
            String input2 = scanner.nextLine();
            if(input2 == "") Question.question();
            Methods.countdown(2);
            Methods.displayString("PRESS ENTER FOR RESULT ▶︎\n");

            //RESULT
            String input3 = scanner.nextLine();
            if(input3 == ""){
                Methods.countdown(1);
                System.out.println("""
                        ┏---------------------------------------┓
                        |              R E S U L T              |
                        ┗---------------------------------------┛
                        """);
                switch (Students.trustPt) {
                    case 0:
                        Methods.countdown(1);
                        Methods.displayString("You completely lost Kubilay's trust!\n");
                        System.out.println();
                        Methods.countdown(2);
                        System.out.println("＿人人人人人人人人人人人人人＿");
                        System.out.println("＞　BEGINNER SNEAK SLEEPER　＜");
                        System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
                        System.out.println();
                        break;
                    case 1:
                        Methods.countdown(1);
                        Methods.displayString("Kubilay noticed you were sometimes sleeping.\n");
                        System.out.println();
                        Methods.countdown(2);
                        System.out.println("＿人人人人人人人人人人人人＿");
                        System.out.println("＞　AMATEUR SNEAK SLEEPER　＜");
                        System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
                        System.out.println();
                        break;
                    case 2:
                        Methods.countdown(1);
                        Methods.displayString("Kubilay never noticed you were sleeping!\n");
                        System.out.println();
                        Methods.countdown(2);
                        System.out.println("＿人人人人人人人人人人人人人人人＿");
                        System.out.println("＞　PROFESSIONAL SNEAK SLEEPER　＜");
                        System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
                        System.out.println();
                        break;                
                    default:
                        break;
                }
            }

        }else{
            Methods.countdown(2);
            System.out.println();
            System.out.println("＿人人人人人人人＿");
            System.out.println("＞　GAME  OVER　＜");
            System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y￣");
            System.out.println();
        }

    }
}