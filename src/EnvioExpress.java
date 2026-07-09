public class EnvioExpress implements EstrategiaEnvio{
    public double calcularCosto(double pesoKg){
        return ((pesoKg * 4.5) + 3);
    }
}
