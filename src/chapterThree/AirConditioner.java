package chapterThree;

public class AirConditioner {
     private boolean acIsOn;
     private boolean acIsOff;
     private int temperature = 16;

     public boolean acIsOn() {
          return acIsOn;
     }

     public void getAcIsOn() {
          acIsOn = true;
     }


     public void getACIsOn() {
          acIsOn = true;
     }
     public void getAcIsOff() {
          acIsOn = false;
     }

     public void increaseTemperature() {
          if(acIsOn() && temperature >= 16 && temperature < 30)
               temperature++;
     }
     public int getAcTemperature() {
          return temperature;
     }

     public void decreaseTemperature(){
          if(acIsOn() && temperature > 16 && temperature <= 30)
               temperature--;
     }

}
