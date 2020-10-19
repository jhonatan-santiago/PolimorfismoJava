
package polimorfismo;

public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("JH-3444", "Audi", "RF-2019");
        Vehiculo vehiculo2 = new VehiculoDeportivo("JH-2222", "Audi", "RF-2222", 20);
        Vehiculo vehiculo3 = new VehiculoFurgoneta("JH-3333", "Audi", "RF-3333", 30);
        Vehiculo vehiculo4 = new VehiculoTurismo("JH-444", "Audi", "RF-444", 40);
        
        vehiculo.mostrarDatos();
        vehiculo2.mostrarDatos();
        vehiculo3.mostrarDatos();
        vehiculo4.mostrarDatos();
        
    }
    
}
