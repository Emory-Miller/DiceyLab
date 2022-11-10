import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bins {

    private final TreeMap<Integer, Integer> theBins;
    private Integer totalIncrements = 0;

    public Bins(final Integer firstInteger, final Integer lastInteger){
        theBins = new TreeMap<Integer, Integer>();
        for (Integer i = firstInteger ; i <= lastInteger; i++){
            theBins.put(i, 0);
        }
    }

    public void incrementBin(final Integer binNumber){
        theBins.put(binNumber, theBins.get(binNumber)+1);
        totalIncrements++;
    }

    public Integer getBin(final Integer binNumber){
        return theBins.get(binNumber);
    }

    public Float getBinPercentToal(final Integer binNumber){
        return (theBins.get(binNumber) / (float) totalIncrements);
    }

    public Integer numberofBins(){
        return theBins.size();
    }

    public Set<Map.Entry<Integer, Integer>> entrySet(){
        return theBins.entrySet();
    }

}
