import java.util.Arrays;
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

    public static int[] minToBegin(int[] array, int shift){

        int length = array.length;
        int min_value = Arrays.stream(array).min().getAsInt();
        int[] tempArray = Arrays.copyOf(array, array.length);
        for(int i = 0; i < shift; i++);{
            int temp = tempArray[tempArray.length - 1];
            for(int j = tempArray.length - 1; j > 0; j--){
                tempArray[j] = tempArray[j - 1];
                tempArray[0] = min_value;
            }
        }
        return tempArray;

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
        System.out.println(Arrays.toString(stock_array));
        System.out.println(Arrays.toString(MyArrays.minToBegin(stock_array, 1)));
    }
}