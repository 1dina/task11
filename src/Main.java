import java.util.Scanner;


public class Main {
    public static int largest;
    public static int smallest;
    public static int diff;
    public static int sub ;
    public static String case1 = "safe zone";
    public static String case2 = "dangerous zone";


    public static void main(String[] args) {
        System.out.println("How many numbers do you want ?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        System.out.println("please enter your numbers :");
        for (int i = 0; i < num; i++) {
            int currentlyNum = in.nextInt();
            sub = currentlyNum - sub;
            if (i == 0) {
                largest = currentlyNum;
                smallest = currentlyNum;
                continue;
            }

            if (currentlyNum > largest) largest = currentlyNum;

            if (currentlyNum < smallest) smallest = currentlyNum;

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


        return "";
    }
}
