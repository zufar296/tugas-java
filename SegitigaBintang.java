import java.util.Scanner;
class SegitigaBintang{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.println("=====TUGAS JAVA SEGITIGA BINTANG 1=====");
        System.out.print("Input Baris Segitiga = ");
        int baris=scan.nextInt();

        int i,j;
        i=1;
        while(i<=baris){
            j=1;
            while(j<=i){
                System.out.print(" ");

                if(j==1 || j<=i ||i==baris )
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;;
            }
            i++;
            System.out.print("\n");
        }
    }
}