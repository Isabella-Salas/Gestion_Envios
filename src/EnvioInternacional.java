public class EnvioInternacional implements EstrategiaEnvio{
    public double calcularCosto(double pesoKg){
        return ((pesoKg * 6) + 10);
    }
}
