package program;

public class Main {
  public static void main(String[] args){
      Zoo zoo = new Zoo();
      Giraffe g1 = new Giraffe("Luminita");
      Giraffe g2 = new Giraffe("Georgeta");

      zoo.addAnimal(g1);
      zoo.addAnimal(g2);
      zoo.feedAllAnimals();
  }
}
