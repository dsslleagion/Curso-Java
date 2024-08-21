// quando se tem varias opções de fluxo a serem 
// tratadas com base no valor de uma unica variavel 
// , ao inves de varias estruturas if-else encadeadas,
// alguns preferem utilizar a estrutura switch-case

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {
        // //metodo tradicional com if
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // String dia;

        // if(x == 1){
        //     dia ="Domingo";
        // }else if(x==2){
        //     dia ="Segunda-feira";
        // }else if(x==3){
        //     dia ="Terça-feira";
        // }else if(x==4){
        //     dia ="Quarta-feira";
        // }else if(x==5){
        //     dia ="Quinta-feira";
        // }else if(x==6){
        //     dia ="Sexta-feira";
        // }else if(x==7){
        //     dia ="Sabado";
        // }else{
        //     dia = "valor invalido";
        // }

        // System.out.println("Dia da semnana: "+ dia);

        //metodo tradicional com if
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch(x){
            case 1:
            dia = "domingo";
            break;
            case 2:
            dia = "Segunda-feira";
            break;
            case 3:
            dia = "Terça-feira";
            break;
            case 4:
            dia = "Quarta-feira";
            break;
            case 5:
            dia = "Quinta-feira";
            break;
            case 6:
            dia = "Sexta-feira";
            break;
            case 7:
            dia = "Sabado-feira";
            break;
            default:
            dia = "valor invalido";
            break;
        }

        System.out.println("Dia da semnana: "+ dia);
  

    }

}