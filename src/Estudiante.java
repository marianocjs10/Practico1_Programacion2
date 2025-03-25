import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(){
    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public void mostrarInfo(){
        System.out.println("----- Información del estudiante -----");
        System.out.println(
                "Nombre: "+nombre+
                "\nApellido: "+apellido+
                "\nCurso: "+curso+
                "\nCalificación: "+calificacion);
        System.out.println("--------------------------------------");
    }
    public double subirCalificacion(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Ingrese los puntos que desea aumentar: ");
            double aumento = Double.parseDouble(input.nextLine());
            if ((calificacion+aumento) <= 10) {
                calificacion = calificacion + aumento;
                return calificacion;
            } else {
                System.out.println("La calificación no puede ser mayor a 10. Intente de nuevo...");
            }
        }
    }
    public double bajarCalificacion(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Ingrese los puntos que desea bajar: ");
            double baja = Double.parseDouble(input.nextLine());
            if ((calificacion - baja) >= 0) {
                calificacion = calificacion - baja;
                return calificacion;
            } else {
                System.out.println("La calificación no puede ser menor a 0. Intente de nuevo...");
            }
        }
    }
}
