package conversorchallenge;

/**
 *
 * @author Fredy Díaz
 */
public class Operaciones_Tiempo {
    
    public static double SegAMin(double numero1) {
        return Math.round((numero1 / 60)* 100.0) / 100.0;
    }
    
    public static double SegAHora(double numero1) {
        return Math.round((numero1 / 3600)* 100.0) / 100.0;
    }
    
    public static double MinAHora(double numero1) {
        return Math.round((numero1 / 60)* 100.0) / 100.0;
    }
    
    public static double MinASeg(double numero1) {
        return Math.round((numero1 * 60)* 100.0) / 100.0;
    }
    
    public static double HoraASeg(double numero1) {
        return Math.round((numero1 * 3600)* 100.0) / 100.0;
    }
    
    public static double HoraAMin(double numero1) {
        return Math.round((numero1 * 60)* 100.0) / 100.0;
    }
    
}
