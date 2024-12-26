package Basics;
import java.util.Scanner;
public class FindFactors {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Factor is "+ i);
            }
        }

    }
}

//Input: 12
//Output:
//Factor is 1
//Factor is 2
//Factor is 3
//Factor is 4
//Factor is 6
//Factor is 12
