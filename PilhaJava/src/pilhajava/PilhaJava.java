/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhajava;

import java.util.Scanner;

/**
 *
 * @author 10698079663
 */
public class PilhaJava {

    /**
     * @param args the command line arguments
     */
    
    
    private static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Mostrar topo");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada: %n", "UTF-8");
        return scanner.nextInt();

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         int tamanho,op=0, elemento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho da pilha:");
        tamanho = scanner.nextInt();
        Pilha<Integer> pilha = new Pilha<>(tamanho);

        
        
        do{
            op = mostrarMenu();
            switch(op){
                case 1: System.out.println("Elemento:");
                        elemento = scanner.nextInt();
                        if(pilha.push(elemento)==true)
                             System.out.println("Insercao realizada");
                        else
                            System.out.println("Stack Overflow!");
                break;
                case 4:System.out.println("Elementos da pilha\n");
                        System.out.println(pilha);
                
            }
            System.out.println("Pressione uma tecla para continuar\n");
            scanner.nextLine();
        }while(op!=0);

        
    }
    
   
    
}
