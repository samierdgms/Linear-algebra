import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[][]=new int[2][2];
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.println("Lütfen "+i+". satır "+j+". sütun için eleman giriniz");
                a[i][j]= input.nextInt();


            }



        }
        determinant(a);
        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=1; j++) {
             System.out.print( a[i][j]+" ")   ;

            }
            System.out.println();

        }






    }
    public static void determinant(int a[][]){
    if (((a[0][0]+a[1][1])-(a[0][1]+a[1][0]))==0){
    System.out.println("Girilen matris Singular bir matrisdir");
    }
    else{
    System.out.println("Girilen matris Non-Singular bir matrisdir");
    }

    }
}