public class App {
    public static void main(String[] args) throws Exception {
        
        Estado q0 = new Estado(0);
        Estado q1 = new Estado(1);
        Estado q2 = new Estado(2);
        Estado q3 = new Estado(3);
        Estado q4 = new Estado(4);
        Estado q5 = new Estado(5);

        q0.adicionarTransicao('B', q1, 'B', 'D');

        q1.adicionarTransicao('1', q1, '1', 'D');
        q1.adicionarTransicao('B', q2, '1', 'D');

        q2.adicionarTransicao('1', q2, '1', 'D');
        q2.adicionarTransicao('B', q3, 'B', 'E');

        q3.adicionarTransicao('1', q4, 'B', 'E');

        q4.adicionarTransicao('1', q5, 'B', 'E');

        q5.adicionarTransicao('1', q5, '1', 'E');
        q5.definirComoFinal();

        Maquina m = new Maquina("B11B111B", q0);
        
        System.out.println("Fita inicialmente: ");
        System.out.println(m.mostrarFita());
        System.out.println();
        System.out.println("Execução da operação: ");
        System.out.println(m.executar());
    }
}
