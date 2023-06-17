package domain;

public class Estudiante extends Persona  {
    
    protected long matricula;
    protected int cuatrimestre;
    protected String licenciatura;

    public Estudiante(String nombre, String apellido, String curp, long matricula, int cuatrimestre, String licenciatura) {
        super(nombre, apellido, curp);
        this.matricula = matricula;
        this.cuatrimestre = cuatrimestre;
        this.licenciatura = licenciatura;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    @Override
    public String toString() {
        return "Hola mi nombre es " + nombre + " " + apellido + " y soy estudiante de " + licenciatura
                + " en la UNITEC, curso el " + cuatrimestre + " cuatrimestre y mi matricula es " + matricula;
    }

}