package diodesafio01.ipod;


import diodesafio01.ipod.enums.ReprodutorEnum;
import diodesafio01.ipod.interfaces.Reprodutor;

public class Ipod implements Reprodutor {

    ReprodutorEnum opcao;

    public Ipod(String opcao){
        this.opcao = ReprodutorEnum.valueOf(opcao);
    }

    public void reproduzir() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    public void tocar(){
        System.out.println("A música voltou a tocar...");
    }

    public void executarAcao(){

        switch(opcao){
            case REPRODUZIR:{
                reproduzir();
                break;
            }
            case PAUSAR: {
                pausar();
                break;
            }
            case TOCAR: {
                tocar();
                break;
            }
        }
    }
}