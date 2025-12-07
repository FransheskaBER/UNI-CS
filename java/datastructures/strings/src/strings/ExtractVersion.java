package strings;

public class ExtractVersion {

    public static String extractVersion(String filename) {
        int first = filename.lastIndexOf("_");
        int last = filename.lastIndexOf(".");
        String numberText = filename.substring(first + 1, last);
        return numberText;
    }
    
}
