public class sobre_carga {

    String nombre;
    int edad;
    String carrera;

    public sobre_carga(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 public sobre_carga(String carrera) {
        this.carrera = carrera;
    }
    public void actuar() {
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y estoy actuando en una obra de teatro");
    }

    public void actuar(String nombre_obra ) {
        System.out.println("La obra se llama "+nombre_obra);
    }

    public static void main(String[] args) {
        sobre_carga estudiante1 = new sobre_carga("Michell", 18);
        estudiante1.actuar();
        sobre_carga estudiante2 = new sobre_carga("Desarrollo de Software");
        estudiante2.actuar("Romeo y Julieta");
    }
}
