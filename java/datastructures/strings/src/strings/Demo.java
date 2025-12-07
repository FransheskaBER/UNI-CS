package strings;

public class Demo {
    public static void main(String[] args) {
        String filename = "2025_Amazon_001.csv";
        String manufacturer = StringExercise.extractManufacturer(filename);
        System.out.println(manufacturer);
    }
}

