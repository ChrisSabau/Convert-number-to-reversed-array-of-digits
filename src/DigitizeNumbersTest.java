/**
 * Created by csabau on 5/17/2016.
 */

import org.junit.Test;

import static org.junit.Assert.*;
public class DigitizeNumbersTest {
    @Test
    public void digitizeNumberTest(){
        assertArrayEquals(new int[] {1,3,2,5,3}, DigitizeNumbers.digitize(35231));
    }
    @Test
    public void digitizeLongNumberTest(){
        assertArrayEquals(new int[] {0,2,9,3,9,8,2,6,7,5,4}, DigitizeNumbers.digitize(45762893920L));
        assertArrayEquals(new int[] {4,9,3,8,3,8,2,0,7,8,4,5}, DigitizeNumbers.digitize(548702838394L));
    }
}
