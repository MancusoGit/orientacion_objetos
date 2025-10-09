package ar.edu.unlp.info.oo1.ejercicio12;

public class JSHighestPriority extends JobScheduler {
    public JSHighestPriority() {
        super();
    }

    public JobDescription next() {
        this.nextJob = jobs.stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
        this.unschedule(nextJob);
        return nextJob;
    }
}
