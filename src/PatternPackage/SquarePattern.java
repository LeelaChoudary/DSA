package PatternPackage;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
//n=3
//* * *
//* * *
//* * *

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
