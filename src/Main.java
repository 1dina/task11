import java.util.Scanner;


public class Main {
    static int largest;
     static int smallest;
     static int diff;
     static int all ;
     static String case1 = "safe zone";
     static String case2 = "dangerous zone";


    public static void main(String[] args) {
        System.out.println("How many numbers do you want ?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        all = 0 ;

        System.out.println("please enter your numbers :");
        for (int i = 0; i < num; i++) {
            int currentlyNum = in.nextInt();
            if (i == 0) {
                largest = currentlyNum;
                smallest = currentlyNum;
                continue;
            }


            if (currentlyNum > largest) largest = currentlyNum;

            if (currentlyNum < smallest) smallest = currentlyNum;
            if (largest != smallest){
                all ++ ;
            }

        }
        diff = largest - smallest;
        System.out.println("the difference = " + diff);
      System.out.println(equal());
        System.out.println(fun());

    }

    public static String fun() {
        if (diff < (0.5 * largest)) {
            return "\n" + case2;
        } else {
            return "\n" + case1;
        }


    }

    public static String equal() {
        if (smallest == largest )
            return "special case";
        if (all==1) return "special case";


        return "";
    }
}
