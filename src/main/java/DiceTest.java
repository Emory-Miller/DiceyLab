import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DiceTest {

    @Test
    public void constructorTest() {
        int expected = 2;
        Dice dice = new Dice(2);
        int actual = dice.numOfDice;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest1() {
        int expected = 100;
        Dice dice = new Dice(100);
        int actual = dice.numOfDice;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest() {
        Dice dice = new Dice(2);
        Integer[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int number = dice.tossAndSum();
        boolean actual = true;
        boolean expected = Arrays.asList(array).contains(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void tossAndSumTest2() {
        Dice dice = new Dice(3);
        Integer[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int number = dice.tossAndSum();
        boolean actual = true;
        boolean expected = Arrays.asList(array).contains(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void tossAndSumTestFailTest() {
        Dice dice = new Dice(2);
        Integer[] array = {1, 13, 14, 15, 16, 17, 18};
        int number = dice.tossAndSum();
        boolean actual = false;
        boolean expected = Arrays.asList(array).contains(number);
        Assert.assertEquals(actual, expected);
    }

}