import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsMarksTest {


    StudentsMarks obj=new StudentsMarks();

    @Test
    public void validateInput(){

        String[] arr={"3","102","4","40"};
        Integer[] intArrTest={4,12,14,15,16};
        Double[] doubleArrTest={3.0,12.0,14.9,34.7};
        assertEquals("successfully Saved",obj.validateInput(intArrTest));
        assertEquals("invalid input", obj.validateInput(arr));
        assertEquals("successfully Saved", obj.validateInput(doubleArrTest));
    }








}