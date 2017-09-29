import java.util.ArrayList;

import java.util.List;

public class Series {

    public List MAX(Integer[] a) {
        List c = new ArrayList();
        int max = 0, sum = 0, i = 0;
        List b = new ArrayList();

        while (i < a.length) {
            sum += a[i];
            b.add(a[i]);
            if (sum < 0) {
                sum = 0;
                b.clear();
            }
            i++;
            if (sum > max) {
                c.clear();
                c .addAll(b);
                max = sum;
            }
        }
//        System.out.println(max+" "+c);
        return c;

    }

    public boolean compare(Integer[] a, Integer[] b) {
        boolean flag = true;
        List x = MAX(a);
        if (x.size() == b.length) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) != b[i]) {
                    flag = false;
                    break;
                }
            }
        } else flag = false;
        return flag;
    }
}