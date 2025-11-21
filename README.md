# 📝 Sistema de Lista de Tarefas (Java - Console)

Um projeto simples e funcional desenvolvido em **Java**, com o objetivo de treinar lógica de programação, criação de métodos, manipulação de arrays e interação com `Scanner`.

O programa roda totalmente no **terminal**, oferecendo um menu interativo para o usuário gerenciar suas tarefas.

---

## 🚀 Funcionalidades

O sistema permite:

### ✔️ Adicionar tarefas  
O usuário digita o nome da tarefa, e ela é salva em um array interno.

### ✔️ Listar todas as tarefas  
Mostra todas as tarefas armazenadas até o momento.

### ✔️ Remover tarefa pelo índice  
O usuário informa o índice da tarefa e ela é removida corretamente, com o array sendo reorganizado.

### ✔️ Sair do programa  
Finaliza o sistema de forma limpa e controlada.

---

## 🧠 Como funciona internamente

O programa é dividido em duas partes:

---

### **1️⃣ Classe `Tarefas`**

Responsável por toda a lógica da aplicação:

- Armazena tarefas em um array  
- Controla a quantidade de itens  
- Possui métodos:

adicionar(String tarefa)
listar()
listarPeloIndice(int indice)
remover(int indice)

O método `remover()` reorganiza o array deslocando todos os elementos seguintes para a esquerda.

---

### **2️⃣ Classe `TarefaTest01`**

É o **programa principal** (`main`), responsável por:

- Criar o menu interativo
- Capturar entradas do usuário com `Scanner`
- Chamar os métodos da classe `Tarefas`

---

## 📋 Exemplo de execução

MENU:
1 - Adicionar tarefa
2 - Listar tarefas
3 - Remover tarefa
4 - Sair
Escolha uma opção: 1
Digite a tarefa: a
Tarefa: a adicionada

MENU:
1 - Adicionar tarefa
2 - Listar tarefas
3 - Remover tarefa
4 - Sair
Escolha uma opção: 2
Todas as tarefas:
a
b
c

MENU:
1 - Adicionar tarefa
2 - Listar tarefas
3 - Remover tarefa
4 - Sair
Escolha uma opção: 3
Digite o índice: 2
Tarefa removida com sucesso!


---

## 🛠️ Tecnologias usadas

- **Java 8+**
- `Scanner`  
- Estruturas de repetição  
- Arrays  
- Métodos e lógica de programação  
- IntelliJ IDEA (ou qualquer IDE de sua preferência)

---

## 📌 Como executar

1. Clone este repositório:

git clone https://github.com/pedro-elmor/task-list-system


2. Entre na pasta:


3. Compile:


4. Execute:


---

## 📦 Futuras melhorias (opcional)

- Migrar de array fixo para `ArrayList`
- Salvar tarefas em arquivo `.txt`
- Sistema de editar tarefas
- Interface gráfica (JavaFX)

---

## 👤 Autor

**Pedro Elmôr**  
Projeto criado para prática de Java e desenvolvimento inicial.  

---


