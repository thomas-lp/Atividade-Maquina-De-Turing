import java.util.ArrayList;

public class Fita {
    private ArrayList<Character> fita;
    private ArrayList<Character> ponteiro;
    private int cabecoteLeitura;

    //_______________________________________Métodos_______________________________________//

    public Fita(String palavra){
        fita = new ArrayList<Character>();
        ponteiro = new ArrayList<Character>();

        for(int i=0; i<palavra.length(); i++){
            char c = palavra.charAt(i);
            fita.add(c);
            ponteiro.add(' ');
        }

        cabecoteLeitura = 0;
    }

    public char getCaracterAtual(){
        return fita.get(cabecoteLeitura);
    }

    public void escrever(char simbolo){
        fita.set(cabecoteLeitura, simbolo);
    }

    public void moverCabecote(char direcao){
        if(direcao == 'D'){
            cabecoteLeitura += 1;

            if(cabecoteLeitura == fita.size()-1){
                fita.add('B');
            }
        }
        else if(direcao == 'E'){
            if(cabecoteLeitura > 0){
                cabecoteLeitura -= 1;
            }
        }
    }

    public String mostrarFita(){
        String saida = "";

        while(ponteiro.size() < fita.size()){
            ponteiro.add(' ');
        }
        
        for(int i=0; i<ponteiro.size(); i++){
            ponteiro.set(i, ' ');
        }

        ponteiro.set(cabecoteLeitura, '^');

        for(char c : fita){
            saida += c;
        }

        saida += "\n";

        for(char c : ponteiro){
            saida += c;
        }

        return saida;
    }
}
