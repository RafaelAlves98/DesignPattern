package designpattern;

// Visitante (usuário)
public class Visitante {
    public static void main(String[] args) {
        Porteiro porteiro = new PorteiroDoPredio();
        porteiro.autorizarEntrada(); // O visitante solicita entrada ao Porteiro
    }
}
