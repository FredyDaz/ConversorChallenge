package conversorchallenge;

/**
 *
 * @author Fredy Díaz
 */
public class Operaciones_Divisas extends VentanaPrincipal{
    
    public static double MXNaDolar(double numero1) {
        return Math.round((numero1 * 0.058)* 100.0) / 100.0;
    }  
     
    public static double MXNaEuros(double numero1) {
        return Math.round((numero1 * 0.053)* 100.0) / 100.0;
    } 
    
    public static double MXNALibrasEsterlinas(double numero1) {
        return Math.round((numero1 * 0.046)* 100.0) / 100.0;
    }
    
    public static double MXNaYenJapones(double numero1) {
        return Math.round((numero1 * 8.34)* 100.0) / 100.0;
    }
    
    public static double MXNaWonsurcoreano(double numero1) {
        return Math.round((numero1 * 75.75)* 100.0) / 100.0;
    }
    
    public static double DolaraMXN(double numero1) {        
        return Math.round((numero1 * 17.27)* 100.0) / 100.0;
    }
    
    public static double EuroAMXN(double numero1) {        
        return Math.round((numero1 * 18.81)* 100.0) / 100.0;
    }
    
    public static double LibrasEsterlinasAMXN(double numero1) {        
        return Math.round((numero1 * 22.00)* 100.0) / 100.0;
    }
    
    public static double YenJaponesAMXN(double numero1) {        
        return Math.round((numero1 * 0.12)* 100.0) / 100.0;
    }
    
    public static double WonSurCoreanoAMXN(double numero1) {        
        return Math.round((numero1 * 0.013)* 100.0) / 100.0;
    }
}
