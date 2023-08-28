public class alumno {

   private String nombre;
    private int edad;
    private String carrera;

    public alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 public alumno(String carrera) {
        this.carrera = carrera;
    }
    public void actuar() {
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y estoy actuando en una obra de teatro");
    }

    public void actuar(String nombre_obra ) {
        System.out.println("La obra se llama "+nombre_obra);
    }
public void setNombre(String nombre){
this.nombre=nombre;
}
public void setEdad(int edad){
this.edad=edad;
}
public void setCarrera(String carrera){
this.carrera=carrera;
}


public String getNombre(){
return nombre;
}
public int getEdad(){
return edad;
}
public String getCarrera(){
return carrera;
}
    public static void main(String[] args) {
        alumno estudiante1 = new alumno("Michell", 18);
        estudiante1.actuar();
        alumno estudiante2 = new alumno("Desarrollo de Software");
        estudiante2.actuar("Romeo y Julieta");
     
    System.out.println("Nombre "+estudiante1.getNombre());
    System.out.println("Edad "+estudiante1.getEdad());
    System.out.println("Carrera "+estudiante2.getCarrera());

    estudiante1.setNombre("Maria");
    estudiante1.setEdad(18);
    estudiante2.setCarrera("Negocios Internacionales");
    
     System.out.println("Nombre "+estudiante1.getNombre());
    System.out.println("Edad "+estudiante1.getEdad());
    System.out.println("Carrera "+estudiante2.getCarrera());
    }
}