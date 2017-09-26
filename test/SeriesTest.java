
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class SeriesTest {
    final Integer[] a={1, 3, -1, -20, 5, -6, -8, 3, 4};
    final Integer[] b={3, 4};
    List list = new ArrayList(Arrays.asList(b));
//    ArrayList<Integer> a_out = new ArrayList(Arrays.asList(new Integer[]{3,4}));
    @Test
    public void compare() throws Exception {
        assertEquals(list, new Series().compare(a));
    }

}
