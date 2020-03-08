/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfilachar;
public class AppFilaChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilaChar fila1 = new FilaChar(10);        
        FilaChar fila2 = new FilaChar(10);
        
        FilaCircularChar filaC1 = new FilaCircularChar(10);
        FilaCircularChar filaC2 = new FilaCircularChar(10);
        
        fila1.enqueue('j');        
        fila1.enqueue('o');
        fila1.enqueue('n');        
        fila1.enqueue('a');        
        fila2.enqueue('t');        
        fila2.enqueue('h');
        fila2.enqueue('a');
        fila2.enqueue('n');
        
        fila1.dequeue();        
        fila2.dequeue();
        
        System.out.println("Fila 1: " + fila1.printFila());            
        System.out.println("Fila 2: " + fila2.printFila());          
              
        System.out.println("\nPróximo: 1='" + fila1.front() + "' 2='" + fila2.front() + "'");       
        System.out.println("Tamanho: 1=" + fila1.size() + "   2=" + fila2.size());

        System.out.println( fila1.size()>fila2.size() ? "\nFila 1 Maior" : "\nFila 2 Maior");
        
        filaC1.enqueue('j');
        filaC1.enqueue('o');
        filaC1.enqueue('n');
        filaC1.enqueue('a');
        filaC2.enqueue('t');
        filaC2.enqueue('h');
        filaC2.enqueue('a');
        filaC2.enqueue('n');
        
        filaC1.dequeue(); 
        filaC2.dequeue(); 
        
        System.out.println("\nPróximo: 1='"+ filaC1.front() + "'2='" + filaC2.front() + "'");
        System.out.println("Tamanho: 1=" + filaC1.size() + " 2=" + filaC2.size()); 
        
        System.out.println(filaC1.size() > filaC2.size() ? "\nFila 1 Maior" : "\nFila 2 Maior"); 
        


    }
    
}
    
    

