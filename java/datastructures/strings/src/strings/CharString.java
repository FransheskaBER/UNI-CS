package strings;


public class CharString {
    public static void main(String[] args) {
        // String city = "Tel Aviv";
        // Strinc cityCopy = new String("Tel Aviv");

        int age1 = 29;
        String sentence = "Age: " + age1;
        System.out.println(sentence);

        // String result = "";
        // for (int i = 0; i < 1000; i++) {
        //     result = result + "data" + i + ",";  // Creates new objects each time
        // }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            buffer.append("data").append(i).append(", "); // modifies same object
        }
        String result = buffer.toString();
        System.out.println(result);


        // Convert values to Strings:
        // 1. concatenate with empty string
        int number = 42;
        String text1 = "" + number; // "42"

        // 2. use String.valueOf()
        int number2 = 42;
        double price2  = 19.99;
        boolean hungry = true;

        String s1 = String.valueOf(number2); // "42"
        String s2 = String.valueOf(price2); // "19.99"
        String s3 = String.valueOf(hungry); // "true"

        // Convert strings to numbers/booleans
        // each primitive type has a WRAPPER class with parsin methos
        // int has:
        Integer.parseInt("123"); // 123
        Double.parseDouble("12.45"); // 12.45
        Boolean.parseBoolean("true"); // true

        String inputAge = "30";
        int age = Integer.parseInt(inputAge); // 30 as an int

        String inputPrice = "12.23";
        double price = Double.parseDouble(inputPrice); // 12.23 as a double


        // CHECKING PARTS OF A STRING
        // startsWith means does the text begin with sth?
        String file = "2025_report_final.csv";
        boolean startOk = file.startsWith("2025"); //true

        // endsWith
        boolean endingOk = file.endsWith(".csv"); // true

        // contains
        boolean hasVersion = file.contains("final"); // true

        // indexOf - Where does sth first appear?
        int first = file.indexOf("_"); // 4
        
        // lastIndexOf - where does it appear the last time?
        int last = file.lastIndexOf("_"); // 11


        // MANIPULATING STRINGS
        // charAt(int index) > return the character at a specific index position
        String name = "Java";
        char c = name.charAt(1); // "a"

        // substring(int start, int end) > extracts part of a string
        String word = "developer";
        String part = word.substring(0, 3); // "dev" end 3 is exclusive so is form 0, 1, 2

        // replace(old, new)
        String old = "Hello";
        // String new = old.replace("l", "x"); // "Hexxo"

        // toLowerCase() and toUpperCase()
        // String text1 = "Hello";
        // text1.toUpperCase(); // "HELLO"
        // text1.toLowerCase(); // "hello"
        
        // trim()
        String messyText = "      Hi there!    ";
        String cleanText = messyText.trim(); // "Hi there!"

    }
}
