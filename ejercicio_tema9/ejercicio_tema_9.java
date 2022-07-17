package ejercicio_tema9;

public class ejercicio_tema_9 {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.edad = 23;
        cliente.nombre = "Ramon";
        cliente.telefono = 0303456;
        cliente.credito = 1000;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        System.out.println("************************");

        
        Trabajador trabajador = new Trabajador();
            trabajador.edad = 35;
            trabajador.nombre = "Pedro";
            trabajador.telefono =123123123;
            trabajador.salario = 5000;

            System.out.println(trabajador.edad);
            System.out.println(trabajador.nombre);
            System.out.println(trabajador.telefono);
            System.out.println(trabajador.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
} 

class Trabajador extends Persona{
    int salario;
}
