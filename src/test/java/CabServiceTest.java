import org.junit.Assert;
import org.junit.Test;

public class CabServiceTest {


    @Test
    public void givenDistanceAndTime_whenCostPerKilometrePerMin_shouldReturnTotalFare() {
        CabService cabInvoice = new CabService();
        double totalFare = cabInvoice.totalFareOfJourney(7,15);
        Assert.assertEquals(85,totalFare, 0.0);
    }
    @Test
    public void givenDistanceAndTime_whenCostPerKilometrePerMin_shouldReturnMinimumFare() {
        CabService cabInvoice = new CabService();
        double totalFare = cabInvoice.totalFareOfJourney(0.1, 2);
        Assert.assertEquals(5, totalFare, 0.0);
    }
}