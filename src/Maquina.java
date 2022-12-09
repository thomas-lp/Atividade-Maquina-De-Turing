public class Maquina {
    private Fita fita;
    private Estado estadoAtual;
    private Boolean maquinaParou;

    //_______________________________________Métodos_______________________________________//

    public Maquina(String palavraEntrada, Estado estadoInicial){
        fita = new Fita(palavraEntrada);

        maquinaParou = false;
        estadoAtual = estadoInicial;
    }

    public String executar(){
        String retorno = "";

        while((!estadoAtual.ehFinal()) && (!maquinaParou)){
            retorno += fita.mostrarFita() + "\n";
            
            char simboloLido = fita.getCaracterAtual();

            if(estadoAtual.temTransicao(simboloLido)){
                Transicao transicao = estadoAtual.getTransicao(simboloLido);

                fita.escrever(transicao.getSimboloEscrito());
                fita.moverCabecote(transicao.getDirecaoCabecote());
                estadoAtual = transicao.getProximoEstado();
            }
            else{
                maquinaParou = true;
            }
        }

        return retorno;
    }

    public String mostrarFita(){
        return fita.mostrarFita();
    }
}
