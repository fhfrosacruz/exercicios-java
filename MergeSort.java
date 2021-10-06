package Controle;

import javax.swing.JOptionPane;


   class MergeSort {
            /* Merge divide vetor em dois vetores */
            /* Primeiro vetor é [l..m] */
            /* Segundo vetor é [m+1..r]  */ 
            
            void merge(int vetor[], int l, int m, int r) {
                 /* Encontra o tamanho dos dois vetores para serem divididos e comparados */
                int n1 = m - l + 1;
                int n2 = r - m;
 
                    /* Cria um vetor temporário */
                    int L[] = new int [n1];
                    int R[] = new int [n2];
 
                    /* Copia os dados do vetor temporário */
                    for (int i=0; i<n1; ++i)
                        L[i] = vetor[l + i];
                    for (int j=0; j<n2; ++j)
                        R[j] = vetor[m + 1+ j];
 
 
                         /* Vetor temporário do Merge */
 
                        /* Os índices iniciais do primeiro e segundo vetor */
                        int i = 0, j = 0;
 
                        /* índice inicial do subvetor mesclado */
                        int k = l;
                            
                        while (i < n1 && j < n2) {
                            if (L[i] <= R[j]) {
                                vetor[k] = L[i];
                                i++;
                        }
                            else {
                                vetor[k] = R[j];
                                j++;
                        }
                                k++;
                    }   
 
                        
                        
                     /* Copia o elemento remanescente de L[] caso exista */
                    while (i < n1) {
                        vetor[k] = L[i];
                        i++;
                        k++;
                    }
                    
 
                         /* Copia os elementos remanescentes de R[] caso exista */
                             while (j < n2) {
                                vetor[k] = R[j];
                                j++;
                                k++;
                            }
                         }
 
                    /* Função principal que declara o vetor vetor[l..r] usando merge */
                        void sort(int vetor[], int l, int r) {
                            if (l < r) {
            
                        /* Encontra a metade do ponto */
                            int m = (l+r)/2;
 
                    /* Declara a primeira e a segunda metade do vetor  */
                        sort(vetor, l, m);
                        sort(vetor , m+1, r);
 
                        /* Merge é divido ao meio */
                            merge(vetor, l, m, r);
        }
    }
 
                    /* Uma função de utilidade para imprimir um vetor de tamanho n */
    
                            static void printArray(int vetor[]) {
                                 int n = vetor.length;
                                    for (int i=0; i<n; ++i)
                                        System.out.print(vetor[i] + " ");
                                        System.out.println();
    }
 
                                /* MAIN */
                public static void main (String args[]) {
        
                    int quantidade = 100000;
                    int vetor[] =  new int [quantidade]; //{12, 11, 13, 5, 6, 7};
 
                        for(int i = 0; i < vetor.length; i++){
                            vetor[i] = (int) (Math.random()*quantidade);
                        }
        
        MergeSort ob = new MergeSort();
                ob.sort(vetor, 0, vetor.length-1);
        
                     /* cria um objeto de merge */
                         for(int i = 0; i < vetor.length; i++){
                            System.out.print(vetor[i] + ",");
               }
                         
                long tempoInicial = System.currentTimeMillis();    /* função currentTimeMillis pega o tempo inicial */ 
                ob.sort(vetor, 0, vetor.length-1);
                long tempoFinal = System.currentTimeMillis();      /* função currentTimeMillis pega o tempo final */ 
                JOptionPane.showMessageDialog(null, "Executado em = " + (tempoFinal - tempoInicial) + " ms"); /* subtração do currentTime Millis do ti com tf para saber o tempo de execução */
       
         
                            /* Pega o tempo de execução em MS */
             
       
    }
}