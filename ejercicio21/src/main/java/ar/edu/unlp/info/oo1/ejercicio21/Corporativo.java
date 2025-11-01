package ar.edu.unlp.info.oo1.ejercicio21;

public class Corporativo extends Cliente {
    
    private String empresa;
    private long CUIT;

    public Corporativo() {
        super();
        this.setEmpresa("");
        this.setCUIT(0);
    }

    public Corporativo(String direccion, String empresa, long cuit) {
        super(direccion);
        this.setEmpresa(direccion);
        this.setCUIT(cuit);
    }

    public String getEmpresa() {
        return this.empresa;
    }

    private void setEmpresa(String company) {
        this.empresa = company;
    }

    public long getCUIT() {
        return this.CUIT;
    }

    private void setCUIT(long cuit) {
        this.CUIT = cuit;
    }

}
