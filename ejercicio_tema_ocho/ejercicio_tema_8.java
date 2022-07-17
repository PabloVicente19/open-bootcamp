package ejercicio_tema_ocho;

import javax.sound.sampled.SourceDataLine;

// import java.util.function.Function;

// import javax.sound.sampled.SourceDataLine;

public class ejercicio_tema_8 {
    public static void main(String[] args) {
    Persona persona = new Persona();
    
    persona.setEdad(29);
    int edad = persona.getEdad();
    
    persona.setNombre("pablo");
    String nombre = persona.getNombre();
    
    persona.setTelefono(123123123);
    int telefono = persona.getTelefono();

    System.out.println(edad);
    System.out.println(nombre);
    System.out.println(telefono);
  }
    
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
    this.edad = edad;
    }
    public int getEdad(){
    return this.edad;
    }

    public void setNombre(String nombre){
      this.nombre = nombre;
      }
      public String getNombre(){
      return this.nombre;
      }

      public void setTelefono(int telefono){
        this.telefono = telefono;
        }
        public int getTelefono(){
        return this.telefono;
        }
}


    
