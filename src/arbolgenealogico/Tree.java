package arbolgenealogico;

import java.util.ArrayList;
import javax.swing.JPanel;

public class Tree extends JPanel{
    // declaracion de variables
    Tree familia;
    String principal = "digraph n{ ";
    Node raiz;
    Node resultado = null;
    int contador = 0;
    int contador2 = 0;
    ArrayList<String> nodosVisitados = new ArrayList<>();
    
    public Tree() {
        raiz = null;
    }
    
    public String getCabeza() {
        return principal;
    }
    
    public void setCabeza(String principal) {
        this.principal = principal;
    }
    
    public Node buscarHijo(String nombre) {
        return (buscarHijo(raiz, nombre));
    }
    
    public int buscar(String nombre_nodo) {
        int pos = nodosVisitados.indexOf(nombre_nodo);

        return pos;
    }
    
    public void insert(String hijo, String padre) {
        raiz = insert(raiz, hijo, padre);
    }
    
    private Node buscarHijo(Node node, String buscado) {
        if (node == null) {
            resultado = null;
        }
        if (buscado.equalsIgnoreCase(node.texto)) {
            resultado = node;
        }
        for (Node temporal : node.hijos) {
            buscarHijo(temporal, buscado);
        }
        return resultado;
    }
    
    public Node insert(Node nodo, String hijo, String padre) {
        if (nodo == null) {
            nodo = new Node(hijo);
        } else {
            Node nodoPadre = buscarHijo(padre);
            if (nodoPadre != null) {
                nodoPadre.hijos.add(new Node(hijo));
            } else {
                nodo.hijos.add(new Node(hijo));
            }
        }
        return nodo;
    }
    
    private void find(Node hijo, Tree familia2) {
        if (hijo != null) {
            String no_existe = "null";
            nodosVisitados.add(hijo.texto);
            contador++;
            for (Node temporal : hijo.hijos) {
                if (temporal == null) {
                    no_existe = "null" + contador2;
                    contador2++;
                }
                find(temporal, familia2);
            }
        }
    }
    
    public void asignar(Node hijo, Tree familia2) {
        if (hijo != null) {
            for (Node temporal : hijo.hijos) {
                if (temporal != null) {
                    principal += nodosVisitados.get(buscar(hijo.texto))+"  ";
                    System.out.printf("%-10s", nodosVisitados.get(buscar(hijo.texto)));
                    System.out.printf("%10s","->");
                    System.out.printf("%15s%n", nodosVisitados.get(buscar(temporal.texto)));
                    principal += "  ->  "+nodosVisitados.get(buscar(temporal.texto))+"  ";
                } else {
                }
                asignar(temporal, familia2);
            }
            
           
        }
    }
    
    public void PintarArbol(Tree arbol) {
        find(raiz, arbol);
        asignar(raiz, arbol);
    }
}
