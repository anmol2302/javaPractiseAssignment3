import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
ConsecutiveCheck ob;
    @Before
    public void setUp() throws Exception {


    ob=new ConsecutiveCheck();
    }


    @Test
    public void checkInput(){
        String str="173249801489999999999999999999999999999999999999999999996013260 2 3 4 5 6 7";
        String str1="";
        int num=12;
        assertEquals("no",ob.checkConsecutives(str));
        assertEquals("size 0",ob.checkConsecutives(str1));
        assertEquals("invalid input",ob.checkConsecutives(Integer.valueOf(num)));
        assertEquals("yes",ob.checkConsecutives("1 2 3 4 5 6 7"));





    }

}