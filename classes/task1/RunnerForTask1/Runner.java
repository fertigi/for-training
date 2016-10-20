package RunnerForTask1;

import by.gsu.epamlab.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] trips = new BusinessTrip[5];
        trips[0] = new BusinessTrip("Evgeni Ledenyuo", 400,10);
        trips[2] = new BusinessTrip("Evgeni Ledenyuo", 300,5);
        trips[3] = new BusinessTrip("Evgeni Ledenyuo", 100,2);
        trips[4] = new BusinessTrip();
        trips[4].setEmployee("Evgeni Ledenyuo");
        trips[4].setCountDay(20);
        trips[4].setTransExpenses(1000);

        for (BusinessTrip trip : trips){
            if (trip != null)
            trip.show();
        }

        trips[4].setTransExpenses(2000);

        System.out.println("Duration = " + (trips[0].getCountDay() + trips[2].getCountDay()));

        for (BusinessTrip trip : trips){
            if (trip != null)
                System.out.println(trip);
        }
    }
}
