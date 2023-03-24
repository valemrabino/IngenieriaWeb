import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //char es con comilla simple
        //string con comilla doble
        //tambien se puede utilizar la variable var para declarar.

  /*      char caracter = 'a';
        String caracter2 = "hola";
        System.out.println(caracter);
        System.out.println(caracter2);

        char varChar = '\u0021';
        System.out.println(varChar);

        var varChar2 = '\u0021';
        System.out.println(varChar2);

        //booleanos
        boolean variable = true;

        System.out.println(variable);

        if (variable) {
            System.out.println(variable);

        } else {
            System.out.println("false");
        }
        var edad=Integer.parseInt("23");
        System.out.println(edad);

        var valorPi= Double.parseDouble("3.1418");
        System.out.println(valorPi);

        var consola= new Scanner(System.in);
        System.out.println("Ingrese su edad: ");

        edad=Integer.parseInt(consola.nextLine());

        System.out.println("Su edad es: "+edad);*/
        /*var consola = new Scanner(System.in);

        var edadTexto = String.valueOf(10);
        System.out.println("Valor texto: " + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println(caracter);

        System.out.println("ingrese caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println(caracter);*/

        var consola = new Scanner(System.in);
        String descripcion;
        int id, precio, envio;

        System.out.println("ingrese descripcion");
        descripcion = consola.nextLine();

        System.out.println("ingrese el id del produto");
        id = consola.nextInt();

        System.out.println("Ingrese el precio: ");
        precio = consola.nextInt();

        System.out.println("Tiene envio gratis?");

        if(precio>20){
            System.out.println("Tiene envio gratis");
        }else{
            System.out.println("No tiene envio gratis");
        }

        System.out.println("Descripcion: "+descripcion );
        System.out.println("id: "+id);
        System.out.println("precio: "+precio);
        //System.out.println();




    }
}