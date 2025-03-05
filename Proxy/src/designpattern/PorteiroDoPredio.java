package designpattern;

// Porteiro (intermediário)
class PorteiroDoPredio implements Porteiro {
    private Moradora moradora;

    @Override
    public void autorizarEntrada() {
        // Verificação ou controle de acesso
        if (moradora == null) {
            moradora = new Moradora();
        }
        // Delegação da autorização para a Moradora
        System.out.println("Porteiro: Encaminhando pedido de entrada para a Moradora.");
        moradora.autorizarEntrada();
    }
}

