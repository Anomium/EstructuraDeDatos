package Model;
public class Examen {
    private String Codigo;
    private int NumeroPregutas;

    public Examen(String Codigo, int NumeroPregutas) {
        this.Codigo = Codigo;
        this.NumeroPregutas = NumeroPregutas;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumeroPregutas() {
        return NumeroPregutas;
    }

    public void setNumeroPregutas(int NumeroPregutas) {
        this.NumeroPregutas = NumeroPregutas;
    }
    
}
