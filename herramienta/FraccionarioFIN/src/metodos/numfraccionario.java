package metodos;
import javax.swing.JOptionPane;

public class numfraccionario {
    //Atributos del objetivos Numero Fraccionario
    private int num; //Numerador
    private int den; //Denominador
    
    
    //Metodos constructores
    numfraccionario() {
        num = 1;
        den = 1;
        
    }

    numfraccionario(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    //Metodos Analizados
    //Obtener Numerador
    int getNumerador(){
        return num;
    }
    
    //Obtener Denominador
    int getDenominador(){
        return den;
    }
     
   
    
    numfraccionario getsumar( int n, int d  ){
        
        numfraccionario f3 = new numfraccionario();
        f3.num = ( num * d ) + ( n * den );
        f3.den=  den * d ;
      
        
        return f3;
    }
    
    numfraccionario getsumar2( numfraccionario f2 ){
        numfraccionario f3 = new numfraccionario();
        f3.num = ( num * f2.den ) + ( f2.num * den );
        f3.den=  den * f2.den ;
        return f3;
    }
    
    numfraccionario getRestar (numfraccionario f2){
        
        numfraccionario f3= new numfraccionario();
        f3.num = ( num * f2.den ) - ( f2.num * den );
        f3.den=  den * f2.den ;
        return f3;
    }
    
    numfraccionario getMultiplicar (numfraccionario f2){
        
        numfraccionario f3= new numfraccionario();
        f3.num = ( num * f2.num );
        f3.den=  den * f2.den ;
        return f3;
    }
    
    numfraccionario getDividir (numfraccionario f2){
        
        numfraccionario f3= new numfraccionario();
        f3.num = ( num * f2.den );
        f3.den=  den * f2.num ;
        return f3;
    }
    
    //Modificadores
    void setNumerador( int nuevoNum){
        num = nuevoNum;
    }
    
    void setDenominador( int nuevoDen){
        den = nuevoDen;
    }
    
    void setFraccionario( int newNum, int newDen){
        num = newNum;
        den = newDen;
        
    }

}    
