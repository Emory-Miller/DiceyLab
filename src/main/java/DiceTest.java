import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

class DiceTest {

    @Test
    public void tossAndSumTest(){
        Dice dice = new Dice( 2);
        int[] array = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        boolean actual = true;
        boolean expected = Arrays.asList(array).contains(dice.tossAndSum());
        Assert.assertEquals(actual, expected);
    }

}