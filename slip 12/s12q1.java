
Create package – 

package series;

public class SquareSeries {
    public void generateSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
        System.out.println();
    }
}

Class –
import series.SquareSeries;
import java.util.Scanner;

public class SquareSeriesExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n) for the square series: ");
        int n = scanner.nextInt();

        SquareSeries series = new SquareSeries();
        System.out.print("Square Series: ");
        series.generateSeries(n);
    }
} 

