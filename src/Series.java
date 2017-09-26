import java.util.ArrayList;

import java.util.List;

public class Series {

   public List compare(Integer[] a) {

        List c = new ArrayList();

            int max = 0, sum = 0, i = 0;
           List b = new ArrayList();

            while (i < a.length) {
                sum += a[i];
                b.add(String.valueOf(a[i]));
                if (sum < 0) {
                    sum = 0;
                    b.clear();
                }
                i++;
                if (sum > max) {
                    max = sum;
                    c = b;
                }
            }
       return c;
    }
//
//    public static void main(String[] args) {
//        Series series = new Series();
//        int[] a = {1, 3, -1, -20, 5, -6, -8, 3, 4};
//        series.compare(a);
//    }
}