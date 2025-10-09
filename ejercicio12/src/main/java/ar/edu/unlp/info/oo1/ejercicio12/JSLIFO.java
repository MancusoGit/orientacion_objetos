package ar.edu.unlp.info.oo1.ejercicio12;

public class JSLIFO extends JobScheduler {
    
    public JSLIFO() {
        super();
    }

    public JobDescription next() {
        this.nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
    }

}
