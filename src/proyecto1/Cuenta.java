/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Luisda
 */
public class Cuenta {

    public Cliente Dueno;
    public int IDcuenta;
    public long Saldo;

    public Cuenta(Cliente Dueno, int IDcuenta) {
        this.Dueno = Dueno;
        this.IDcuenta = IDcuenta;
        this.Saldo = 0;
    }

    public void DatosCuentaCliente(int NumeroCliente) {
        System.out.println("El cliente " + MenuPrincipal.ListaDeClientes[NumeroCliente].Nombre + " tiene " + MenuPrincipal.CuentasPorCliente[NumeroCliente][1] + " cuentas");
        System.out.println("Los ID de la cuenta son ");
        for (int i = 0; i < 25; i++) {
            if (MenuPrincipal.ListaDeCuentas[i] != null) {
                if (MenuPrincipal.ListaDeCuentas[i].Dueno == MenuPrincipal.ListaDeClientes[NumeroCliente]) {
                    System.out.print(MenuPrincipal.ListaDeCuentas[i].IDcuenta + ", ");
                }
                
            }

        }
        System.out.println("");
    }
    
    public void SaldoCuenta(){
        System.out.println("La cuenta con ID " + this.IDcuenta + " Y dueno " + this.Dueno.Nombre + " tiene de saldo " + this.Saldo);
    }
}
