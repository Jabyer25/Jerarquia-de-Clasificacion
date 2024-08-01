class Tablet extends Computadora {
    private String cpu;
    private int ram;
    private int bateria;

    public Tablet(String marca, String modelo, String cpu, String ram, String bateria) {
        super(marca, modelo);
        this.cpu = cpu;
        this.ram = Integer.parseInt(ram);
        this.bateria = Integer.parseInt(bateria);
    }

    @Override
    public String mostrarDetalles() {
        return "Marca de Tablet: " + getMarca() + ", Modelo de Tablet: " + getModelo() + ", CPU: " + cpu + ", RAM: " + ram + ", Capacidad de batería: " + bateria;
    }
}