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
}
