
import java.util.*;

class Qno1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int no = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Add integers:");
        for (int i = 0; i < no; i++) {
            int n = sc.nextInt();
            al.add(n);
        }

        System.out.println("Elements in ArrayList:");
        for (int n : al) {
            System.out.println(n);
        }
    }
}
