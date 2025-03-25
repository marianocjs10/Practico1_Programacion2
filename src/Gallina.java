public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina() {
    }

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        huevosPuestos++;
    }
    public void envejecer(){
        edad++;
    }
    public void mostrarEstado(){
        System.out.println("ID Gallina: "+idGallina);
        System.out.println("Edad: "+edad);
        System.out.println("Huevos Puestos: "+huevosPuestos);
    }

}
