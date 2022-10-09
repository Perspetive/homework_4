import java.util.Scanner;
class MyArrays{
    public static double avgOf4Digit( int[] array) {
        double average = 0.0;
        if (array.length > 0) {
            double sum = 0.0;
            for ( int i = 0; i < array.length; i++){
                sum+=array[i];
            }
            average = sum / array.length;
        }
        return average;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_length = in.nextInt();
        int[] stock_array = new int[array_length];
        for(int j = 0; j<array_length; j++){
            stock_array[j] = in.nextInt();
        }
        System.out.println(MyArrays.avgOf4Digit(stock_array));
    }
}