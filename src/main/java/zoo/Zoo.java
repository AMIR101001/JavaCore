package zoo;

public class Zoo {
   private static double price = 0;
   private String name;
   private static int counter = 0;
   private Animal[] animals;
   private static int animals_counter = 0;
   private static Zoo more_animals = null;

   public Zoo(double price, String name, Animal[] animals) {
      this.price = price;
      this.name = name;
      this.animals = animals;
      counter++;
      if(animals_counter < animals.length){
         animals_counter = animals.length;
         more_animals = this;
      }
   }
   public static double average_cost(){
      double all_cost =+ price;
      return all_cost / counter;

   }

   public static Zoo get_more_animals(){
      return more_animals;
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
