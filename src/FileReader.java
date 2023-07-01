import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private static final List<String> dogs = new ArrayList<>();

    public static List<String> thisADogList(String dog) {
        for (String actualDog : dogs) {
            dogs.add(dog);
        }
        return thisADogList(dog);
    }

    public static List<String> fileReadHandler(String filePath) {
        List<String> strings = new ArrayList<>();
        File file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);
            while ((sc.hasNextLine())) {
                strings.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found!");
        }
        return strings;
    }


}




