public class EnvioFragil implements EstrategiaEnvio {

    @Override
    public Double calcularCosto(double pesoKg){
        return ((pesoKg * 5) + 3);
    }
}
