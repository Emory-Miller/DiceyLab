import org.junit.Test;

class DiceTest {

    @Test
    public void tossAndSumTest (){
        Dice dice = new Dice( 2);
        System.out.println(dice.tossAndSum());
    }

}