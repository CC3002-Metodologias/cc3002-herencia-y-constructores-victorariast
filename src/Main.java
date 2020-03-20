public class Main {

    public static void main(String[] args) {

        Persona p = new Persona("A", "Nada", 20);
        Estudiante e = new Estudiante("B",21 );
        Academico a = new Academico("C", 22, "Best paper");

        p.comer();
        p.dormir();
        System.out.println(p.hacerLoSuyo() + "\n");

        e.comer();
        e.dormir();
        System.out.println(e.hacerLoSuyo() + "\n");

        a.comer();
        a.dormir();
        a.publicarPaper();
        System.out.println(a.hacerLoSuyo() + "\n");
    }
}
