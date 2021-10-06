package Modelo;
import java.util.Vector;

public class BubbleSort {
    private Vector<Vector> bubbleSort(Vector<Vector> vetor){
        boolean troca = true;
                      
        while (troca) {
            troca = false;
                                
            for (int i = 0; i < vetor.size() - 1; i++) {
                if (Double.parseDouble(vetor.get(i).get(1).toString()) > Double.parseDouble(vetor.get(i + 1).get(1).toString())) {
                    Vector aux;
                    aux = vetor.get(i);
                    vetor.set(i, vetor.get(i + 1));
                    vetor.set(i+1, aux);
                    troca = true;
                }
            }
        }
        return vetor;
    }
}