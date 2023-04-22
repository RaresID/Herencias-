/*Crea ahora un objeto de la clase Cliente que debe tener como propiedades
la edad, el telefono, el nombre y el credito, tienes que
darles valor y mostrarlas por pantalla.*/
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 22;
        cliente.teléfono = 622331235;
        cliente.nombre = "Raul";
        cliente.credito = 200.55F;

        System.out.println("el cliente tiene " + cliente.edad + " años");
        System.out.println("el teléfono del cliente es " + cliente.teléfono);
        System.out.println("el nombre del cliente es " + cliente.nombre);
        System.out.println("el credito del cliente son " + cliente.credito + " euros");

        /*Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona
        y con una variable salario que solo tenga la clase Trabajador.*/

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.teléfono = 699021103;
        trabajador.nombre = "Pedro";
        trabajador.salario = 199.99F;

        System.out.println("el trabajador tiene " + trabajador.edad + " años");
        System.out.println("el teléfono del trabajador es " + trabajador.teléfono);
        System.out.println("el nombre del trabajador es " + trabajador.nombre);
        System.out.println("el salario del trabajador son " + trabajador.salario + " euros");
    }
}

/*Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono*/
class Persona{
    int edad;
    String nombre;
    int teléfono;
}
/*Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
 esta nueva clase tendrá la variable credito solo para esa clase.*/
class Cliente extends Persona{
    float credito;
}
class Trabajador extends Persona{
    float salario;
}