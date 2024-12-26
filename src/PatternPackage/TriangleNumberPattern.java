package PatternPackage;
import java.util.Scanner;
public class TriangleNumberPattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
//n=5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        int nst=1;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(count + " ");
                count++;
            }
            nst++;
            System.out.println();
        }

    }
}
