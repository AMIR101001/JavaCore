package zoo;

public class Zoo {
   private static double totalPrice = 0;
   private double price = 0;
   private String name;
   private static int counter = 0;
   private Animal[] animals;

   public Zoo(double price, String name, Animal[] animals) {
      this.totalPrice = price;
      this.price = price;
      this.name = name;
      this.animals = animals;
      counter++;
   }

   public static double averageCost(){
      return totalPrice / counter;
   }

   public double getTotalPrice() {
      return totalPrice;
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
