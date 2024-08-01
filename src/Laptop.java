class Laptop extends Computadora {
    private String cpu;
    private int ram;
    private int bateria;

    public Laptop(String marca, String modelo, String cpu, String ram, String bateria) {
        super(marca, modelo);
        this.cpu = cpu;
        this.ram = Integer.parseInt(ram);
        this.bateria = Integer.parseInt(bateria);
    }

    @Override
    public String mostrarDetalles() {
        return "Marca de laptop: " + getMarca() + ", Modelo de laptop: " + getModelo() + ", CPU: " + cpu + ", RAM: " + ram + ", Capacidad de batería: " + bateria;
    }
}