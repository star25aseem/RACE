package Q1;

public class CustomCar extends Car implements Safety,Seats {
    //collision censors becomes 1 when car collides with anything else it is 0
    int Rating;
    int C=30;
    public int rearCollisionCensor;
    public int frontCollisionCensor;
    public void Vehicletype(){
        System.out.println("Four Wheeler");
    }
    public void VehicleColour(String a){
        System.out.println("The colour of the car is "+a);
    }
    public void Number_of_Seats(){
        System.out.println("No. of seats in this Car is 2 ");
    }
    public void seatType(){
        System.out.println("Forward facing and single sitter");
    }
    public void seatBeltOn(){
        System.out.println("seatbelt is on");
    }
    public void seatBeltOFF(){
        System.out.println("seatbelt is off");
    };
    public void BentBack(int angle){
        System.out.println("seat is bent back by : "+angle);
    }
    public void BentFront(int angle){
        System.out.println("seat is bent front by : "+angle);
    }
    public void SeatBeltPreTensioner(){
        System.out.println("Yes the seatbeltpretensioner is present");
        Rating++;
    }
    public void rating (){
        if(Rating>=5){
            System.out.println("Safety system is good");
        }
        else{
            System.out.println("Safety sytem is bad");
        }
    }
    public void AirbagOn(){
        if(frontCollisionCensor==1){
            System.out.println("air bag is Opened");
        }
        Rating++;
    }
    public void RearSideSensor(){
        if(rearCollisionCensor==1){
            System.out.println("Indicating the driver that there is a chance of collision from back");
        }
        Rating ++;
    }
    public void PanicBrakingSignal(){
         System.out.println("Panic light is ONN");
         Rating++;
    }
    public void Accelerate(int a){
        if(this.Speed>=60){
            SpeedSensingDoorLock();
        }
        this.Speed+=a;
     }
     public void deAccelerate(int a){
        if(a>=30){
            PanicBrakingSignal();
        }
        this.Speed-=a;
     }
    public void ImpactSensingDoorUnlock(){
        if(rearCollisionCensor==1||frontCollisionCensor==1){
            System.out.println("Door is UNlocked");
        }
        Rating ++;
    }
    public void SpeedSensingDoorLock(){
        if(this.Speedometer()>=60){
            System.out.println("Door is locked");
        }
        Rating++;
    }
    public void ABS(){
             System.out.println("ABS is present");
             Rating++;
    }
    public void Checkheadlights(){
        if(headlight==1){
            System.out.println("headlight is ONN");
        }
        else{
            System.out.println("headlight is OFF");
        }
    }
}
