class Electrodomestico extends Computadora {
    private String cpu;
    private int ram;
    private int consumo;

    public Electrodomestico(String marca, String modelo, String consumo) {
        super(marca, modelo);
        this.consumo = Integer.parseInt(consumo);
    }

    @Override
    public String mostrarDetalles() {
        return "Marca del Refrigerador: " + getMarca() + ", Modelo de Refrigerador: " + getModelo() + ", CPU: " + cpu + ", RAM: " + ram + ", Capacidad de batería: " + consumo;
    }
}