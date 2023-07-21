package conversorchallenge;

/**
 *
 * @author Fredy Díaz
 */
public class Operaciones_Temperatura {
    
    public static double GradosAFarenheit(double numero1) {
        return Math.round(((numero1 * 9 / 5) + 32)* 100.0) / 100.0;
    }
    
    public static double GradosCAKelvin(double numero1) {
        return Math.round((numero1 + 273.15)* 100.0) / 100.0;
    }
    
    public static double FarenheitACelsius(double numero1) {
        return Math.round(((numero1 - 32) * 5 / 9)* 100.0) / 100.0;
    }
    
    public static double FarenheitAKelvin(double numero1) {
        return Math.round(((numero1 - 32) * 5 / 9 + 273.15)* 100.0) / 100.0;
    }
    
    public static double KelvinACelsius(double numero1) {
        return Math.round((numero1 - 273.15)* 100.0) / 100.0;
    }
    
    public static double KelvinAFarenheit(double numero1) {
        return Math.round(((numero1 - 273.15) * 9 / 5 + 32)* 100.0) / 100.0;
    }
}
