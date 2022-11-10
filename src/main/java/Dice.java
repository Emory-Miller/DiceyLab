import java.util.Random;
import java.lang.Math;

public class Dice {

    public int numOfRolls;
    public int numOfSides;
    public int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int tossAndSum(){
        Random rand = new Random();
        int sum = 0;
        int randomSum = 0;
        for (int i = 1; i <= numOfDice; i++){
            randomSum += rand.nextInt(6) + 1;
        }
        return randomSum;
    }

}
