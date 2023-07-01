import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // dog
        List<String> lines = FileReader.fileReadHandler("dog.txt");
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        for (var line : lines) {
            String[] lineAsArray = line.split(",");
            String nev = lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            String color = lineAsArray[2];

            Dog actualDog = new Dog(lineAsArray[0], Integer.parseInt(lineAsArray[1]),
                    lineAsArray[2]);
            animals.add(actualDog);

        }
        for (var actualDog : dogs) {
            System.out.println(actualDog);
        }

        // chicken
        List<String> otherLines = FileReader.fileReadHandler("chicken.txt");
        List<Chicken> chickens = new ArrayList<>();

        for (var line : otherLines) {
            String[] lineAsArray = line.split(",");
            int eggPerSec = Integer.parseInt(lineAsArray[0]);
            double weight = Integer.parseInt(lineAsArray[1]);

            Chicken actualChicken = (new Chicken(Integer.parseInt(lineAsArray[0]),
                    Double.parseDouble(lineAsArray[1])));
            animals.add(actualChicken);
        }
         for (var actualChicken : chickens) {
             System.out.println(actualChicken);
         }

         // máshogy, ha a vegyes.txt-ből
        List<String> linesOther2 = FileReader.fileReadHandler("vegyes.txt");
         List<Animal> animals1 = new ArrayList<>();

        for (String line : linesOther2) {
            String[] linesAsArray = line.split(",");
            switch (linesAsArray[0]) {
                case "csirke" -> animals1.add(new Chicken(Integer.parseInt(linesAsArray[1]),
                        Double.parseDouble(linesAsArray[2])));
                case "kutya" -> animals1.add(new Dog(linesAsArray[1], Integer.parseInt(linesAsArray[2]),
                        linesAsArray[3]));

            }
        }

        for (var actual : animals) {
            System.out.println(actual);
        }


    }
}
