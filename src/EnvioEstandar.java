public class EnvioEstandar implements EstrategiaEnvio{
    public Double calcularCosto(Double pesoKg){
        return (pesoKg * 2);
    }
}
