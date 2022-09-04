package zoo;

public class Zoo {
   private double price = 0;
   private String name;
   private Animal[] animals;

   public Zoo(double price, String name, Animal[] animals) {
      this.price = price;
      this.name = name;
      this.animals = animals;
   }

   public double getPrice() {
      return price;
   }

   public Animal[] getAnimals() {
      return animals;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setAnimals(Animal[] animals) {
      this.animals = animals;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Zoo{" +
              "name='" + name + '\'' +
              '}';
   }
}
