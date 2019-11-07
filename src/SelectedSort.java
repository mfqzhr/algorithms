import java.util.ArrayList;
import java.util.Arrays;

import static oracle.jrockit.jfr.events.Bits.swap;
/*
    选择排序的思路:
    1,在第一趟循环中找到最小的数字
    2,将最小的数字和内循环第一个数字交换
    3,在第二趟循环中将最小数字初始化为i
 */

public class SelectedSort {

    public static void selectedSort(int [] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.println(a[i]);

        }

    }






    /*public static void selectedSort(int [] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N ; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            //System.out.println(a[min]);
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
            System.out.println(a[i]);
        }



    }
  */



    public static void main(String[] args) {
        int [] a = {3,4,2,7,1,5};
        selectedSort(a);



    }





}
