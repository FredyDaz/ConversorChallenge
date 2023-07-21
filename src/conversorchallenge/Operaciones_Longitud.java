package conversorchallenge;

/**
 *
 * @author Fredy Díaz
 */
public class Operaciones_Longitud {

    public static double MaCm(double numero1) {
        return Math.round((numero1 * 100)* 100.0) / 100.0;
    }
    
    public static double MaMm(double numero1) {
        return Math.round((numero1 * 1000)* 100.0) / 100.0;
    }
    
    public static double CmaMm(double numero1) {
        return Math.round((numero1 * 10)* 100.0) / 100.0;
    }
    
    public static double KmaM(double numero1) {
        return Math.round((numero1 * 1000)* 100.0) / 100.0;
    }
    
    public static double MaPie(double numero1) {
        return Math.round((numero1 * 3.281)* 100.0) / 100.0;
    }
    
    public static double MaYarda(double numero1) {
        return Math.round((numero1 * 1.094)* 100.0) / 100.0;
    }
    
    public static double MillaAKm(double numero1) {
        return Math.round((numero1 * 1.609)* 100.0) / 100.0;
    }
    
    public static double MillMaraAKm(double numero1) {
        return Math.round((numero1 * 1.852)* 100.0) / 100.0;
    }
    
    public static double PieAPulg(double numero1) {
        return Math.round((numero1 * 12)* 100.0) / 100.0;
    }
    
    public static double PulgACm(double numero1) {
        return Math.round((numero1 * 2.54)* 100.0) / 100.0;
    }
    
    public static double PieACm(double numero1) {
        return Math.round((numero1 * 30.48)* 100.0) / 100.0;
    }
    
    public static double YardaAPie(double numero1) {
        return Math.round((numero1 * 3)* 100.0) / 100.0;
    }
    
    public static double YardaACm(double numero1) {
        return Math.round((numero1 * 91.44)* 100.0) / 100.0;
    }
    
}
