package ar.edu.unlp.info.oo1.ejercicio29;

public class Video extends Actividad {

    public Video(String ip, double duracionTotal, double duracionPublicidad) {
        super(ip, (duracionTotal - duracionPublicidad));
    }

    @Override
    public double calcularPrecioActividad() {
        return this.getDuracion() * 10;
    }
}
