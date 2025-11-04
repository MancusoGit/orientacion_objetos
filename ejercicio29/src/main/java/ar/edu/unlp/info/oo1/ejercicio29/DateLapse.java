package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    private LocalDate from;
    private LocalDate to;

    public DateLapse() {
        this.setDesde(null);
        this.setHasta(null);
    }

    public DateLapse(LocalDate desde, LocalDate hasta) {
        this.setDesde(desde);
        this.setHasta(hasta);
    }

    public LocalDate getFrom() {
        return this.from;
    }

    private void setDesde(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return this.to;
    }

    private void setHasta(LocalDate to) {
        this.to = to;
    }

    public boolean includesDate(LocalDate fecha) {
        return fecha.isAfter(this.getFrom()) && fecha.isBefore(this.getTo());
    }

    public int sizeInDays() {
        return (int) ChronoUnit.DAYS.between(this.getFrom(), this.getTo());
    }

    public boolean overlaps(DateLapse otro) {
        return this.getFrom().isBefore(otro.getTo()) && otro.getFrom().isBefore(this.getTo());
    }

}
