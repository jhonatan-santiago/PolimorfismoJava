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
public class VehiculoTurismo extends Vehiculo{
    int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo,int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarDatos(){
        System.out.println("Vehiculo Turismo");
    }
}
