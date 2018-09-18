import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemovalTest {
    VowelRemoval ob;

    @Before
    public void setUp() {
        ob = new VowelRemoval();

    }

    @Test
    public void validateInput() {

        Integer[] arr = {1, 2, 43, 45, 6};
        String[] strarr = {"Agra", "Udaipur","jaipur"};
        assertEquals("invalid input", ob.removeVowels(arr));
        assertEquals("Agr Udpr Jpr", ob.removeVowels(strarr));


    }


}