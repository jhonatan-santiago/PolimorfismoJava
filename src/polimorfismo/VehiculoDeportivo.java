/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Jhona
 */
public class VehiculoDeportivo extends Vehiculo{
    int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void mostrarDatos(){
        System.out.println("Vehiculo deportivo");
    }
}
