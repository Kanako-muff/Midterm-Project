package SneakSleep;
import java.util.*;

public class Question {
    static Students students = new Students();
    static Scanner scanner = new Scanner(System.in);
    static Methods timer = new Methods();
    static Random random = new Random();
    static StringBuilder stringBuilder = new StringBuilder();

    public static void question() {       
        //  Prologue
        System.out.println();
        Methods.displayString("    zzz...zzz...zzz\n");
        Methods.countdown(1);
        Methods.displayString("    sleepy...\n");
        Methods.countdown(1);
        Methods.displayString("    It`s 12:00.\n");
        Methods.countdown(1);
        Methods.displayString("    It's almost end of the class.\n");
        Methods.countdown(1);
        System.out.println();
        Methods.displayString("    Kubilay: 'Any questions?'\n");
        Methods.countdown(1);
        Methods.displayString("    Kubilay: 'Aya, do you have any questions?'\n");
        Methods.countdown(1);
        Methods.displayString("    Aya: 'No'\n");
        Methods.countdown(1);
        Methods.displayString("    Kubilay: 'Mari?'\n");
        Methods.countdown(1);
        Methods.displayString("    Mari: 'No'\n");
        Methods.countdown(1);
        Methods.displayString("    Kubilay: 'Don't you have any questions, guys?'\n");
        Methods.countdown(1);
        Methods.displayString("    Guys: '...'\n");
        Methods.countdown(1);
        Methods.displayString("    Kubilay: 'Really?'\n");
        Methods.countdown(1);
        Methods.displayString("    Kubilay: 'Ok, Let me ask you some questions...'\n");
        Methods.countdown(1);
        Methods.displayString("    Kubilay: '" + Students.yourName + ", you go first.'\n");
        Methods.countdown(1);
        System.out.println();
        Methods.displayString("    zzz.........   ME??\n");
        Methods.countdown(1);
        System.out.println();
        System.out.println("=================================================================");
        Methods.displayString(" ▼ Stage 3 ▼\n");
        Methods.countdown(1);
        Methods.displayString("You are called on by Kubilay to answer a question,\n");
        Methods.displayString("unfortunately.\n");
        Methods.countdown(1);
        Methods.displayString("However, because of your sleepiness, it's sometimes\n");
        Methods.displayString("too hard to hear what is he talking about.\n");
        Methods.countdown(1);
        Methods.displayString("Please try to guess the question and choose a correct answer\n");
        Methods.displayString("even if you are extremely sleepy.\n");
        System.out.println("=================================================================");
        System.out.println();
        Methods.countdown(3);  
        
        //Sleepiness Level
        double sl = 0.0;
        String slComment = "";
        int sgRdm = random.nextInt(10);
        switch (sgRdm) {
            case 0:
            case 1:
                sl = 0.0;
                slComment = "Erm...";
                break;
            case 2:
            case 3:
                sl = 0.2;
                slComment = "Erm, I couldn't hear a little cuz of my sleepiness...";
                break;
            case 4:
            case 5:
                sl = 0.4;
                slComment = "Erm, I couldn't hear a little cuz of my sleepiness...";
                break;
            case 6:
            case 7:
                sl = 0.6;
                slComment = "Oh my gosh...! I'm too sleepy to listen...";
                break;
            case 8:
            case 9:
                sl = 0.8;
                slComment = "Oh my gosh...! I'm too sleepy to listen...";
                break;
            default:
                break;
        }

        // Garble texts
        String qSentence = "Which province does not border British Columbia";
        StringBuilder stringBuilder = new StringBuilder(qSentence);
        int i = 0;
        while(i != Math.round(qSentence.length() * sl)){
            int r = random.nextInt(qSentence.length());
            if(stringBuilder.charAt(r) != '*' && stringBuilder.charAt(r) != ' '){
                stringBuilder.setCharAt(r, '*');
            }
            i++;
        }

        // Methods.countdown(2);
        System.out.println();
        Methods.displayString("Q. " + stringBuilder + " ?\n");
        System.out.println();
        Methods.countdown(2);
        Methods.displayString(slComment + "\n");
        Methods.countdown(1);
        Methods.displayString("The answer is...\n");
        Methods.countdown(1);
        System.out.println();
        System.out.println("--------------------------------");
        Methods.displayString("1. Alberta\n");
        Methods.countdown(1);
        Methods.displayString("2. Ontario\n");
        Methods.countdown(1);
        Methods.displayString("3. Washington\n");
        Methods.countdown(1);
        Methods.displayString("4. Yukon\n");
        System.out.println("--------------------------------");
        System.out.println();
        int input = scanner.nextInt();
        if (input == 2){
            Methods.countdown(1);
            Methods.displayString("    Kubilay: 'Correct!'\n");
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
        }else{
            Methods.countdown(1);
            Methods.displayString("    Kubilay: '...haha, " + Students.yourName + " is sleeping.\n'");
            System.out.println();
            System.out.println("=================================================================");
            Methods.displayString("Kubilay noticed you are sleeping!\n");
            Methods.countdown(1);
            Methods.displayString("You lose his trust little bit.\n");
            Students.trustPt -= 1;    // trustPt = 1
            System.out.println("=================================================================");
            System.out.println();
            Methods.countdown(2);
            System.out.println("＿人人人人人人人人＿");
            System.out.println("＞　STAGE FAILED　＜");
            System.out.println("￣Y^Y^Y^Y^Y^Y^Y^Y￣");
            System.out.println();
        }
    }
}