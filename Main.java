import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Declararvariáveis da pessoa
        String nomePessoa = "";
        int idadePessoa = 0;
        String emailPessoa = "";

        // Instanciar o objeto Pessoa
        Pessoa pessoa = new Pessoa(nomePessoa, emailPessoa, idadePessoa);

        //Menu de opcões
        System.out.println("Escolha o que deseja fazer");
        System.out.println("1-Cadastrar");
        System.out.println("2-Editar");
        System.out.println("3-Apresentar");
        System.out.println("4-Excluir");
        System.out.println("Digite o número da tarefa que deseja realizar");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
            System.out.println("Cadastro de pessoa");

            scanner.nextLine();
            //Solicitar dados da pessoa
            System.out.println("Digite o nome:");
            nomePessoa = scanner.nextLine();
            System.out.println("Digite a idade:");
            idadePessoa = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o email");
            emailPessoa = scanner.nextLine();

             // Usar o método SET para definir valores
            pessoa.setNome(nomePessoa);
            pessoa.setIdade(idadePessoa);
            pessoa.setEmail(emailPessoa);

            // Exibir as informações
            System.out.println("\nPessoa cadastrada com sucesso!");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());
            break;
            case 2:
            System.out.println("Editar pessoa");

            //Exibir informações da pessoa já existente
            System.out.println("\nDados da pessoa:");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());

            //Editar informações
            scanner.nextLine();
            System.out.println("Digite o novo nome:");
            nomePessoa = scanner.nextLine();
            System.out.println("Digite a nova idade:");
            idadePessoa = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o novo email");
            emailPessoa = scanner.nextLine();
            // Usar o método SET para definir valores
            pessoa.setNome(nomePessoa);
            pessoa.setIdade(idadePessoa);
            pessoa.setEmail(emailPessoa);

            //Exibir novas informações
            System.out.println("\nNovos dados da Pessoa:");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());
            break;
            case 3:

             // Exibir as informações
             System.out.println("\nDados da pessoa: ");
             System.out.println("Nome: " + pessoa.getNome());
             System.out.println("Idade: " + pessoa.getIdade());
             System.out.println("Email: " + pessoa.getEmail());
             break;
             case 4:
             System.out.println("Excluir pessoa:");

             //Excluir pessoa
             pessoa=null;
             System.out.println("Pessoa Excluída com sucesso!");
             default:
             System.out.println("Essa opção não é válida");
        }
    }
}