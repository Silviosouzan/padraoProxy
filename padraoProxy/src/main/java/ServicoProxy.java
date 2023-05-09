public class ServicoProxy implements Servico {
    private Servico servicoReal;

    public ServicoProxy(Servico servicoReal) {
        this.servicoReal = servicoReal;
    }

    @Override
    public void executar() {
        System.out.println("Iniciando a execução do serviço...");
        servicoReal.executar();
        System.out.println("Finalizando a execução do serviço.");
    }
}
