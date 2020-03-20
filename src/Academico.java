public class Academico extends Persona {
    private String paper;

    public Academico(String nombre, int edad, String paper) {
        super(nombre, "Academico", edad);
        this.paper = paper;
    }

    public void dormir() {
        System.out.println("ZzzZzZz");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "y aprender a usar Zoom";
    }

    public void publicarPaper(){
        System.out.println(this.paper);
    }
}
