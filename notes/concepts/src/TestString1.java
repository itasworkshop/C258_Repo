import java.util.Locale;

public class TestString1 {

    public static void main(String[] args) {
        //String --> collection of chars --> " "/ a class in java

        String name = "Rajeesh";

        System.out.println(name);
        System.out.println(name.equals("Rajesh"));
        System.out.println(name.substring(3));
        System.out.println(name.charAt(2));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2,5));
        System.out.println(name.length());
        System.out.println(name.concat("Sharma"));
        System.out.println(name.contains("h"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.replace("e","i"));

        String record1 = "101|Rajesh|12345|New York";
        String record2 = "101,Rajesh,12345,New York";

        String[] data = record2.split("[,]");

        for(String d:data){
            System.out.println(d);
        }

        System.out.println(record2);
    }
}
