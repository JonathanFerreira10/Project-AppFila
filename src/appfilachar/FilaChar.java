/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfilachar;


   
public class FilaChar {
    
    private int quantidade;
    private char fila[];
     
    //Constructor
    public FilaChar(int tamanho) {
        fila = new char [tamanho];
        quantidade = 0;
    }
    
    //Metodo para verificar se está vazio
    public boolean isEmpty() {
        return quantidade==0;
    }
    
    //Metodo para verificar se está cheio
    public boolean isFull() {
        return quantidade==fila.length;
    }
    
    //Meotodo para verificar o tamanho
    public int size() {
        return quantidade;
    }
    
    //Metodo para verificar o valor que está a frente
    public char front() {
        return isEmpty() ? ' ' : fila[0] ;
    }
    
    //Metodo para Inserir
    public boolean enqueue(char valor) {
        if (!isFull()) {
            fila[quantidade++]=valor;
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para remover
    public char dequeue() {
        char temp = fila[0];
        if (!isEmpty()) {
            for (int i=0;i<=quantidade;i++) {
                fila[i]=fila[i+1];
            }   
            quantidade--;
            return temp;
        } else {
            return ' ';
        }
    }
    
    //Metodo para imprimir 
    public String printFila() {
        String printFila = "";
        for (int i = 0; i < fila.length; i++) {
            printFila += (i<quantidade-1) ?  fila[i] + ", " : fila[i];                              
        }                    
        return printFila;
    }
   
}
    


   
