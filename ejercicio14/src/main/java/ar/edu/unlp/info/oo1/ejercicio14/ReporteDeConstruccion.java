package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.ArrayList;

public class ReporteDeConstruccion {

    private ArrayList<Pieza> piezas;

    public double volumenDeMaterial(String material) {
        double total = 0;
        for (Pieza piece : piezas) {
            if (piece.coincideMaterial(material)) {
                total += piece.calcularVolumen();
            }
        }
        return total;
    }

    public double superficieDeColor(String color) {
        double total = 0;
        for (Pieza piece : piezas) {
            if (piece.coincideColor(color)) {
                total += piece.calcularSuperficie();
            }
        }
        return total;
    }

}
