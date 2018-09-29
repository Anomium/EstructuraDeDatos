package Controller;
import java.util.Stack;
import Model.Estudiante;
import java.util.ArrayList;
public class EstudianteController {
    Stack<Estudiante> pila = new Stack();
    
    public void Create(Estudiante estu){
        pila.add(estu);
    }
    
    public void Update(){
        
    }
    
    public ArrayList<String[]> ReadAll(){
        ArrayList<String[]> Get = new ArrayList();
        for (int i = 0; i < pila.size(); i++) {
            Get.add(new String[]{
                pila.get(i).getCodigo(),
                String.valueOf(pila.get(i).getNombreEstudiante())
            });
        }
        
        return Get;
    }
    
    public void Delete(){
        
    }

    public Stack<Estudiante> getPila() {
        return pila;
    }

    public void setPila(Stack<Estudiante> pila) {
        this.pila = pila;
    }
    
    
}
