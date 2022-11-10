
public class Simulation {
    public int numOfSims;
    public int numOfDice;
    public Bins bin = new Bins(2, 12);

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printSimulation();
    }

    public Simulation(int numOfDice, Integer numOfSims) {
        this.numOfSims = numOfSims;
        this.numOfDice = numOfDice;
    }

    public void runSimulation() {

        Dice dice = new Dice(numOfDice);
        int result;
        for (int i = 0; i < numOfSims; i++) {
            result = dice.tossAndSum();
            bin.incrementBin(result);
        }
    }

    public void printSimulation() {
        System.out.println("***");
        System.out.println("Simulation of " + numOfDice + " dice tossed for " + numOfSims + " times.");
        System.out.println("***");
        System.out.println(" ");
        for (int i = 2; i <= 12; i++) {
            System.out.println(String.format("%2s : %10s : %.2f %% of total : %s", i, bin.getBin(i).toString(), bin.getBinPercentTotal(i), bin.printBinPercentToStarts(i)));
        }
    }


}