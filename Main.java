import java.util.Scanner;

/**
 * Created by mhz on 16/07/17.
 */
public class Main {

    public static void main(String[] args) {

        Diamond diamond = new Diamond();

        System.out.println("enter a letter");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (diamond.getAlphabets().contains(s)){
            System.out.println("Diamond :");
            diamond.diamondPrint(s);
        }
        else {
            System.out.println("error !!");
        }
    }
}
