import java.util.Iterator;

public class ParcialArboles {

    public static boolean resolver(GeneralTree<Ejercicio> arbol, int rep) {
        boolean ok = false; int suma = 0;
        if (arbol != null && !arbol.isEmpty()) {
            ok = privResolver(arbol,suma,rep);
        }
        return ok;
    }

    private static boolean privResolver(GeneralTree<Ejercicio> ar, int suma, int reps) {
        boolean ok = true;
        suma += ar.getData().getRepeticiones();
        ok = suma < reps;
        if (ar.hasChildren() && ok) {
            Iterator<GeneralTree<Ejercicio>> it = ar.getChildren().iterator();
            while(it.hasNext() && ok) {
                ok = privResolver(it.next(), suma, reps);
            }
        } else {
            ok = suma == reps;
        }
        return ok;
    }

    public static void main(String[] args) {
        Ejercicio ej = new Ejercicio(2);
        Ejercicio ej2 = new Ejercicio(3);
        GeneralTree<Ejercicio> ar = new GeneralTree<>();
        ar.setData(ej);
        GeneralTree<Ejercicio> aux = new GeneralTree<>();
        aux.setData(ej);
        for (int i = 0; i < 3; i++) {
            ar.addChild(aux);
        }
        System.out.println("imprimir primer resultado: " + resolver(ar,4));

        aux.setData(ej2);
        ar.addChild(aux);

        System.out.println("imprimir segundo resultado: " + resolver(ar, 4));
    }

}
