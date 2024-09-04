package kolo;
import java.util.Scanner;
public class Main{
    


public static  void main (String[] args){
    long value; int index;
    Scanner s = new Scanner(System.in);
    System.out.printf("please what the index of fibunacci sequence that you want to know:\t");
    index = s.nextInt();
    value=fibonachi(index);
    System.out.println("the result is " +value);

}
public static int fibonachi(int z){
    if(z==1){return 1;}
    if(z==0){return 0;}
    else{return fibonachi(z-1)+fibonachi(z-2);}

}
}
