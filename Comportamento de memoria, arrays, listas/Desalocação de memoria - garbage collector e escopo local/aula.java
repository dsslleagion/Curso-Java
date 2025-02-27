/*
 * Garbage collector 
 * 
 * é o processo que automatiza o gerenciamento de memória de um programa em execução
 * 
 * o garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap), 
 * desalocando aqueles que não estão mais sendo utilizados
 *  
 */
public class aula{
    public static void main(String[] args) {
     
        
        

        
    }
    // Desalocação por escopo 
    void method1(){
        int x = 10;
        if(x>0){
            int y =20;
        }System.out.println(x);
    }
}