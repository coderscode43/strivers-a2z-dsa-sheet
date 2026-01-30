package Step_01_Learn_the_basic.Lec_04_Know_Basic_Maths;

public class BasicMathProblems {

    static void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }

    static void reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int modulus = num % 10;
            reversedNum = reversedNum * 10 + modulus;
            num /= 10;
        }
        System.out.println(reversedNum);
    }

    static void palindrome(int num) {
        int copyOfNum = num;
        int reversedNum = 0;
        while (copyOfNum > 0) {
            int modulus = copyOfNum % 10;
            reversedNum = reversedNum * 10 + modulus;
            copyOfNum /= 10;
        }
        if (reversedNum == num) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }

    public static void main(String[] args) {
        int num = 48554;
//        countDigits(num);
//        reverseNumber(num);
        palindrome(num);
    }

}
