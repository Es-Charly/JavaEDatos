// TDAEsfera.java: Clase que simula una esfera
// Author: Es-Charly C-XV

package Tuto05;

public class TDAEsfera {
    private double radio;
    
    // Constructor
    public TDAEsfera(double radioInicial){
        if(radio>0){
            this.radio=radioInicial;
        } else {
            this.radio=0.0;
        }
    }
    
    //Creamos los métodos u operaciones
    public double getRadio(){
        return this.radio;
    }
    
    public double getDiametro(){
        return (radio*2);
    }
    
    public double getCircunferencia(){
        return (Math.PI*getDiametro());
    }
    
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio,3))/3;
    }
}
