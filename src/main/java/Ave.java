public abstract class Ave {
    private String raza;
    private String color;
    private String size;
    private int edad;
    private VolarStrategy vuelo;
    private NadarStrategy nadar;

    public Ave(VolarStrategy vuelo, NadarStrategy nadar) {
        this.vuelo = vuelo;
        this.nadar = nadar;
    }    
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   
    
    public String volar() {
        return vuelo.volar();
    }
    public String nadar() {
        return nadar.nadar();
    }

    @Override
    public String toString() {
        return "Ave{" + "raza=" + raza + ", color=" + color + ", tamaño=" + size + ", edad=" + edad + ", vuelo=" + volar() + ", nadar=" + nadar() + '}';
    }
}
