package designpattern;

// Moradora (objeto real)
class Moradora implements Porteiro {
    @Override
    public void autorizarEntrada() {
        System.out.println("Entrada autorizada pela Moradora.");
    }
}

