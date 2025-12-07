package strings;

public class ResultExtractVersion {

    public static void main(String[] args) {
        String filename = "2025_Amazon_001.csv";
        String numberText = ExtractVersion.extractVersion(filename);
        System.out.println(numberText);
    }
    
}
