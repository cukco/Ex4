class Car{
    private int currentSpeed = 0;
    public void acclerate(){
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
    }
    public void acclerate(int speed){
        currentSpeed +=speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }
    public void acclerate(int speed, int seconds){
        int increase = speed * seconds;
        currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
    }
    public void printStatus(){
        System.out.printf("Current speed: %d km/h",currentSpeed);
    }
}
public class Ex104 {
    public static void main(String[] args){
        Car merc=new Car();
        merc.acclerate();
        merc.acclerate(100);
        merc.acclerate(100,2);
        merc.printStatus();

    }
}
