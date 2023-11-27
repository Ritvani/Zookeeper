public class Gorilla extends Mammal{

    public void throwSomething(){
        energy = energy - 5;
        System.out.println("Gorilla has thrown something");
    }

    public void eatBananas(){
        energy = energy + 10;
        System.out.println("Gorilla is satisfied");
    }

    public void climb(){
        energy = energy - 10;
        System.out.println("Gorilla has climbed a tree");
    }


}
