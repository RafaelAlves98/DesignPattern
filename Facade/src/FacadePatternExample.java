// Classe que representa a CPU do computador.
class CPU {
    // Método que simula o congelamento da CPU.
    public void freeze() {
        System.out.println("Congelando a CPU.");
    }

    // Método que simula a alteração do ponto de execução da CPU.
    public void jump(long position) {
        System.out.println("Pulando para a posição: " + position);
    }

    // Método que simula a execução da CPU.
    public void execute() {
        System.out.println("Executando a CPU.");
    }
}

// Classe que representa a memória do computador.
class Memory {
    // Método que simula o carregamento de dados na memória.
    public void load(long position, byte[] data) {
        System.out.println("Carregando dados na memória a partir da posição: " + position);
    }
}

// Classe que representa o disco rígido do computador.
class HardDrive {
    // Método que simula a leitura de dados do disco rígido.
    public byte[] read(long lba, int size) {
        System.out.println("Lendo dados do disco rígido (LBA = " + lba + ", tamanho = " + size + ").");
        return new byte[size];
    }
}

// Classe Facade que simplifica a interface para o subsistema complexo.
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    // Construtor que instancia os componentes do sistema.
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // Método que encapsula o processo de inicialização do computador.
    public void start() {
        cpu.freeze(); // Prepara a CPU para iniciar
        // Carrega dados na memória, lendo do disco rígido.
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);  // Define o ponto inicial de execução
        cpu.execute(); // Inicia a execução da CPU
    }
}

// Classe principal que demonstra o uso do padrão Facade.
public class FacadePatternExample {
    public static void main(String[] args) {
        // Cria uma instância da Facade, que esconde a complexidade dos subsistemas.
        ComputerFacade computer = new ComputerFacade();
        // Inicializa o computador utilizando a interface simplificada.
        computer.start();
    }
}
