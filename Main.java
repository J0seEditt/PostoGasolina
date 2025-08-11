package posto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE POSTO DE COMBUSTÍVEL ===");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Cadastrar Gerente");
            System.out.println("3. Cadastrar Cliente Comum");
            System.out.println("4. Cadastrar Cliente Fidelizado");
            System.out.println("5. Cadastrar Cliente PJ");
            System.out.println("6. Cadastrar Gasolina");
            System.out.println("7. Cadastrar Diesel");
            System.out.println("8. Listar todas as pessoas");
            System.out.println("9. Listar todos os produtos");
            System.out.println("10. Listar todos os clientes");
            System.out.println("11. Realizar compra");
            System.out.println("12. Adicionar saldo ao cliente");
            System.out.println("13. Gerenciar equipe (Gerente)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner, pessoas);
                    break;
                case 2:
                    cadastrarGerente(scanner, pessoas);
                    break;
                case 3:
                    cadastrarClienteComum(scanner, pessoas, clientes);
                    break;
                case 4:
                    cadastrarClienteFidelizado(scanner, pessoas, clientes);
                    break;
                case 5:
                    cadastrarClientePJ(scanner, pessoas, clientes);
                    break;
                case 6:
                    cadastrarGasolina(scanner, produtos);
                    break;
                case 7:
                    cadastrarDiesel(scanner, produtos);
                    break;
                case 8:
                    listarPessoas(pessoas);
                    break;
                case 9:
                    listarProdutos(produtos);
                    break;
                case 10:
                    listarClientes(clientes);
                    break;
                case 11:
                    realizarCompra(scanner, clientes);
                    break;
                case 12:
                    adicionarSaldo(scanner, clientes);
                    break;
                case 13:
                    gerenciarEquipe(scanner, pessoas);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Métodos auxiliares
    private static void cadastrarFuncionario(Scanner scanner, ArrayList<Pessoa> pessoas) {
        System.out.println("\n=== CADASTRAR FUNCIONÁRIO ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Data de Admissão: ");
        String dataAdmissao = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        Funcionario funcionario = new Funcionario(nome, cpf, telefone, cargo, salario, dataAdmissao, senha);
        pessoas.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void cadastrarGerente(Scanner scanner, ArrayList<Pessoa> pessoas) {
        System.out.println("\n=== CADASTRAR GERENTE ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Anos de Experiência: ");
        int anosExperiencia = scanner.nextInt();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        scanner.nextLine();

        Gerente gerente = new Gerente(nome, cpf, telefone, departamento, salario, anosExperiencia, senha);
        pessoas.add(gerente);
        System.out.println("Gerente cadastrado com sucesso!");
    }

    private static void cadastrarClienteComum(Scanner scanner, ArrayList<Pessoa> pessoas, ArrayList<Cliente> clientes) {
        System.out.println("\n=== CADASTRAR CLIENTE COMUM ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        ClienteComum cliente = new ClienteComum(nome, cpf, telefone, saldo);
        pessoas.add(cliente);
        clientes.add(cliente);
        System.out.println("Cliente comum cadastrado com sucesso!");
    }

    private static void cadastrarClienteFidelizado(Scanner scanner, ArrayList<Pessoa> pessoas, ArrayList<Cliente> clientes) {
        System.out.println("\n=== CADASTRAR CLIENTE FIDELIZADO ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.print("Nível de Fidelidade: ");
        int nivelFidelidade = scanner.nextInt();
        scanner.nextLine();

        ClienteFidelizado cliente = new ClienteFidelizado(nome, cpf, telefone, saldo, nivelFidelidade);
        pessoas.add(cliente);
        clientes.add(cliente);
        System.out.println("Cliente fidelizado cadastrado com sucesso!");
    }

    private static void cadastrarClientePJ(Scanner scanner, ArrayList<Pessoa> pessoas, ArrayList<Cliente> clientes) {
        System.out.println("\n=== CADASTRAR CLIENTE PJ ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Razão Social: ");
        String razaoSocial = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        String inscricaoEstadual = scanner.nextLine();

        ClientePJ cliente = new ClientePJ(nome, cpf, telefone, saldo, cnpj, razaoSocial, inscricaoEstadual);
        pessoas.add(cliente);
        clientes.add(cliente);
        System.out.println("Cliente PJ cadastrado com sucesso!");
    }

    private static void cadastrarGasolina(Scanner scanner, ArrayList<Produto> produtos) {
        System.out.println("\n=== CADASTRAR GASOLINA ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço por litro: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade disponível: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Octanagem: ");
        double octanagem = scanner.nextDouble();
        scanner.nextLine();

        Gasolina gasolina = new Gasolina(nome, preco, quantidade, tipo, octanagem);
        produtos.add(gasolina);
        System.out.println("Gasolina cadastrada com sucesso!");
    }

    private static void cadastrarDiesel(Scanner scanner, ArrayList<Produto> produtos) {
        System.out.println("\n=== CADASTRAR DIESEL ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço por litro: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade disponível: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Densidade: ");
        double densidade = scanner.nextDouble();
        scanner.nextLine();

        Diesel diesel = new Diesel(nome, preco, quantidade, tipo, densidade);
        produtos.add(diesel);
        System.out.println("Diesel cadastrado com sucesso!");
    }

    private static void listarPessoas(ArrayList<Pessoa> pessoas) {
        System.out.println("\n=== LISTA DE PESSOAS ===");
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("\n--- Pessoa " + (i + 1) + " ---");
            pessoas.get(i).exibirInformacoes();
        }
    }

    private static void listarProdutos(ArrayList<Produto> produtos) {
        System.out.println("\n=== LISTA DE PRODUTOS ===");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("\n--- Produto " + (i + 1) + " ---");
            produtos.get(i).exibirDetalhes();
            System.out.println("Valor total: R$ " + produtos.get(i).calcularValorTotal());
        }
    }

    private static void listarClientes(ArrayList<Cliente> clientes) {
        System.out.println("\n=== LISTA DE CLIENTES ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("\n--- Cliente " + (i + 1) + " ---");
            clientes.get(i).exibirInformacoes();
        }
    }

    private static void realizarCompra(Scanner scanner, ArrayList<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado para realizar compra.");
            return;
        }

        System.out.println("\n=== REALIZAR COMPRA ===");
        System.out.println("Clientes disponíveis:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome() + " (" + clientes.get(i).getTipoCliente() + ")");
        }

        System.out.print("Escolha o cliente (número): ");
        int indiceCliente = scanner.nextInt() - 1;

        if (indiceCliente < 0 || indiceCliente >= clientes.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        System.out.print("Valor da compra: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Cliente cliente = clientes.get(indiceCliente);
        cliente.realizarCompra(valor);
    }

    private static void adicionarSaldo(Scanner scanner, ArrayList<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado para adicionar saldo.");
            return;
        }

        System.out.println("\n=== ADICIONAR SALDO ===");
        System.out.println("Clientes disponíveis:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome() + " - Saldo: R$ " + clientes.get(i).getSaldo());
        }

        System.out.print("Escolha o cliente (número): ");
        int indiceCliente = scanner.nextInt() - 1;

        if (indiceCliente < 0 || indiceCliente >= clientes.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        System.out.print("Valor a adicionar: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Cliente cliente = clientes.get(indiceCliente);
        cliente.adicionarSaldo(valor);
    }

    private static void gerenciarEquipe(Scanner scanner, ArrayList<Pessoa> pessoas) {
        System.out.println("\n=== GERENCIAR EQUIPE ===");

        // Filtrar apenas gerentes
        ArrayList<Gerente> gerentes = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Gerente) {
                gerentes.add((Gerente) pessoa);
            }
        }

        if (gerentes.isEmpty()) {
            System.out.println("Nenhum gerente cadastrado.");
            return;
        }

        System.out.println("Gerentes disponíveis:");
        for (int i = 0; i < gerentes.size(); i++) {
            System.out.println((i + 1) + ". " + gerentes.get(i).getNome() + " - Departamento: " + gerentes.get(i).getDepartamento());
        }

        System.out.print("Escolha o gerente (número): ");
        int indiceGerente = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indiceGerente < 0 || indiceGerente >= gerentes.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        Gerente gerente = gerentes.get(indiceGerente);
        gerente.gerenciarEquipe();
    }
}


