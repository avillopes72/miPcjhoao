
package com.mycompany.kevin;
public class Laboratorio {
    public String nombre;
    public int codigoUbic;
    public String disponibilioEquipos;
    public String muestra;
    public String resultado;
    public void procesarPrueba(String muestra,String disponibilidaEquipos){
        if(muestra.equals("correcto")&&disponibilidaEquipos.equals("disponible")){
            System.out.println("procesando...");
        }else
        {
            System.out.println("invalido ..");
        }        
    }
    public void subirResiltado(Sistema resultadosPruebas){
        
    }
}
