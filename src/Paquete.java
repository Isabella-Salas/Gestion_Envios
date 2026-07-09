public abstract class Paquete {
    private String nombreDestinatario;
    private Double pesoKg;
    private EstrategiaEnvio estrategiaEnvio;

    public Paquete(String nombreDestinatario, Double pesoKg, EstrategiaEnvio estrategiaEnvio) {
        if(pesoKg <= 0){
            throw new IllegalArgumentException("El peso del paquete debe ser mayor a 0");
        }
        this.nombreDestinatario = nombreDestinatario;
        this.pesoKg = pesoKg;
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public Double obtenerCostoEnvio(){
        return this.estrategiaEnvio.calcularCosto(this.pesoKg);
    }
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }
    public Double getPesoKg() {
        return pesoKg;
    }
    public EstrategiaEnvio getEstrategiaEnvio() {
        return estrategiaEnvio;
    }
    public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "nombreDestinatario='" + nombreDestinatario + '\'' +
                ", pesoKg=" + pesoKg +
                ", estrategiaEnvio=" + estrategiaEnvio +
                '}';
    }
}
