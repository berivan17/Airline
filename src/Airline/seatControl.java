package Airline;

public class seatControl extends AirlineC {
    
    public void seatsControl(){
        if(!super.isControl()){
            for (String seat : super.getSeats()) {
                System.out.println("You can choose empty seat: "+seat);
            }
        }
        else{
            System.out.println("Sorry!We don't have empty seat");

        }
        
    }
}
