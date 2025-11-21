import java.util.Scanner;

public class TarefaTest01 {
    static void main() {
        Tarefas tarefas = new Tarefas();
        Scanner sc = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nMENU:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = sc.nextLine();
                    tarefas.adicionar(tarefa);
                    break;
                case 2:
                    System.out.println("Todas as tarefas:");
                    tarefas.listar();
                    break;
                case 3:
                    System.out.print("Digite o índice: ");
                    int index = sc.nextInt();
                    tarefas.remover(index);
                    break;
                case 4:
                    tarefas.sair();
                    break;
            }
        }
    }
}
