package Q1;

public abstract class Car extends Vehicle {
    protected int NumberOfGears;
    protected int C;
    protected int headlight;
    public int GearNum;
    class Gear{
        public int lowerSpeedLimit;
        public int UpperSpeedLimit;
    }      
    //clutch is ON if clutch==1 and OFF if clutch==0
    protected int clutch;
    
    protected int Headlight;

    public void Vehicletype(){
        System.out.println("Four Wheeler");
    }
    public void VehicleColour(String a){
        System.out.println("The colour of the car is "+a);
    }
     public void headlightOn(){
           this.headlight=1;
        
     }
     public void headlightOFF(){
       this.headlight=0;
     }
     public void Checkheadlights(){
        if(headlight==0){
            System.out.println("headlight is ONN");
        }
        if(headlight==1){
            System.out.println("headlight is OFF");
        }
     }
     public void clutchOn(){
        this.clutch=1;
     }
     public void clutchOFF(){
        this.clutch=0;
     }
     public void Gearplus(){
        Gear G=new Gear();
      // lower Speed limit of gearnum++  
     G.lowerSpeedLimit=(this.GearNum)*C;
     int L=G.lowerSpeedLimit;
          if(clutch==1 && this.Speed>=L){
                  this.GearNum++;
                  this.clutchOFF();
          }
     }
     public void Gearminus(){
        Gear F=new Gear();
        //upper speed limit of gearnum--
        F.UpperSpeedLimit=(this.GearNum-1)*C;
        int U=F.lowerSpeedLimit;
        if(clutch==1 && this.Speed<=U){
            this.GearNum--;
            this.clutchOFF();
        }
     }
     abstract public void Accelerate(int a);
     abstract public void deAccelerate(int a);
     
}
