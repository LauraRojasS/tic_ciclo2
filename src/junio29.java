import java.util.Scanner;

public class junio29{

    public static void main (String[] args){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        string entrada = scanner.nextLine();
        System.out.println("el mensaje fue " ´+ entrada);
        int numero = 10;*/
    
        /*do{
        System.out.println(":)");
        }while(numero>7);*/

        /*if (5>7){
            System.out.println(":)");
        }
        else if (3>2){
            System.out.println("T.T");
        }
        else{
            System.out.println(":(");
        }*/
        //Scanner scanner = new Scanner(System.in); //datos por consola

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("ingrese un animal");
        //String animal = scanner.nextLine();
        /*if (animal.equals("perro")){
        System.out.println("woff");
        }
        else if (animal.equals("gato")){
            System.out.println("miau");
        }
        else {
            System.out.println("no encuentro el animal");
        }*/

        /*switch (animal){ //condicional con igual
            case "perro":
            System.out.println("woff");
            break;
            case "gato":
            System.out.println("miau");
            break;
            case "loro":
            System.out.println("quiere cacao");
            break;
            default:
            System.out.println("no se encuentra el animal");
        }
        int numero = scanner.nextInt();
        switch(numero){
            case 0:
            System.out.println("es igual a cero");
            break;
            default:
            System.out.println("no es igual a cero");
        }*/
        /*int contador =1;
        while (true){
            System.out.println(":)");
            contador = contador +1;
            if (contador == 5){
            break;
            }
        }*/

        /*int numero = 5; //ciclo ejecuta sin validar condicion
        do{
            System.out.println(":)");
        }while (numero>7);*/  // condicion

    /*for(int i=0; i<5; i=i+1){
        System.out.println(i);
    }*/

        /*for(int i=7; i>0; i=i-1){ // ciclo valida condicion antes de ejecutar 
            System.out.println(i);
        }*/

        for(int i=0; i<=20; i=i+2){
            if(i==8){
            continue;
            }
            System.out.println(i);
        } 
    }
}
