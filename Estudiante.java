public class Estudiante {

    String nombre;
    int edad;

    public Estudiante(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La edad del estudiante es: " + edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Michell",18);
        estudiante.mostrarDatos();
    }
}
