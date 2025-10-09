package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs;
    protected JobDescription nextJob;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.nextJob = null;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }
    
    public List<JobDescription> getJobs(){
        return jobs;
    }

    public abstract JobDescription next();

}
