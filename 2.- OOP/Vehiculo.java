public class Vehiculo {

    //Propiedades, Atributos, Variables Miembro
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int cantidadRuedas;

    //Atributo estático es un atributo que NO pertenece a una instancia, sino que pertenece a la CLASE completa
    public static int cantidadVehiculos = 0;

    public Vehiculo() {
        cantidadVehiculos++;
    }

    /*
    SOBRECARGA de métodos constructores
    auto3.anio = 2024
    auto3.marca = "BMW"
    ...
     */
    public Vehiculo(int anio, String marca, String modelo, String color, int cantidadRuedas) {
        cantidadVehiculos++;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadRuedas = cantidadRuedas;
    }

    /* GET: me regresa el valor establecido del atributo */
    public int getAnio() {
        return anio;
    }

    /* SET: me establece un valor para el atributo
    auto1.anio = 2001*/
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public static void imprimirCantidadVehiculos() {
        System.out.println("Tienes:"+cantidadVehiculos+" vehiculos");
    }

}