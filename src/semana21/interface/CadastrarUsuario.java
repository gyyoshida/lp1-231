package semana21.interface;

// EXEMPLO PARA O PROJETO   
public interface CadastrarUsuarioI {
    public boolean cadastrar(String prontuario, String nome, String email);
}

class CadastrarUsuario implements CadastrarUsuarioI {

    @Override
    public boolean cadastrar(String prontuario, String nome, String email) {
        //acessar email

        //montar o INSERT usando usuario, nome e email

        //salvar na tabela

        //return true ou falso;
        return true;
    }

    @Override
    public boolean cadastrar(String prontuario, String nome, String email) {
        return true;
    }
}
