import java.util.Scanner;

public class Main {
    
    static Scanner ent;
    static int n; //Variable n para numero que se va a convertir

    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in); 
        System.out.println("Ingrese el numero que desea convertir: ");
        n = ent.nextInt();
        Binario bin = new Binario(); 
        System.out.println("Su numero convertido a binario es: ");
        System.out.println(bin.Conversiones(n)); 
        Hexadecimal hex = new Hexadecimal(); 
        System.out.println("Su numero convertido a hexadecimal es: ");
        System.out.println(hex.hexadec(n));
        
    }
    
}
