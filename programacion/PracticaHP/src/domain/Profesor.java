package domain;

public class Profesor extends Persona {
    
    protected int horas;
    protected String asignatura;
    protected String materia; // licenciatura de la clase profesor

    public Profesor(String nombre, String apellido, String curp, int horas, String asignatura, String materia) {
        super(nombre, apellido, curp);
        this.horas = horas;
        this.asignatura = asignatura;
        this.materia = materia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Hola mi nombre es " + nombre + " " + apellido + " y soy profesor de "
                + materia + " en la UNITEC, con la asignatura " + asignatura
                + " con una cantidad de " + horas + " a la semana";
    }

}