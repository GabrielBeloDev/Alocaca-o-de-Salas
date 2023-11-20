package Controller;

import Model.Espaco;
import Model.Solicitacao;

import java.util.ArrayList;
import java.util.Hashtable;

public class Departamento {
    private Hashtable<Espaco, ArrayList<Solicitacao> > alocados;

    public Departamento(Hashtable<Espaco, ArrayList<Solicitacao>> alocados) {
        this.alocados = alocados;
    }

    public void adicionarSolitacao(Solicitacao solicitacao, String tipo_solicitacao){
        //TODO
    }

    public boolean solicitacaoCasual(String tipo){
        //TODO
    }

    public boolean checar(String tipo){
        //TODO
    }

    public void verificarCompatibilidade(ArrayList<Espaco> espacos){
        //TODO
    }
}
