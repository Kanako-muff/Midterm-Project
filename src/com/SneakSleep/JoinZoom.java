package SneakSleep;
import java.util.*;

public class JoinZoom{
    static Random random = new Random();
    static Methods timer = new Methods();
    Students students = new Students();
    static Scanner scanner = new Scanner(System.in);

    public static int connectZoom(){
        //  Prologue
        System.out.println();
        Methods.displayString("    I couldn't get up early in the morning.\n");
        Methods.countdown(1);
        Methods.displayString("    So I'll take today's class remotely.\n");
        Methods.countdown(1);
        Methods.displayString("    Let's join zoom.\n");
        Methods.countdown(1);
        Methods.displayString("    My name is...\n");
        Methods.countdown(1);
        System.out.println();
        System.out.println("=================================================================");
        Methods.displayString("Please enter your name for joining zoom!\n");
        System.out.println("=================================================================");
        System.out.println();
        /*--- Set Student class ready ---*/
        String name = scanner.nextLine();
        Students.yourName = name;
        /*-------------------------------*/
        // System.out.println(Students.yourName);
        Methods.countdown(1);
        Methods.displayString("    I'm " + Students.yourName + ", here we go...\n");
        Methods.countdown(1);
        Methods.displayString("    ...Huh, isn't wifi stable?\n");
        Methods.countdown(1);
        System.out.println();
        System.out.println("=================================================================");
        Methods.displayString(" ▼ Stage 1 ▼\n");
        Methods.countdown(1);
        Methods.displayString("Wifi seems unstable.\n");
        Methods.countdown(1);
        Methods.displayString("If 'Connected' appears on the console, please type [ Enter ] to\n");
        Methods.displayString("join the zoom classroom IMMEDIATELY.\n");
        System.out.println("=================================================================");
        System.out.println();
        Methods.countdown(3);

        // Print 0~15 dots to express "connecting"
        // Get a number to decide how many dots are to be printed
        int rdm = random.nextInt(15);

        for(int i = rdm; i >= 0; i--){
            //  When "connected"
            if(i == 0){
                System.out.println("Connected");
                // TimedScanner tScanner = new TimedScanner();
                // String input = tScanner.nextLine(3000);
                String input = scanner.nextLine();
                if (input == ""){
                    Methods.countdown(1);
                    System.out.println("=================================================================");
                    Methods.displayString("You successfully joined the class!\n");
                    System.out.println("=================================================================");
                    Methods.countdown(2);  
                    System.out.println();
                    System.out.println("＿人人人人人人人＿");
                    System.out.println("＞　STAGE CLEAR　＜");
                    System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y￣");
                    System.out.println();
                    return 1;
                }else{
                    Methods.countdown(1);
                    System.out.println("=================================================================");
                    Methods.displayString("You failed joining the class.\n");
                    System.out.println("=================================================================");
                    return 0;
                }

            //  while waiting for "connected"
            }else{
                System.out.println(".");
                Methods.countdown(1); 
            }
        }
        return 1;
    }
}