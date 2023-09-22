package diodesafio01.iphone;

import java.util.Scanner;

import diodesafio01.interneexplorer.InternetExplorer;
import diodesafio01.interneexplorer.enums.BrowserEnum;
import diodesafio01.iphone.enums.IphoneEnums;
import diodesafio01.ipod.Ipod;
import diodesafio01.ipod.enums.ReprodutorEnum;
import diodesafio01.motorola.Motorola;
import diodesafio01.motorola.enums.TelefoneEnum;



public class Iphone {
    IphoneEnums app;
    Scanner scn = new Scanner(System.in);
    boolean power = true;

    public Iphone(String app){
        this.app = IphoneEnums.valueOf(app);
    }

    public void abrirApp(){

        switch (app) {
            case ITUNES:
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
            case TELEFONE:
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
                        
                        
                        if(resp.matches("n|N")){ this.power = false;};

                    } catch (IllegalArgumentException e) {
                        System.out.println("Opçao inválida!");
                    }
                }
                break;
            case SAFARI:
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
            default:
                break;
        }
    }
};