public class Estudiante extends Persona {

    public Estudiante (String nombre, int edad){
        super(nombre, "Estudiante", edad);
    }

    public void comer(){System.out.println("Completos de gorbea");}

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "y ver anime y Netflix";
    }
}
