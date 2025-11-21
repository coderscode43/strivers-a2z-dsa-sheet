package Step_01_Learn_the_basic.Lec_01_Things_to_know_in_Java;

public class Topic_3_Loops {
    static void forLoop() {
        // Use When: You know exactly how many times you want to repeat something.
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
    }

    static void whileLoop() {
        // Use When: You don’t know the number of iterations and want to loop as long as a condition is true.
        int num = 0;
        while (num < 10) {
            System.out.println(num);
            num++;
        }
    }

    static void doWhileLoop() {
        // Use When: You want the loop to run at least once, even if the condition is false.
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    static void forEachLoop(){
        // Use When: You want to iterate through arrays or collections easily.
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // forLoop();
        // whileLoop();
        // doWhileLoop();
        forEachLoop();
    }
}
