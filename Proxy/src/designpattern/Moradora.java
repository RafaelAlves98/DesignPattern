// Interface comum
interface Porteiro {
    void autorizarEntrada();
}

// Moradora (objeto real)
class Moradora implements Porteiro {
    @Override
    public void autorizarEntrada() {
        System.out.println("Entrada autorizada pela Moradora.");
    }
}

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

// Visitante (usuário)
public class Visitante {
    public static void main(String[] args) {
        Porteiro porteiro = new PorteiroDoPredio();
        porteiro.autorizarEntrada(); // O visitante solicita entrada ao Porteiro
    }
}
