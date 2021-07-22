import java.util.List;

public class CabService {
    private static final int cost_per_km = 10;
    private static final int  cost_per_min = 1;
    private static final int min_cost = 5;

    public double totalFareOfJourney(double distance, int time) {
        double cost = (distance*cost_per_km) + (time* cost_per_min);
        if(cost<min_cost){
            return min_cost ;
        }
        return cost;
    }
    public double totalFareOfJourney(Rides[] rides) {
        double fareForMultipleRide = 0;
        for (Rides ride:rides) {
            fareForMultipleRide += this.totalFareOfJourney(ride.distance, ride.time);
        }
        return fareForMultipleRide;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to CAB INVOICE GENERATOR");
    }

}