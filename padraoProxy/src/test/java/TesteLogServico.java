import org.junit.Test;
public class TesteLogServico {
    @Test

    public void testarLogServico() {
        // Cria o objeto real e o proxy
        Servico servicoReal = new ServicoReal();
        Servico servicoProxy = new ServicoProxy(servicoReal);

        // Executa o serviço usando o proxy
        servicoProxy.executar();
    }
}
