import java.util.Scanner;
class Persegipanjang{
public static void main(String args[]){
int panjang,lebar;
    Scanner scan=new Scanner(System.in); 
System.out.print("Input panjang Persegi Panjang = ");
panjang=scan.nextInt();


System.out.print("Input Lebar Persegi Panjang = ");
lebar=scan.nextInt();


int i=1;
while( i<=panjang){
    int j=1;
    while(j<=lebar){
        System.out.print("*");
        System.out.print(" ");
        j++;
    }
    System.out.print("\n");
    i++;
}
    
}
}
