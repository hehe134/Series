
import org.junit.Test;




import static org.junit.Assert.*;


public class SeriesTest {
    final Integer[] a1={1, 3, -1, -20, 5, -6, -8, 3, 4};
    final Integer[] b1={1,3};
    final Integer[] b2={3, 4};
    final Integer[] a2={2,7,-1,-2,4,-5,1};
    final Integer[] b3={2,7,-1,-2,4};


    @Test
    public void compare() throws Exception {
        assertFalse(new Series().compare(a1,b1));
        assertTrue(new Series().compare(a1,b2));
        assertTrue(new Series().compare(a2,b3));
    }

}
