package diodesafio01.motorola;
import java.util.Scanner;

import diodesafio01.motorola.enums.TelefoneEnum;
import diodesafio01.motorola.interfaces.Telefone;



public class Motorola implements Telefone {
    TelefoneEnum opcao;
    
    public Motorola(String opcao){
        this.opcao = TelefoneEnum.valueOf(opcao);
    }
    
    Scanner scn = new Scanner(System.in);

    public void realizarChamada(){        

        System.out.println("Digite o número do telefone: ");
        String phoneNumber = scn.next();

        if (phoneNumber.matches("^[0-9]{9}$")) {
            System.out.println("realizando chamada para o número " + phoneNumber);
        } else {
            System.out.println("Numero inválido");
        }
    };

    public void encerrarChamada() {
        System.out.println("chamada encerrada");
    };

    public void atenderChamada(){
        System.out.println("chamada atendida");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Deixe uma mensagem no correio de voz: ");
        scn.next();
    }

    public void executarAcao(){        

        switch(opcao){
            case REALIZAR_CHAMADA:{
                realizarChamada();
                break;
            }
            case ENCERRAR_CHAMADA: {
                encerrarChamada();
                break;
            }
            case ATENDER_CHAMADA: {
                atenderChamada();
                break;
            }
            case INICIAR_CORREIO_DE_VOZ: {
                iniciarCorreioDeVoz();
                break;
            }
        }
    }
}