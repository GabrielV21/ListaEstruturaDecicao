package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe A: ");
        int a = sc.nextInt();
        sc.close();
        int b =0,c=0, x1=0, x2=0;
        if (a==0) {
            System.out.println("Valor Invalido");
        } else {
            System.out.println("Informe B");
            b = sc.nextInt();
            System.out.println("Informe C");
            c = sc.nextInt();
        }    
        int delta = b*b -4*a*c;
        if (delta<0){
            System.out.println("A equacao nao possui raizes reais");
        } else {
            x1 = (int)(-b + Math.sqrt(delta)) / 2 * a;
            x2 = (int)(-b - Math.sqrt(delta)) / 2 * a;
        }
        if (delta==0){
            System.out.println("Apenas uma raiz real: "+ x1);
        } else {
            System.out.println("Duas raizes reais: "+x1+"|"+x2);
        }
    }    
}