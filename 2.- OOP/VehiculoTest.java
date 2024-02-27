public class VehiculoTest {

    public static void main(String[] args) {
        //Crear Vehiculo - Instancia de la Clase Vehiculo
        Vehiculo auto1 = new Vehiculo(); 
        // auto1.anio = 2001;
        // auto1.marca = "Honda";
        // auto1.modelo = "Civic";
        // auto1.color = "blanco";
        // auto1.cantidadRuedas = 4;
        auto1.setAnio(2001);
        auto1.setMarca("Honda");
        auto1.setModelo("Civic");
        auto1.setColor("blanco");
        auto1.setCantidadRuedas(4);

        Vehiculo auto2 = new Vehiculo();
        // auto2.anio = 2018;
        // auto2.marca = "Mazda";
        // auto2.modelo = "CX-3";
        // auto2.color = "azul";
        // auto2.cantidadRuedas = 4;
        auto2.setAnio( 2018);
        auto2.setMarca( "Mazda");
        auto2.setModelo( "CX-3");
        auto2.setColor( "azul");
        auto2.setCantidadRuedas( 4);

        System.out.println("Marca auto1:"+auto1.getMarca());
        System.out.println("Marca auto2:"+auto2.getMarca());

        Vehiculo auto3 = new Vehiculo(2024, "BMW", "Nuevo", "rojo", 4);
        System.out.println("Marca auto3:"+auto3.getMarca());

        Vehiculo.imprimirCantidadVehiculos();
    }

}