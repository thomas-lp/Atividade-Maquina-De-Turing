public class Transicao {
    private char simboloLido;
    private char simboloEscrito;
    private Estado proximoEstado;
    private char direcaoCabecote;

    //_______________________________________Métodos_______________________________________//

    public Transicao(char simboloLido, Estado proximoEstado, char simboloEscrito, char direcaoCabecote){
        this.simboloLido = simboloLido;
        this.proximoEstado = proximoEstado;
        this.simboloEscrito = simboloEscrito;
        this.direcaoCabecote = direcaoCabecote;
    }

    public char getSimboloLido(){
        return simboloLido;
    }

    public char getSimboloEscrito(){
        return simboloEscrito;
    }

    public Estado getProximoEstado(){
        return proximoEstado;
    }

    public char getDirecaoCabecote(){
        return direcaoCabecote;
    }
}
