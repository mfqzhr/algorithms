
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static int[] readInts(String name) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = null;
        while (sc.hasNextInt()) {
            q.add(sc.nextInt());
        }
        int N  = q.size();
        int[] a = new int[N];
        for (int i = 0; i <N ; i++) {
            a[i] = q.remove();
        }
        return  a;
    }
}
