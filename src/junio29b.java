import java.util.Scanner;

public class junio29b {
    public static void main (String[] args){
        /*int a = 5;
        System.out.println(a+5);
        System.out.println(a-5);
        System.out.println(a*5);
        System.out.println(a/5);
        System.out.println(a%5); 
        System.out.println(Math.pow(4,3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(3-5));
        System.out.println(Math.cbrt(64));*/

        /*int contador = 0;
        contador = contador+1;
        contador +=1;
        contador++;
        System.out.println(contador);*/

        /*int numero = 1;
        System.out.println(numero++); // primero muestra el numero 1 
        System.out.println(numero); // lo suma y muestra el resultado*/

        /*char caracter = 'j';
        System.out.println(caracter);
        System.out.println(++caracter);
        System.out.println(--caracter);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = scanner.nextLine();
        //System.out.println("hola " + nombre );
        System.out.println(saludar(nombre));
    } 
    public static String saludar (String nombre){
        return "hola " + nombre;
    }
}
