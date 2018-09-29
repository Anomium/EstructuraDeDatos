package Model;
public class Estudiante {
    private String NombreEstudiante;
    private String Codigo;
    private int PreguntasBuenas;
    private boolean Estado;

    public Estudiante(String NombreEstudiante, String Codigo, int PreguntasBuenas, boolean Estado) {
        this.NombreEstudiante = NombreEstudiante;
        this.Codigo = Codigo;
        this.PreguntasBuenas = PreguntasBuenas;
        this.Estado = Estado;
    }
    
    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPreguntasBuenas() {
        return PreguntasBuenas;
    }

    public void setPreguntasBuenas(int PreguntasBuenas) {
        this.PreguntasBuenas = PreguntasBuenas;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
}
