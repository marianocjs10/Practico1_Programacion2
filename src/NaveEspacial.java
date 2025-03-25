public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar(){
        if(combustible < 10){
            System.out.println("La nave no puede despegar con menos de 10 unidades de combustible.");
        }else {
            combustible = combustible - 10;
            System.out.println("La nave despegó.");
        }
    }

    public void avanzar(int distancia){
        if(distancia <= combustible){
            combustible = combustible - distancia;
            System.out.println("Se recorrieron "+distancia+" unidades de distancia.");
        }else{
            System.out.println("No hay suficiente combustible para recorrer "+distancia+" unidades de distancia.");
        }
    }

    public void recargarCombustible(int cantidad){
        if((combustible + cantidad) <= 100){
            combustible = combustible+cantidad;
            System.out.println("Se recargaron "+cantidad+" unidades de combustible");
        }else{
            System.out.println("El combustible no puede superar las 100 unidades.");
        }
    }

    public void mostrarEstado(){
        System.out.println("--- Estado de la nave ---");
        System.out.println("Nombre de la nave: "+nombre);
        System.out.println("Combustible: "+combustible);
        System.out.println("--------------------------");
    }

}
