class Destok extends Computadora {
    private String cpu;
    private String ram;
    private String consumo;

    public Destok(String marca, String modelo, String cpu, String ram, String consumo) {
        super(marca, modelo);
        this.cpu = cpu;
        this.ram = ram;
        this.consumo = consumo;
    }

    @Override
    public String mostrarDetalles() {
        return "Marca de desktop: " + getMarca() + ", Modelo de desktop: " + getModelo() + ", CPU: " + cpu + ", RAM: " + ram + ", Consumo: " + consumo;
    }
}