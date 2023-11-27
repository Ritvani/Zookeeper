public class Bat extends Mammal{

    float energy = 300;

    public void fly(){
        energy = energy - 50;
        System.out.println("Bat is airborne");
    }

    public void eatHumans(){
        energy = energy + 25;
        System.out.println("Bat is satisfied");
    }

    public void attackTown(){
        energy = energy - 100;
        System.out.println("The bat has attacked");
    }
}
