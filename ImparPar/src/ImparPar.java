import java.util.Scanner;;

public class ImparPar {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int contpar = 0;
        int contimpar = 0;
        int contpositivo = 0;
        int contnegativo = 0;
        int contzero = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();

        if (a % 2 == 0) {
            ++contpar;
        } else {
            ++contimpar;
        }
        if (a > 0) {
            ++contpositivo;
        }else if(a == 0){
            ++contzero;
        } else {
            ++contnegativo;
        }


        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();
        if (b % 2 == 0) {
            ++contpar;
        } else {
            ++contimpar;
        }
        if (b > 0) {
            ++contpositivo;
        }else if(b == 0){
            ++contzero;
        } else {
            ++contnegativo;
        }


        System.out.println("Digite o terceiro número: ");
        c = scan.nextInt();
        if (c % 2 == 0) {
            ++contpar;
        } else {
            ++contimpar;
        }
        if (c > 0) {
            ++contpositivo;
        }else if(c == 0){
            ++contzero;
        } else {
            ++contnegativo;
        }


        System.out.println("Digite o quarto número: ");
        d = scan.nextInt();
        if (d % 2 == 0) {
            ++contpar;
        } else {
            ++contimpar;
        }
        if (d > 0) {
            ++contpositivo;
        }else if(d == 0){
            ++contzero;
        } else {
            ++contnegativo;
        }

        
        System.out.println("Digite o último número: ");
        e = scan.nextInt();
        if (e % 2 == 0) {
            ++contpar;
        } else {
            ++contimpar;
        }
        if (e > 0) {
            ++contpositivo;
        }else if(e == 0){
            ++contzero;
        } else {
            ++contnegativo;
        }
        System.out.println(contpar + " par(es)");
        System.out.println(contimpar + " impar(es)");
        System.out.println(contpositivo + " positivo(s)");
        System.out.println(contnegativo + " negativo(s)");

    }
}