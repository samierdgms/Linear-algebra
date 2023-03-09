import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int a[][]=new int[3][3];
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <=2; j++) {
                System.out.println("Lütfen "+i+". satır "+j+". sütun için eleman giriniz");
                a[i][j]= input.nextInt();


            }



        }
        determinant(a);
        dependent(a);
        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <=2; j++) {
                System.out.print( a[i][j]+" ")   ;

            }
            System.out.println();

        }

    }
    public static void determinant(int a[][]){
        int b = (a[0][0]*a[1][1]*a[2][2])+(a[0][1]*a[1][2]*a[2][0])+(a[1][0]*a[2][1]*a[0][2]);
        int c =(a[0][2]*a[1][1]*a[2][0])+(a[1][2]*a[2][1]*a[0][0])+(a[1][0]*a[0][1]*a[2][2]);
        if (b-c==0){
            System.out.println("Girilen matris Singular bir matrisdir");
        }
        else{
            System.out.println("Girilen matris Non-Singular bir matrisdir");
        }

    }
    public static void dependent(int a [][]){
    int s1 = a[0][0]+a[1][0];
    int s2 = a[0][1]+a[1][1];
    int s3 = a[0][2]+a[1][2];
    double c = a[2][0]/s1;
    double d = a[2][1]/s2;
    double e = a[2][2]/s3;
    if((int)c==c&&(int)d==d&&(int)e==e){
        System.out.println("Girilen matris Dependent bir matrisdir");
    }


    }
}