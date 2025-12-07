package strings;

public class StringExercise {

    public static String extractManufacturer(String filename) {

        if (filename == null) return "";

        int first = filename.indexOf("_");
        int last= filename.lastIndexOf("_");
        String manufacturer = filename.substring(first + 1, last);

        String prettyText = manufacturer.replace("_", " ").toUpperCase();
        
        return prettyText;
    }
}

