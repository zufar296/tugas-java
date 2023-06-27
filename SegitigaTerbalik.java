import java.util.Scanner;
class SegitigaTerbalik{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Input baris segitiga = ");
        int baris=scan.nextInt();

        int i,j;
        i=1;
        while(i<=baris){
            j=1;
            while(j<=baris){

                if(j>=i || j==baris ||i==1 )
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