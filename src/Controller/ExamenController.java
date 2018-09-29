package Controller;
import Model.Examen;
import java.util.ArrayList;
import java.util.Stack;
public class ExamenController {
    Stack<Examen> pila = new Stack();
    
    public void Create(Examen exa){
        pila.add(exa);
    }
    
    public void Update(){
        
    }
    
    public ArrayList<String[]> ReadAll(){
        ArrayList<String[]> Get = new ArrayList();
        for (int i = 0; i < pila.size(); i++) {
            Get.add(new String[]{
                pila.get(i).getCodigo(),
                String.valueOf(pila.get(i).getNumeroPregutas())
            });
        }
        
        return Get;
    }
    
    public void Delete(){
        
    }
}
