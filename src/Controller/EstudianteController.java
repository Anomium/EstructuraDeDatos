package Controller;
import java.util.Stack;
import Model.Estudiante;
import Model.Examen;
import java.util.ArrayList;
import java.util.List;
public class EstudianteController {

    Stack<Estudiante> pila = new Stack();
    List<Estudiante> lista = new ArrayList();
    Stack<Examen> pilae = new Stack();
    
    
    public void Create(Examen exa){
        pilae.add(exa);
    }
    
    public void Create(Estudiante estu){
        pila.add(estu);
    }
    
    public void Update(int index, Estudiante estu){
        lista.add(estu);
        pila.remove(index);
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
    
    public ArrayList<String[]> ReadCalif(){
        ArrayList<String[]> Get = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            Get.add(new String[]{
                lista.get(i).getCodigo(),
                lista.get(i).getNombreEstudiante(),
                String.valueOf(pilae.get(i).getNumeroPregutas()),
                String.valueOf(pilae.get(i).getNumeroPregutas() - lista.get(i).getPreguntasBuenas())
                
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
