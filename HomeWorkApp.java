package HW1;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("***First task***");
        printThreeWords();
        System.out.println("\n***Next task***");
        checkSumSign();
        System.out.println("\n***Next task***");
        System.out.println(printColor(0));
        System.out.println(printColor(1));
        System.out.println(printColor(101));
        System.out.println("\n***Next task***");
        System.out.println(compareNumbers(1,15));
        System.out.println(compareNumbers(15,1));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 5;
        int b= 7;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Sum is positive.\n");
        } else{
            System.out.print("Sum is negative.\n");
        }

    }

    public static String printColor(int value){
        if (value <= 0){
            return "Red";
        }else if(value > 0 && value <= 100){
            return "Yellow";
        }else {
            return "Green";
        }
    }

    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }
}


