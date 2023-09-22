package diodesafio01.app;


import java.util.Scanner;

import diodesafio01.bag.Bag;
import diodesafio01.bag.enums.BagEnums;


public class App {
    

    public static void main( String[] args ) {
        Scanner scn = new Scanner(System.in);
        boolean power = true;

        while(power){
            scn.reset();
                     
            try {
                System.out.println("escolha uma opção: ");

                for(BagEnums opcao: BagEnums.values()){
                    System.out.println(opcao);
                }
                String opcaoEscolhida = scn.next().toUpperCase();
                
                Bag bag = new Bag(opcaoEscolhida);
                bag.pegarAparelho();
            } catch (IllegalArgumentException e) {
                System.out.println("Opçao inválida!");
            }

            System.out.println("deseja experimentar outro aparelho(S/N) ?");
            String next = scn.next();

            if(next.matches("n|N")){
                power = false;
            }
        }
        scn.close();

    }

}
