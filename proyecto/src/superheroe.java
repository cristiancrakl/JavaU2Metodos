// Clase SuperHero que hereda de Personaje, representa a un superhéroe con ataques especiales
class SuperHero extends Personaje {

    // Constructor que inicializa un superhéroe usando el constructor de la clase base Personaje
    public SuperHero(String nombre, int fuerza, int velocidad, int vidaHp, boolean estaVivo) {
        super(nombre, fuerza, velocidad, vidaHp, estaVivo);
    }

    // Método para realizar un ataque especial que duplica el daño basado en la fuerza del superhéroe
    public void ataqueEspecial(Personaje oponente) {
        if (!estaVivo) {
            System.out.println(this.nombre + " no puede hacer un ataque especial porque está muerto.");
            return;
        }
        System.out.println(this.nombre + " realiza un ataque especial a " + oponente.nombre);
        int dañoEspecial = this.fuerza * 2;
        oponente.vidaHp -= dañoEspecial;
        oponente.verificarEstado();
        System.out.println(oponente.nombre + " ahora tiene " + oponente.vidaHp + " de vida.");
    }

    // Método sobrecargado de ataque que permite aumentar la fuerza antes de atacar
    public void atacar(Personaje oponente, int aumentoFuerza) {
        if (!estaVivo) {
            System.out.println(this.nombre + " no puede atacar porque está muerto.");
            return;
        }
        System.out.println(this.nombre + " aumenta su fuerza en " + aumentoFuerza + " y ataca a " + oponente.nombre);
        int nuevaFuerza = this.fuerza + aumentoFuerza;
        oponente.vidaHp -= nuevaFuerza;
        oponente.verificarEstado();
        System.out.println(oponente.nombre + " ahora tiene " + oponente.vidaHp + " de vida.");
    }
}