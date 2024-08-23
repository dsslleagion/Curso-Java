// estrutura ao if-else quando se deseja decidir um valor com base em uma
// condição.
//Sintaxe:
// (condição) ? valor_se_verdadeiro : valor_se_falso
//ex:
//
//(2 > 4) ?  50: 80     saida: 80  
//
//
//(10 != 3) ? "Maria": "Alex"  saida: Maria
//

import java.util.Locale;

public class aula{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double preco = 34.5;
       

        // if(preco< 20.0){
        //     desconto = preco * 0.1;
            
        // }else{
        //     desconto = preco * 0.05;
            
        // }

       double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; 
       
       System.out.println(desconto);
       
    }
}