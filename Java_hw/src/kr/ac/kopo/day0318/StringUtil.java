package kr.ac.kopo.day0318;
import java.util.Scanner;

public class StringUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        // Problem01
        char c = sc.nextLine().charAt(0);
        boolean res = isUpperChar(c);
        System.out.println(res);

        // Problem02
        char c = sc.nextLine().charAt(0);
        boolean res = isLowerChar(c);
        System.out.println(res);

        // Problem03
        int i = sc.nextInt();
        int j = sc.nextInt();
        int res = max(i,j);
        System.out.println(res);

        // Problem04
        int i = sc.nextInt();
        int j = sc.nextInt();
        int res = min(i,j);
        System.out.println(res);

        // Problem05
        String s = reverseString(sc.nextLine());
        System.out.println(s);

        // Problem06
        String s = toUpperString(sc.nextLine());
        System.out.println(s);

        // Problem07
        String s = toLowerString(sc.nextLine());
        System.out.println(s);
*/
    }

    static boolean isUpperChar(char c){
        if(65 <= c && c <= 90)
            return true;
        else
            return false;
    }

    static boolean isLowerChar(char c){
        if(97 <= c && c <= 122)
            return true;
        else
            return false;
    }

    static int max(int i, int j){
        return (i > j) ? i : (i < j ? j : j);
    }

    static int min(int i, int j){
        return (i > j) ? j : (i < j ? i : i);
    }

    static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
        }
        String s = String.valueOf(sb.reverse());
        return s;
    }

    static String toUpperString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(97 <= c && c <= 122) {
                c -= 32;
                sb.append(c);
            } else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String toLowerString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(65 <= c && c <= 90) {
                c += 32;
                sb.append(c);
            } else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
