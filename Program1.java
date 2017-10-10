class Lampka{
    public boolean stan;
    public int intensywnosc;
    public Zarowka zar;

    public Lampka(){
      stan = false;
      intensywnosc=0;
      zar = new Zarowka();

    }



    //włączenie lampki,
    public void On(){
    stan=true;
    zar.on=true;
    System.out.println("Świece! ");



    }
    //wyłączenie lampki
    public void Off(){
      stan=false;
      zar.on=false;
      System.out.println("Nie świece !  ");

    }
    //rozjaśnienie lampki (próba rozjaśnienia lampki do poziomu wyższego niż 10 powoduje
    //spalenie żarówki),
    public void VolumeUp(){
      if(zar.on==true){
          intensywnosc++;
            System.out.println("Świece na : " +intensywnosc);
      }
      if(intensywnosc>=10){

        System.out.println("Uwaga Żarówka się spaliła! " );
        stan= false;
        zar.on=false;
        zar.broken=true;

      }


    }
    //ściemnienie lampki (ściemnienie lampki do poziomu 0 powoduje jej wyłączenie)
    public void VolumeDown(){
      if(zar.on==true){
        intensywnosc--;
        System.out.println("Świece na : " +intensywnosc);
      }
      if(intensywnosc==0){
          System.out.println("Uwaga Żarówka zgasła! " );
          stan= false;
          zar.on=false;



      }
    }
    //wymianę żarówki (możliwe tylko jeśli lampka jest wyłączona); zwracana wartość czy
    //wymieniono żarówkę,
    public void Change(){
      if(stan == false){
          System.out.println("Wymieniono żarówke ! ");
      }
      else
      System.out.println("Wymiana nie mozliwa , lamkpa jest włączona ! ");

    }
    //sprawdzenie czy lampka jest włączona,
    public void ifOn(){
      if(stan==true){
        System.out.println("Lampka jest włączona ! ");
      }
      else
      System.out.println("Lampka jest wyłączona  ! ");

    }
    //sprawdzenie czy żarówka świeci,
    public void ifOff(){
      if(zar.on == true){
        System.out.println("Żarówka świeci ! ");

      }
      else
      System.out.println("Żarówka nie świeci ! ");


    }
    //sprawdzenie czy żarówka jest spalona.
    public void ifBurn(){
      if(zar.broken == true){
        System.out.println("Żarówka jest spalona  ! ");
      }
      else
      System.out.println("Żarówka działa ! ");
    }
}

class Zarowka{
  public boolean on;
  public boolean broken;
  public Zarowka(){
    on=false;
    broken=false;
  }

//zapalenie żarówki,
  public void turnON(){
    if(on==true){
      System.out.println("Żarówka świeci! ");
    }
    else
    System.out.println("Żarówka nie świeci ");


  }
  public void turnOFF(){
    if(on==false){

      System.out.println("Żarówka nie świeci ");
    }
    else
    System.out.println("Żarówka świeci");


  }
  //sprawdzenie czy żarówka świeci
  public void zarON(){
    if(on==true){
      System.out.println("Żarówka świeci! ");
    }
    else
    System.out.println("Żarówka nie świeci ");


  }
  //sprawdzenie czy żarówka jest spalona.
  public void zarOFF(){
    if(broken==true){
      System.out.println("Żarówka nie świeci , jest spalona");
    }
    else
    System.out.println("Żarówka świeci! ");


  }


}

public class Program1{
 public static void main(String[] args){

   Lampka ob1= new Lampka();
   ob1.On();
   ob1.Off();
   ob1.On();

   for(int i=0; i<12; i++){
     ob1.VolumeUp();
   }

   /*
   ob1.intensywnosc = 10;
   for(int i=10; i>0; --i){
     ob1.VolumeDown();
   }
   */
  // ob1.Change();
  ob1.ifBurn();
  ob1.ifOff();
 }
}
