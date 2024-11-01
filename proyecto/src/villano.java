// Clase Villano que hereda de Personaje, representa a un villano con la habilidad de hacer trampa
class Villano extends Personaje {

    // Constructor que inicializa un villano usando el constructor de la clase base Personaje
    public Villano(String nombre, int fuerza, int velocidad, int vidaHp, boolean estaVivo) {
        super(nombre, fuerza, velocidad, vidaHp, estaVivo);
    }

    // Método para hacer trampa, duplicando el ataque del villano contra otro personaje
    public void hacerTrampa(Personaje oponente) {
        if (!estaVivo) {
            System.out.println(this.nombre + " no puede hacer trampa porque está muerto.");
            return;
        }
        System.out.println(this.nombre + " hace trampa y duplica su ataque contra " + oponente.nombre);
        int dañoDoble = this.fuerza * 2;
        oponente.vidaHp -= dañoDoble;
        oponente.verificarEstado();
        System.out.println(oponente.nombre + " ahora tiene " + oponente.vidaHp + " de vida.");
    }
}

