public class Recursion {


    public static void main(String[] args) {
        int i = 23;
        add(i);

    }

    public static void add(int i) {
        System.out.println(i);
        if (i < 0)
            return;
        else
            add(i-1);
    }
    public  static  void  sum(int[] arr){
        int sum = arr[0];


    }

}
