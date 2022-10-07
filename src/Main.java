import java.util.Scanner;

class NumberDigits {
    public static void SumOfSeven(int enter_number, int finish_number) {
        int  sum = 0;
        int result = 0;
        for (int num = enter_number; num <= finish_number; num++) {
            if (num % 7 == 0){
                sum+=num%10;
                sum = sum + num / 10;
                result += sum;
                sum = 0;
            }
        }
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumberDigits.SumOfSeven(in.nextInt(),in.nextInt());
    }
}