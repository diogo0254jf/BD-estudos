import dao.UsuarioDAO;
import entity.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        while (true) {

            System.out.println("1- Vou cadastrar 100 pessoas");
            System.out.println("2- Vou listar");
            System.out.println("3- Salvar ODBC");
            System.out.println("4- Salvar JDBC");
            System.out.println("0- Vou sair");
            int opcao = new java.util.Scanner(System.in).nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < 100; i++) {
                        new UsuarioDAO().cadastrarUsuario(new Usuario("Pessoa " + i, "login" + i, "senha" + i, "email" + i + "gmai.com"));
                    }
                    break;
                case 2:
                    List<Usuario> usuarios = new UsuarioDAO().findAll();
                    for (Usuario usuario : usuarios) {
                        System.out.println(usuario + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Salvando ODBC");
                    break;
                case 4:
                    System.out.println("Salvando JDBC");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}