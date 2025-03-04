package partB.ex02;
import java.util.Scanner;

public class SwitchLight {
    public static String switchLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code");
        int color = sc.nextInt();

        switch (color){
            case 1:
                response+="Next Traffic Light is green";
                break;
            case 3:
                response+="Next Traffic Light is red";
                break;
            default:
                response+= "invaild color";
        }


        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
