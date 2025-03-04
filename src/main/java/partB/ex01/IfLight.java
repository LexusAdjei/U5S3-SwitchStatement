package partB.ex01;
import java.util.Scanner;

public class IfLight {
    public static String ifLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code");
        int color = sc.nextInt();

        if(color == 1 ){
            response+="Next Traffic Light is green";
        } else if (color == 3) {
            response+="Next Traffic Light is red.";
        } else if (color == 0 || color >= 4 ) {
            response+="Invalid color";
        }





        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
