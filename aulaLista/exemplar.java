package aulaLista;

import java.util.ArrayList;

public class exemplar {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("1");
        lista.add(1.0f);
        System.out.println(lista.size()); 
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        lista.remove(1);
    }
}
