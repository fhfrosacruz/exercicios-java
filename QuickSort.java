package Modelo;
import javax.swing.JOptionPane;

public class QuickSort {
    

        public void Quick () {
   
               int quantidade = 10000;
               int[] vetor = new int[quantidade];
   
               for (int i = 0; i < vetor.length; i++) {
                       vetor[i] = (int) (Math.random()*quantidade);
               }
   
               long tempoInicial = System.currentTimeMillis();    /* função currentTimeMillis pega o tempo inicial */ 
   
               quickSort(vetor,0,vetor.length-1);
   
               long tempoFinal = System.currentTimeMillis();      /* função currentTimeMillis pega o tempo final */ 
   
               for(int i = 0; i < vetor.length; i++){
               System.out.print(vetor[i] + ",");
               }
               
               JOptionPane.showMessageDialog(null, "Executado em = " + (tempoFinal - tempoInicial) + " ms"); /* subtração do currentTime Millis do ti com tf para saber o tempo de execução */
   
         }
         
         private static void quickSort (int[] vetor, int inicio, int fim) {
               if (inicio < fim) {
                      int posicaoPivo = separar(vetor, inicio, fim);
                      quickSort(vetor, inicio, posicaoPivo - 1);
                      quickSort(vetor, posicaoPivo + 1, fim);
               }
         }
   
         private static int separar (int[] vetor, int inicio, int fim) {
               int pivo = vetor[inicio];
               int i = inicio + 1, f = fim;
               
               while (i <= f) {
                      if (vetor[i] <= pivo)
                             i++;
                      else if (pivo < vetor[f])
                             f--;
                      else {
                             int troca = vetor[i];
                             vetor[i] = vetor[f];
                             vetor[f] = troca;
                             i++;
                             f--;
                      }
               }
               vetor[inicio] = vetor[f];
               vetor[f] = pivo;
               return f;
         }
}