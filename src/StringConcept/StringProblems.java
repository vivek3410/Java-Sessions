package StringConcept;

import java.util.Arrays;
import java.util.Scanner;

public class StringProblems {
    
    public static String reverse(String str){

        String reversed = "";

        for(int i = str.length() - 1;i >= 0;i--){
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static boolean isPlindrome(String str){
        String reversedString = reverse(str);

        if(str.equals(reversedString)){
            return true;
        }

        return false;
    }

    public static void countVowelsAndConsonents(String str){
        int vowelsCount = 0;
        int consonentsCount = 0;

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
            || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || 
            ch == 'O' || ch == 'U'){
                vowelsCount++;
            }else{
                consonentsCount++;
            }
        }

        System.out.println("Vowels count: "+vowelsCount);
        System.out.println("consonents count: "+consonentsCount);

    }

    public static int count(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            count++;
        }
        return count;
    }

    public static String removingDuplicates(String str){

        String result = "";

        for(int i = 0; i<str.length();i++){
            if(!result.contains("" + str.charAt(i))){
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public static void isAnagram(String str1,String str2){
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if(Arrays.equals(str1Array, str2Array)){
            System.out.println("It is Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }

    public static void countWords(String str){

        String[] strArray = str.split(" ");

        System.out.println("Count words: "+ strArray.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String name = sc.next();
        String reversed = reverse(name);

        System.out.println("Reversed String: "+reversed);

        boolean result = isPlindrome(name);

        if(result){
            System.out.println(name + " is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

        countVowelsAndConsonents(name);

        System.out.println("The length of the string: "+ count(name));

        System.out.println("removed Duplicates: " + removingDuplicates(name));

        String str1 = "listena";
        String str2 = "SILENT";

        isAnagram(str1, str2);

        System.out.println("Upper case String: " + str1.toUpperCase());
        System.out.println("Lower case String: " + str2.toLowerCase());

        countWords("This is java class");
    }
}
