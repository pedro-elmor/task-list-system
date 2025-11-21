import java.sql.SQLOutput;

public class Tarefas {
    public String[] tarefas = new String[100];
    private int quantidade = 0;

    public void adicionar(String tarefa){
        tarefas[quantidade] = tarefa;
        quantidade++;
        System.out.println("Tarefa: "+ tarefa +" adicionada");
    }

    public void listar(){
        for(int i = 0; i < quantidade; i++){
                System.out.println(tarefas[i]);
        }
    }

    public void listarPeloIndice(int indice){
        System.out.println(tarefas[indice]);
    }

    public void remover(int indice){
        if (indice < 0 || indice >= quantidade){
            System.out.println("Indice Inválido");
            return;
        }

        for (int i = 0 ; i < quantidade - 1; i++){
            tarefas[i] = tarefas[i + 1];
        }
        quantidade --;

        System.out.println("Tarefa removida com sucesso!");
    }

    public void sair(){
        System.out.println("Encerrando programa...");
        System.exit(0);
    }
}
