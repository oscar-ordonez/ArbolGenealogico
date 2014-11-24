
package arbolgenealogico;

import java.util.ArrayList;

/**
 *
 * @author Jossy
 */
public class Node {
    ArrayList<Node> hijos;
    String texto;    
    Node(){
    }
    
    Node(String nombre) {
      texto = nombre;
      hijos = new ArrayList<>();
    } 

    void setValor(String texto){
        this.texto = texto;
    }
    public String getValor() {
        return texto;
    }
}
