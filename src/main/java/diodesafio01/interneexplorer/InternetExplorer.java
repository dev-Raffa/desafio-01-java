package diodesafio01.interneexplorer;

import diodesafio01.interneexplorer.enums.BrowserEnum;
import diodesafio01.interneexplorer.interfaces.Browser;


public class InternetExplorer implements Browser {
    BrowserEnum opcao;

    public InternetExplorer( String opcao){
        this.opcao = BrowserEnum.valueOf(opcao);
    }
    

    public void abrirPagina(){
        System.out.println("página da web aberta");

    };

    public void adicionarNovaAba(){
        System.out.println("nova aba aberta no navegador.");
    };

    public void atualizarPagina() {
        System.out.println("página atualizada.");
    };

    public void executarAcao(){        

        switch(opcao){
            case ABRIR_PAGINA:{
                abrirPagina();
                break;
            }
            case ADICIONAR_NOVA_ABA: {
                adicionarNovaAba();
                break;
            }
            case ATUALIZAR_PAGINA: {
                atualizarPagina();
                break;
            }
        }
    }
}