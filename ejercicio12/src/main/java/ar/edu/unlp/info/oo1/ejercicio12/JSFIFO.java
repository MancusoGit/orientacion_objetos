package ar.edu.unlp.info.oo1.ejercicio12;

public class JSFIFO extends JobScheduler {

    public JSFIFO() {
        super();
    }

    public JobDescription next() {
        this.nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
    }

}
