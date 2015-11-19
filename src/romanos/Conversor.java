/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

/**
 *
 * @author lis
 */
public class Conversor {
    String[] rNum ={"M","CM","D", "C","XC", "L","X","IX","V","I" };
    int [] variables = {1000,900,500,100,90,50,10,9,5,1};
    StringBuffer romano;

    
    public String romanoDe(String numero){       
        romano = new StringBuffer();
        int numeroInt = Integer.valueOf(numero);
        for(int i = 0; numeroInt>0; i++){
            int valorRepeticion = numeroInt/variables[i];
             if(valorRepeticion < 4){
                 for(int j = 0;  j<valorRepeticion; j++){
                    romano.append(rNum[i]);
                 }
             }else{
                 for(int j=0; j<5-valorRepeticion;j++){
                     romano.append(rNum[i]);
                 }
                 romano.append(rNum[i-1]);
             }
            numeroInt -= valorRepeticion*variables[i]; 
            
            
        }
        
        
        
       
        return romano.toString();
    }
    public void probar (){
        for(int i = 1; i<=1000;i++){
            System.out.println(romanoDe(String.valueOf(i)));
            
        }
    }
    
}
