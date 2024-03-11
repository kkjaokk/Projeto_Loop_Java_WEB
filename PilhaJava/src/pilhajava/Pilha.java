/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhajava;

import java.util.Scanner;

/**
 *
 * @author 10698079663
 */
public class Pilha<T> {
    
    private int topo;
    private T[] elementos;
    
    public Pilha (int tamanho){
        
        elementos = (T[]) new Object[tamanho];
        this.topo = -1;
        
    }
    
    public boolean isFull(){
        return topo==elementos.length-1;
        
    }
    
    public boolean isEmpty(){
        
        if(topo == -1){
            
            return true;
            
        }return false;
        
    }
    
    public boolean push (T novoDado){
        
        if(!this.isFull()){
            
            elementos[++topo] = novoDado;
            return true;
            
        }
        
        return false;
        
    }
    
    public T pop(){
        
        //return elementos [topo--];
        
        T retorno = elementos [topo--];
        topo--;
        return retorno;
        
    }
    
public int size(){
       
    return topo+1;
    
}

public T peek(){
    
     T retorno = elementos[topo];
     
     return retorno;
     
}
   
    
@Override

public String toString(){

    StringBuilder retorno = new StringBuilder();
    for(int i=topo;i>=0;i--)
        retorno.append(elementos[i]+"\n");
    retorno.append("---------------------");
    
    return retorno.toString();

}




    
}


