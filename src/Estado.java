import java.util.ArrayList;

public class Estado {
    private int nome;
    private boolean ehFinal;
    private ArrayList<Transicao> transicoes;

    //_______________________________________Métodos_______________________________________//

    public Estado(int nome){
        this.nome = nome;
        ehFinal = false;
        transicoes = new ArrayList<Transicao>();
    }

    public void adicionarTransicao(char simboloLido, Estado proximoEstado, char simboloEscrito, char direcaoCabecote){
        Transicao t = new Transicao(simboloLido, proximoEstado, simboloEscrito, direcaoCabecote);
        transicoes.add(t);
    }

    public int getNome(){
        return nome;
    }
    
    public void definirComoFinal(){
        ehFinal = true;
    }

    public boolean ehFinal(){
        return ehFinal;
    }

    public boolean temTransicao(char s){
        for(Transicao t : transicoes){
            if(s == t.getSimboloLido()){
                return true;
            }
        }

        return false;
    }

    public Transicao getTransicao(char s){
        for(Transicao t : transicoes){
            if(s == t.getSimboloLido()){
                return t;
            }
        }

        return null;
    }
}