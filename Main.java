package kolo;
public class Main{
    


public static  void main (String[] args){
    int value;
    value=fibonachi(9);
    System.out.println("the result is " +value);

}
public static int fibonachi(int z){
    if(z==1){return 1;}
    if(z==0){return 0;}
    else{return fibonachi(z-1)+fibonachi(z-2);}

}
}