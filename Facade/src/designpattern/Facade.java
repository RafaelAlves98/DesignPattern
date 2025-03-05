package designpattern;

// Classe Facade que simplifica a interface para o subsistema complexo.
class Facade {
    private CPU cpu;
    private Memoria memoria;
    private HD discorigido;

    // Construtor que instancia os componentes do sistema.
    public Facade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.discorigido = new HD();
    }

    // Método que encapsula o processo de inicialização do computador.
    public void start() {
        cpu.freeze(); // Prepara a CPU para iniciar
        // Carrega dados na memória, lendo do disco rígido.
        memoria.load(0, discorigido.read(0, 1024));
        cpu.jump(0);  // Define o ponto inicial de execução
        cpu.execute(); // Inicia a execução da CPU
    }
}

