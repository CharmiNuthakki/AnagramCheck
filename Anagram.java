import java.util.*;
public class Anagram {
public static boolean checkAnagram(String str1, String str2){
    if(str1.length()!=str2.length()) {
        return false;
    }

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter First String: ");
String str = sc.nextLine();
System.out.println("Enter Second String: ");
String str2 = sc.nextLine();
System.out.println(checkAnagram(str,str2));
sc.close();
}
}