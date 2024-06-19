package Q1;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        CustomCar Ferrari=new CustomCar();
        CustomCar lamborghini=new CustomCar();
        Random r=new Random();
        Ferrari.positionX=0;
        Ferrari.positionY=0;
        lamborghini.positionX=0;
        lamborghini.positionY=0;
        System.out.println("First check the Safety of Ferrari");
        Ferrari.SeatBeltPreTensioner();
        Ferrari.frontCollisionCensor=1;
        Ferrari.AirbagOn();
        Ferrari.ImpactSensingDoorUnlock();
        Ferrari.frontCollisionCensor=0;
        Ferrari.rearCollisionCensor=1;
        Ferrari.RearSideSensor();
        Ferrari.rearCollisionCensor=0;
        Ferrari.Accelerate(60);
        Ferrari.deAccelerate(60);
        Ferrari.Accelerate(60);
        Ferrari.Brake(10);
        Ferrari.ABS();
        Ferrari.rating();
        System.out.println("Now check for Lamborghini");
        lamborghini.SeatBeltPreTensioner();
        lamborghini.frontCollisionCensor=1;
        lamborghini.AirbagOn();
        lamborghini.ImpactSensingDoorUnlock();
        lamborghini.frontCollisionCensor=0;
        lamborghini.rearCollisionCensor=1;
        lamborghini.RearSideSensor();
        lamborghini.rearCollisionCensor=0;
        lamborghini.Accelerate(60);
        lamborghini.deAccelerate(60);
        lamborghini.Accelerate(60);
        lamborghini.Brake(10);
        lamborghini.ABS();
        lamborghini.rating();
        System.out.println("Let's have a Race");
        Ferrari.seatBeltOn();
        lamborghini.seatBeltOn();
        while(Ferrari.Speed!=0||lamborghini.Speed!=0){
            Ferrari.Accelerate(5);
            Ferrari.clutchOn();
            Ferrari.Gearplus();
            lamborghini.Accelerate(5);
            lamborghini.clutchOn();
            lamborghini.Gearplus();
            int a=r.nextInt(10);
              Ferrari.Moveahead(a);
              int b=r.nextInt(10);
              lamborghini.Moveahead(b);
              int c=r.nextInt(10);
              lamborghini.Moveright(c);
              int d=r.nextInt(10);
              Ferrari.Moveright(d);
            if(Ferrari.positionX>=100&&Ferrari.positionY>=100){
              Ferrari.Brake();
            }
            if(lamborghini.positionX>=100&&lamborghini.positionY>=100){
                lamborghini.Brake();
            }
        }
        if(Ferrari.positionX>=100&&Ferrari.positionY>=100){
            System.out.println("Ferrari won the race");
            Ferrari.headlightOn();
            Ferrari.Checkheadlights();
        }
        else{
            System.out.println("lamboghini won the race");
            lamborghini.headlightOn();
            lamborghini.Checkheadlights();
        }
}
}
