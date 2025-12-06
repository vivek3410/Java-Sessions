package StringConcept;

public class Concept {
    public static void main(String args[]){
        String str1 = "Hello world"; // String literals

        String str2 = new String("Hello");

        System.out.println(str2);

        String result = str1.concat(str2);

        System.out.println(result);

        boolean isEqual = str1.equals(str2);

        if(isEqual){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Not Equal");
        }

        int length = str1.length();

        System.out.println("Lenght of the str1: "+length);

        char character = str1.charAt(1);

        System.out.println("Charecter at index 1: "+character);

        int index = str1.indexOf("A");

        System.out.println("Index value: "+index);

        int compareTo = str1.compareTo(str2);
        System.out.println(compareTo);

        System.out.println(str1.contains(str2));
    }
}
