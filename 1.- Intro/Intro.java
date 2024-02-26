/*
PascalCase - CadaPalabraVaConMayuscula -> Nombre de archivos y nombres de clases
camelCase - primeraMinusculaElRestoMayuscula -> Nombre de variables y nombre de métodos
javac NombreArchivo.java -> compilar
java NombreArchivo -> interpreta/ejecuta
 */

public class Intro {

    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!"); //Impresión


        //Tipo de dato PRIMITIVO - Solo guarda el valor
        int miEntero; //Declarando mi variable (sin valor asignado)
        miEntero = 400; //Asignamos el valor
        double pi = 3.141592; //Declarando la variable y asignando el valor
        boolean bool = true; //true o false
        char unCaracter = 'a'; //Un caracter

        //Tipo de dato OBJETO - Más complejo. Suele tener métodos/funciones que complementan variable
        Integer myInteger = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        String myString = "ABC";

        //Manipulación de cadenas
        String cadena = "Buenas tardes a todos mis Compañeros";
        System.out.println("Cantidad de caracteres:"+cadena.length());
        char letra = cadena.charAt(1); //charAt(posicion);
        System.out.println(letra);
        System.out.println(cadena.toLowerCase()); //minúsculas
        System.out.println(cadena.toUpperCase()); //MAYUSCULAS
        String x = "Hola";
        String y = "hola";
        System.out.println(x.equals(y)); //Comparamos dos textos case sensitive
        System.out.println(x.equalsIgnoreCase(y)); //Comparamos dos textos case sensitive

        //CONDICIONAL
        if(miEntero == 400) { // == != > >= < <=
            System.out.println("Números iguales");
        } else {
            System.out.println("Números distintos");
        }

        int edadInfante = 3;
        if(edadInfante < 2){
            System.out.println("El infante es un bebe");
        }else if(edadInfante < 4){
            System.out.println("El infante es un toddler");
        } else {
            System.out.println("El infante es un niño");
        }

        boolean estaLloviendo = false; //NO está lloviendo
        int temperatura = 20;
        //&& : AND e implica que ambas condicionales se cumplan
        if(temperatura > 18 && !estaLloviendo) { 
            System.out.println("¡Vamos a dar un paseo!");
        }

        int edad = 16;
        boolean permisoPadres = true;
        // || : OR e impica que una u otra condicional se cumpla
        if(edad >= 18 || permisoPadres) {
            System.out.println("Puedes obtener la licencia de conducir");
        } 

        //BUCLES
        /*
        i=0
        alo?
        --
        i = 1
        alo?
        --
        i = 2
        alo?
        --
        i = 3
        alo?
        --
        i = 4
        alo?
        --
        i = 5
         */
        for(int i=0; i<5; i++) { //for(inicilizacion; condicional; paso)
            System.out.println("alo?");
        }

        int j = 0;
        for(;j<5; j+=2) {
            System.out.println("hola?");
        }

        int inicio = 0;
        int fin = 5;
        /*
        inicio = 0
        fin = 5
        ciao!
        inicio = 1
        fin = 4
        ---
        ciao!
        inicio = 2
        fin = 3
        ---
        ciao!
        inicio = 3
        fin = 2
         */
        while(inicio < fin) {
            System.out.println("ciao!");
            inicio++;
            fin--;
        }

        int num1 = 10;
        int num2 = 9;
        do {
            System.out.println("entro?");
        }while(num1 < num2);

    }

}