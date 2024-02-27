/*
PascalCase - CadaPalabraVaConMayuscula -> Nombre de archivos y nombres de clases
camelCase - primeraMinusculaElRestoMayuscula -> Nombre de variables y nombre de métodos
javac NombreArchivo.java -> compilar
java NombreArchivo -> interpreta/ejecuta
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
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
        System.out.println(x.equalsIgnoreCase(y)); //Comparamos dos textos SIN case sensitive

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

        /* ARRAY o ARREGLOS - una vez establecido el tamaño NO puede cambiarse */
        int[] miArreglo; //Declaración
        miArreglo = new int[5]; //Inicialización, incluyo el tamaño
        miArreglo[0] = 4;
        miArreglo[1] = 8;
        miArreglo[2] = 8;
        miArreglo[3] = 5;
        miArreglo[4] = 9;

        int[] miArreglo2 = {4, 8, 8, 5, 9}; //Implícitamente establefemos el tamaño de 5
        miArreglo2[2] = 10;
        System.out.println(miArreglo2[2]);

        //¿Cómo recorremos un array?
        for(int indice=0; indice < miArreglo.length; indice++) {
            System.out.println(miArreglo[indice]);
        }

        saludo();
        saludo();

        int resultado = sumatoria(5, 4); //resultado = 9
        System.out.println(resultado);

        saludo("Elena");
        saludo("Elena", "De Troya");

        //ArrayList: Lista dinámica
        //add, get, remove, contains, indexOf, size
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(10);
        listaNumeros.add(30);
        listaNumeros.add(20);
        listaNumeros.add(30);

        System.out.println(listaNumeros.get(1));
        System.out.println(listaNumeros.size());
        System.out.println(listaNumeros.contains(10));
        System.out.println(listaNumeros.indexOf(30)); //Regresarme el índice de la primera incidencia
        System.out.println(listaNumeros.remove(listaNumeros.indexOf(30)));
        System.out.println(listaNumeros.get(1));

        for(int posicion=0; posicion < listaNumeros.size(); posicion++) {
            System.out.println(listaNumeros.get(posicion));
        }

        for (Integer i : listaNumeros)
            System.out.println(i);

        HashMap<String, String> estudiante = new HashMap<String, String>();
        estudiante.put("nombre", "Elena");
        estudiante.put("apellido", "De Troya");
        estudiante.put("email", "elena@gmail.com");
        estudiante.put("curso", "Java");

        System.out.println(estudiante.get("nombre"));
        System.out.println(estudiante.get("curso"));

        Set<String> claves = estudiante.keySet(); //Estoy obteniendo un set de las claves de mi HashMap
        /*
        claves = {"nombre", "apellido", "email", "curso"}
        clave = "nombre"
        ->nombre = Elena
        ---
        clave = "apellido"
        ->apellido = De Troya
         */
        for(String clave : claves) {
            System.out.println(clave + " = " + estudiante.get(clave));
        }

        estudiante.forEach((clave, valor) -> System.out.println(clave + " = " + valor));
 
    }

    /*Firma de método: public static void saludo()
    Permisos de función: public, private, protected
    static: es de la clase (Más detalle de esto en la sesión de OOP)
    Tipo de valor de retorno: int, boolean, void
    nombre de función: camelCase para el nombre
    (argumento a recibir)
    */
    public static void saludo() {
        System.out.println("Hola mundo");
    }
    //numero1 = 5; numero2 = 4
    //suma = 5+4 = 9
    public static int sumatoria(int numero1, int numero2) {
        if(numero1 < 10) {
            return numero1+numero2;
        } 
        return numero1-numero2;
        // int suma = numero1 + numero2;
        // return suma;
    }

    public static void saludo(String nombre) {
        System.out.println("Hola "+nombre);
    }

    public static void saludo(String nombre, String apellido) {
        System.out.println("Hola "+nombre+apellido);
    }

}