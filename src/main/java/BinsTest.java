import org.junit.Assert;
import org.junit.Test;


public class BinsTest {

    @Test
    public void getBinTest() {
        Bins bins = new Bins(2, 12);
        Integer expected = 0;
        Integer actual = bins.getBin(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest() {
        Bins bins = new Bins(2, 12);
        Integer expected = 2;
        bins.incrementBin(2);
        bins.incrementBin(2);
        Integer actual = bins.getBin(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinPercentTotalTest() {
        Bins bins = new Bins(2, 12);
        float expected = 1.0F;
        bins.incrementBin(2);
        bins.incrementBin(2);
        float actual = bins.getBinPercentTotal(2);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void numberofBinsTest() {
        Bins bins = new Bins(2, 12);
        Integer expected = 11;
        Integer actual = bins.numberofBins();
        Assert.assertEquals(expected, actual);
    }
}