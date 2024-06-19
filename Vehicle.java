package Q1;
abstract public  class Vehicle{
   public int Speed;
   public int positionX;
   public int positionY;
   abstract void Vehicletype();
   abstract void VehicleColour(String a);
   protected int Speedometer(){
      return this.Speed;
   }
   public void Accelerate(){
      this.Speed++;
   }
   public void deAccelerate(){
      this.Speed--;
   }
   
   public void Brake(){
      this.Speed=0;
   }
   public void Brake(int a){
      while(this.Speed>0){
         this.Speed-=a;
      }
      System.out.println("Applied Brake using ABS");
   }
   public void Moveahead(int time){
      this.positionY+=this.Speed*time;
   }
   public void Moveback(int time){
      this.positionY-=this.Speed*time;
   }
   public void Moveleft(int time){
      this.positionX-=this.Speed*time;
   }
   public void Moveright(int time){
      this.positionX+=this.Speed*time;
   }
}