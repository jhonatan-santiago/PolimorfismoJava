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
public class VehiculoFurgoneta extends Vehiculo{
    int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void mostrarDatos(){
        System.out.println("vehiculo furgoneta");
    }
}
