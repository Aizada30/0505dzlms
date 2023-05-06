public class Car {

    private String $nameofCar;
   private  String color;
    private String nameofHuman;


    public Car(String nameofCar,String color,String nameofHuman){
        this.$nameofCar = nameofCar;
        this.color=color;
        this.nameofHuman=nameofHuman;
    }

    public String getNameofCar(){
        return $nameofCar;
   }
 public String getColor() {
     return color;
 }
   public String getNameofHuman(){
        return nameofHuman;
   }

    @Override
    public String toString() {
        return "Car{" +
                "nameofCar='" + $nameofCar + '\'' +
                ", color='" + color + '\'' +
                ", nameofHuman='" + nameofHuman + '\'' +
                '}';
    }
}
