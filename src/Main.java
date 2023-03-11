import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(san(a));
    }
    public  static String san (int a ){
        String jup = "так сан";
        String takn = "жуп сан";
        if (a%2==1){
          return jup;
        }else
        return takn;




        }
    }