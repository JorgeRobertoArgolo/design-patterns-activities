package activity_facade.subsistema;

public class SubSistemaLogin {
    public boolean fazerLogin(String usuario, String senha) {
        System.out.println("[LOGIN] Verificando credenciais para usuário: " + usuario);
        if (usuario.equals("roberto") && senha.equals("123456")) {
            System.out.println("[LOGIN] Sucesso! Usuário autenticado.");
            return true;
        } else {
            System.out.println("[LOGIN] Falha na autenticação.");
            return false;
        }
    }
}
