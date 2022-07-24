public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente ();
        Trabajador trabajador = new Trabajador();
        cliente.Nombre = "Verónica";
        cliente.Edad = 22;
        cliente.telefono = 021520201;
        cliente.credito = 180.55;
        System.out.println("Soy  " +  cliente.Nombre +  " , tengo "  + cliente.Edad + " años y mi telefono es  " + cliente.telefono  + " y mi salario es de  " + cliente.credito + "$"  );


        trabajador.Nombre = "Jose";
        trabajador.Edad = 42;
        trabajador.telefono = 021031123;
        trabajador.salario = 2000.30;
        System.out.println("Soy " + trabajador.Nombre + ", tengo " + trabajador.Edad + " años y mi telefono es  " + trabajador.telefono + " y mi salario es de " + trabajador.salario + "$");

    }
}

class Persona {
    int Edad;
    int telefono;
    String Nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}