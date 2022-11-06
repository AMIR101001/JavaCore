package zoo;

public class ZooService {
    public Zoo moreAnimal(Zoo[] zoos) {
        int animalsCounter = 0;
        Zoo moreAnimals = null;
        for (Zoo zoo : zoos) {
            if (zoo.getAnimals().length > animalsCounter) {
                animalsCounter = zoo.getAnimals().length;
                moreAnimals = zoo;
            }
        }
        return moreAnimals;
    }

    public double averagePrice (Zoo[] zoos){
        int counterZoo = 0;
        double sum = 0;
        for(Zoo zoo : zoos){
            sum =+ zoo.getPrice();
            counterZoo++;
        }
        return sum / counterZoo;
    }
}
