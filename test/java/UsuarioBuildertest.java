package padroescriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaUsuariossemsenha() {
        try {
            UsuarioBuilder UsuarioBuilder = new UsuarioBuilder();
            Usuario Usuario = UsuarioBuilder
                    .setNome("Usuario 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Senha inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaUsuarioSemNome() {
        try {
            UsuarioBuilder UsuarioBuilder = new UsuarioBuilder();
            Usuario Usuario = UsuarioBuilder
                    .setSenha(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarUsuarioValido() {
        UsuarioBuilder UsuarioBuilder = new UsuarioBuilder();
        Usuario Usuario = UsuarioBuilder
                .setsenha(1)
                .setNome("Aluno 1")
                .build();

        assertNotNull(Usuario);
    }
}