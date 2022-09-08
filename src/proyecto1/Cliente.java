package proyecto1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luisda
 */
public class Cliente {
    
    public String Nombre;
    public String Apellido;
    public long DPI;
    
    public Cliente(String Nombre, String Apellido,long DPI){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.DPI=DPI;
    }
    public void Imprime(){
        System.out.println("DPI: " + this.DPI + " | Nombre: " + this.Nombre + " | Apellido: " + this.Apellido);
    }
    
    
    
    
}
