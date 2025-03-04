package partA.ex01;
import java.util.Scanner;

public class Switch {

    public static String switchStatement(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner sc = new Scanner(System.in);
        System.out.println("What month is it? (Enter Month as Number)");
        int month = sc.nextInt();

        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March (Aka the worst month)");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June (LESS GO, IT'S SUMMER!)");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September (Summer is over...)" );
                break;
            case 10:
                System.out.println("October" );
                break;
            case 11:
                System.out.println("November" );
                break;
            case 12:
                System.out.println("December" );
                break;
            default:
                System.out.println("Invaild month, you idiot.");





        }



        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchStatement();
        System.out.println(switchOutput);
    }
}
