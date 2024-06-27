
# Java-Task-Manager
Gerenciador de tarefas implementado em Java para treinar conceitos de Orientação a Objetos usando a arquitetura MVC.

## Estrutura do projeto

```
src/
|-- com/
|   |-- fatec/
|      |-- controller/
|         |-- interfaces/
|            |-- TaskController.java
|         |-- implements/
|             |-- TaskControllerImpl.java
|      |-- model/
|         |-- entities/
|            |-- Task.java
|            |-- TaskRepository.java
|      |-- view/
|         |-- MenuView.java
|         |-- TaskView.java
|      |-- TaskManager.java
```

## Funcionalidades
O usuário pode criar tarefas, adicionando um nome e uma descrição a cada uma. Posteriormente tanto o nome como as descrições podem ser editadas. Também há a opção de buscar uma tarefa específica pelo seu nome, bem como a opção de mostrar todas as tarefas criadas se assim for desejado.

## Contribuição

Contribuições são bem-vindas! Se você quiser contribuir para este projeto, siga estas etapas:

1. Faça um fork deste repositório.
2. Crie um branch para suas alterações:
    ```bash
    git checkout -b minha-nova-funcionalidade
    ```
3. Faça commit das suas alterações:
    ```bash
    git commit -m 'Adiciona nova funcionalidade'
    ```
4. Envie suas alterações para o branch:
    ```bash
    git push origin minha-nova-funcionalidade
    ```
5. Abra um Pull Request.
