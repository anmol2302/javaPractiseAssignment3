import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck ob;

    @Before
    public void setUp() throws Exception {


        ob = new ConsecutiveCheck();
    }


    @Test
    public void checkInput() {
        String str = "10 2 3 4 5 6 7";
        String str1 = "";
        int num = 12;
        assertEquals("10,2,3,4,5,6,7 are not consecutive numbers", ob.checkConsecutives(str));
        assertEquals("size 0", ob.checkConsecutives(str1));
        assertEquals("invalid input", ob.checkConsecutives(Integer.valueOf(num)));
        assertEquals("1,2,3,4,5,6,7 are consecutive numbers", ob.checkConsecutives("1 2 3 4 5 6 7"));
        assertEquals("54,53,52,51,50,49,48 are consecutive numbers", ob.checkConsecutives("54 53 52 51 50 49 48"));


    }

}