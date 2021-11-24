public class Pinguino extends Ave {

    public Pinguino(VolarStrategy vuelo, NadarStrategy nado) {
        super(vuelo , nado);
        this.setRaza("Spheniscus demersus (Pingüino del el cabo)");
        this.setColor("BW"); 
        this.setEdad(1);
        this.setSize("Big");
    }
    
}
