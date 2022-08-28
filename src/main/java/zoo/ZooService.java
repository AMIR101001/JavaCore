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
}
