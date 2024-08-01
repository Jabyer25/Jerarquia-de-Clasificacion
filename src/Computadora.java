abstract class Computadora {
    private String marca;
    private String modelo;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public abstract String mostrarDetalles();
}