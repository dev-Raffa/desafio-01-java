package diodesafio01.bag;

import java.util.Scanner;

import diodesafio01.bag.enums.BagEnums;
import diodesafio01.interneexplorer.InternetExplorer;
import diodesafio01.interneexplorer.enums.BrowserEnum;
import diodesafio01.iphone.Iphone;
import diodesafio01.iphone.enums.IphoneEnums;
import diodesafio01.ipod.Ipod;
import diodesafio01.ipod.enums.ReprodutorEnum;
import diodesafio01.motorola.Motorola;
import diodesafio01.motorola.enums.TelefoneEnum;

public class Bag {
    Scanner scn = new Scanner(System.in);
    boolean power = true;
    BagEnums aparelho;
    
    
    public Bag(String aparelho){
        this.aparelho = BagEnums.valueOf(aparelho);
    }

    public void pegarAparelho(){
        switch (aparelho) {
            case IPOD :
                scn.reset();
                while(power){
                    try {
                        System.out.println("escolha uma opção: ");
                        
                        for(ReprodutorEnum opcao: ReprodutorEnum.values()){
                            System.out.println(opcao);
                        }
                        String opcaoEscolhida = scn.next().toUpperCase();
                        
                        Ipod itunes = new Ipod(opcaoEscolhida);
                        itunes.executarAcao();
                        
                        System.out.println("Deseja testar outra opção(S/N) ?");
                        String resp = scn.next();
                        
                        if(resp.matches("n|N")){ this.power = false;};

                    } catch (IllegalArgumentException e) {
                        System.out.println("Opçao inválida!");
                    }
                }
                break;
            case MOTOROLA:
                scn.reset();
                while(power){
                    try {
                        System.out.println("escolha uma opção: ");
                        
                        for(TelefoneEnum opcao: TelefoneEnum.values()){
                            System.out.println(opcao);
                        }
                        String opcaoEscolhida = scn.next().toUpperCase();
                        
                        Motorola telefone = new Motorola(opcaoEscolhida);
                        telefone.executarAcao();

                        System.out.println("Deseja testar outra opção(S/N) ?");
                        String resp = scn.next();
                        System.out.println(resp);
                        
                        if(resp.matches("^n|N")){ 
                            this.power = false;
                            System.out.println(power);
                            return;
                        };

                    } catch (IllegalArgumentException e) {
                        System.out.println("Opçao inválida!");
                    }
                }
                
                break;
            case INTERNETEXPLORER:
                scn.reset();
                while(power){
                    try {
                        System.out.println("escolha uma opção: ");
                        
                        for(BrowserEnum opcao: BrowserEnum.values()){
                            System.out.println(opcao);
                        }
                        String opcaoEscolhida = scn.next().toUpperCase();
                        
                        InternetExplorer itunes = new InternetExplorer(opcaoEscolhida);
                        itunes.executarAcao();
                    
                        System.out.println("Deseja testar outra opção(S/N) ?");
                        String resp = scn.next();

                        if(resp.matches("n|N")){ this.power = false;};

                    } catch (IllegalArgumentException e) {
                        System.out.println("Opçao inválida!");
                    }
                }
                
                break;
            case IPHONE:
                scn.reset();
                while(power){
                    try {
                        System.out.println("escolha uma opção: ");
                        
                        for(IphoneEnums opcao: IphoneEnums.values()){
                            System.out.println(opcao);
                        }
                        String opcaoEscolhida = scn.next().toUpperCase();
                        
                        Iphone iphone = new Iphone(opcaoEscolhida);
                        iphone.abrirApp();
                    
                        System.out.println("Deseja testar outra opção(S/N) ?");
                        String resp = scn.next();
                        
                        if(resp.matches("n|N")){ this.power = false;};

                    } catch (IllegalArgumentException e) {
                        System.out.println("Opçao inválida!");
                    }
                }
                
                break;
            default:
                break;
        }
    }
}