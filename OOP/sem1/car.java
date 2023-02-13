
import java.util.Random;

public class car {
    String model;
    int year;
    double price;
    String color;
    double power;
    boolean status; 
    int speed;
    car(String model, int year, double price, String color, Double power){
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;

    }
    public void GetInfo(){
        System.out.println(model + " " +year + " " + price + " " + color + " " + power + " ");

    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof car)) {
            return false;
        }
        car car = (car) obj; 
        if (model.equals(car.model) && year == car.year && power == car.power){
            return true;
        } else {
            return false;
        }
    }
    

    public void poverCar(){
        this.status = true;
        System.out.println("Car power!!!");
    }
    public void stopCar(){
    this.status = false;
    System.out.println("Car dount power((("); 
    }
    public void road(String addres){
        if (status == false){
            System.out.println("Ne edem(((");
        }else{
            System.out.println("Gogogo bro in mayami and" + addres);
        }
        status = false;
    }
    public void maxSeedCar(){
    Random random = new Random();
    speed = random.nextInt(100-175);
    System.out.println(speed);
    
}
}
