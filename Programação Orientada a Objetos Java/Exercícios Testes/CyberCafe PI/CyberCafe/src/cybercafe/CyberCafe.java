package cybercafe;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Projeto Integrador 06/11/2023
// Nomes: André Luis Mesquita Barbosa Júnior, Luís Henrique Medeiros Vanz,
// Milena Fontana Bregalda

public class CyberCafe {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, email, cpf, endereco, ddd, numero, tipo, redesocial, funcao;
        int idade = -1, menu, idCliente, idFuncionario, qtdTel = 0;
        ArrayList<Cliente> listaclientes = new ArrayList();
        ArrayList<Telefone> listatelefones = new ArrayList();
        ArrayList<Funcionario> listafuncionarios = new ArrayList();
        menu = -1;
        
        do {
            System.out.println("\n1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Listar Cliente");
            System.out.println("4 - Listar Funcionario");
            System.out.println("5 - Excluir Cliente");
            System.out.println("6 - Editar Cliente");
            System.out.println("7 - Excluir Funcionário");
            System.out.println("8 - Editar Funcionario");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
           
            try {
               menu=ler.nextInt();
            }catch(InputMismatchException letra) {
               ler.nextLine();
            }
            System.out.println();
           
            switch(menu){
                case 1:
                    System.out.print("Nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.print("Email: ");
                    email = ler.nextLine();
                    
                    do {
                    System.out.print("Idade: ");
                        try {
                            idade = ler.nextInt();
                        } catch(InputMismatchException in) {
                            System.out.println("Informe um número!");
                            ler.nextLine();
                        }
                    } while(idade <= 0);
                   
                   System.out.print("Cpf: ");
                   ler.nextLine();
                   cpf = ler.nextLine();
                   System.out.print("Endereço: ");
                   endereco = ler.nextLine();
                   System.out.print("Rede Social: ");
                   redesocial = ler.nextLine();
                   
                   Cliente cliente = new Cliente(nome, idade, email, cpf, endereco, redesocial);
                   int idC = cliente.cadastrar();
                   
                   do {
                       try {
                           System.out.print("Quantos telefones deseja cadastrar? ");
                           qtdTel = ler.nextInt();
                           listaclientes.add(cliente);
                       } catch(InputMismatchException tel) {
                           System.out.println("Informe um número!");
                           ler.nextLine();
                       }
                    }while(qtdTel <= 0);
                   
                   ler.nextLine();
                   listaclientes.add(cliente);

                   for (int i = 0; i < qtdTel; i++) {
                       System.out.println("\nTelefone número " + (i + 1));
                       System.out.print("Ddd: ");
                       ddd = ler.nextLine();
                       System.out.print("Número: ");
                       numero = ler.nextLine();
                       System.out.print("Tipo: ");
                       tipo = ler.nextLine();
                       
                       Telefone telefone = new Telefone(tipo, ddd,numero);
                       telefone.cadastrar(idC);
                       listatelefones.add(telefone);
                   }
                   System.out.println("Cliente cadastrado com sucesso!");
                   break;
                   
                case 2:
                    System.out.print("Nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.print("Email: ");
                    email = ler.nextLine();
                    
                    do {
                    System.out.print("Idade: ");
                        try {
                            idade = ler.nextInt();
                        } catch(InputMismatchException in) {
                            System.out.println("Informe um número!");
                            ler.nextLine();
                        }
                    } while(idade <= 0);
                    
                    System.out.print("Cpf: ");
                    ler.nextLine();
                    cpf = ler.nextLine();
                    System.out.print("Endereço: ");
                    endereco = ler.nextLine();
                    System.out.print("Função: ");
                    funcao = ler.nextLine();
                    
                    Funcionario funcionario = new Funcionario(funcao, nome, idade, email, cpf,endereco);
                    funcionario.cadastrar();
                    listafuncionarios.add(funcionario);
                    System.out.println("Cadastrado com sucesso!");
                    break;
                   
                case 3:
                    System.out.println("Lista de Clientes: ");
                    listaclientes = Cliente.getClientes();
                    for(Cliente c:listaclientes){
                        listatelefones = Telefone.getTelefones(c.getId());
                        c.exibirDados(listatelefones);
                    }
                    break;
                   
                case 4:
                    System.out.println("Lista de Funcionários: ");
                    listafuncionarios = Funcionario.getFuncionarios();
                    for(Funcionario f: listafuncionarios){
                        f.exibirDados();
                    }
                    break;
                   
                case 5:
                    listaclientes = Cliente.getClientes();
                    for(Cliente c:listaclientes){
                       System.out.println( c.getId() + "  -  " + c.getNome() );
                    }
                    System.out.print("Digite o ID do Cliente que será excluído: ");
                    idCliente = ler.nextInt();
                    Telefone.excluir(idCliente);
                    Cliente.excluir(idCliente);   
                    System.out.println("\nCliente Excluido com Sucesso!\n");
                    break;
                
                case 6:
                    listaclientes = Cliente.getClientes();
                    for(Cliente c:listaclientes){
                        System.out.println( c.getId() + "  -  " + c.getNome() );
                    }
                    System.out.print("Digite o ID do cliente que será editado: ");
                    idCliente = ler.nextInt();
                    
                    System.out.print("Digite o novo Nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.print("Digite o novo Email: ");
                    email = ler.nextLine();
                    System.out.print("Digite a nova Idade: ");
                    idade = ler.nextInt();
                    System.out.print("Digite o novo Cpf: ");
                    ler.nextLine();
                    cpf = ler.nextLine();
                    System.out.print("Digite o novo Endereço: ");
                    endereco = ler.nextLine();
                    System.out.print("Digite a nova Rede Social: ");
                    redesocial = ler.nextLine();
                   
                    System.out.println("Edição de telefone");
                    System.out.print("Digite o novo tipo: ");
                    tipo = ler.next();
                    System.out.print("Digite o novo ddd: ");
                    ddd = ler.next();
                    System.out.print("Digite o novo número: ");
                    numero = ler.next();
                    
                    Telefone telefone2 = new Telefone(tipo, ddd, numero);
                    telefone2.editar(idCliente);
                    
                    Cliente cliente2 = new Cliente(nome,idade,email,cpf,endereco,redesocial);
                    cliente2.setId(idCliente);
                    cliente2.editar();
                    System.out.println("Editado com sucesso!");
                    break;
                    
                case 7:
                    listafuncionarios = Funcionario.getFuncionarios();
                    for(Funcionario f: listafuncionarios) {
                        System.out.println(f.getId() + "  -  " + f.getNome() );
                    }
                    System.out.print("Digite o ID do Funcionario que será excluído: ");
                    idFuncionario = ler.nextInt();
                    Funcionario.excluir(idFuncionario);
                    System.out.println("\nFuncionario Excluido com sucesso!\n");
                    break;

                case 8:
                    listafuncionarios = Funcionario.getFuncionarios();
                    for(Funcionario f: listafuncionarios) {
                        System.out.println( f.getId() + "  -  " + f.getNome() );
                    }
                    System.out.print("Digite o ID do funcionario que será editado: ");
                    idFuncionario = ler.nextInt();
                    
                    System.out.print("Novo nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.print("Nova Idade: ");
                    idade = ler.nextInt();
                    System.out.print("Novo Email: ");
                    ler.nextLine();
                    email = ler.nextLine();
                    System.out.print("Novo CPF: ");
                    cpf = ler.nextLine();
                    System.out.print("Novo Endereço: ");
                    endereco = ler.nextLine();
                    System.out.print("Nova Função: ");
                    funcao = ler.nextLine();
                    
                    Funcionario funcionario3 = new Funcionario(funcao, nome, idade, email, cpf ,endereco);
                    funcionario3.setId(idFuncionario);
                    funcionario3.editar();
                    System.out.println("Editado com sucesso!");
                    break;
                    
                case 0:
                    System.out.println("O programa será encerrado.");
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
            }
        }while(menu != 0);
    }
}