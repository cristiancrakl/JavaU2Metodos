// Clase base Personaje, representa a un personaje genérico en la batalla (héroe o villano)
class Personaje {
    // Atributos comunes para todos los personajes
    protected String nombre;
    protected int fuerza;
    protected int velocidad;
    protected int vidaHp;
    protected boolean estaVivo;

    // Constructor para inicializar un personaje con nombre, fuerza, velocidad y vida
    public Personaje(String nombre, int fuerza, int velocidad, int vidaHp, boolean estaVivo) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vidaHp = vidaHp;
        this.estaVivo = estaVivo;
    }

    // Método para atacar a otro personaje y reducir su vida en función de la fuerza del atacante
    public void atacar(Personaje oponente) {
        if (!estaVivo) {
            System.out.println(this.nombre + " no puede atacar porque está muerto.");
            return;
        }
        System.out.println(this.nombre + " ataca a " + oponente.nombre);
        oponente.vidaHp -= this.fuerza;
        oponente.verificarEstado();
        System.out.println(oponente.nombre + " ahora tiene " + oponente.vidaHp + " de vida.");
    }

    // Método para defenderse, reduciendo el daño recibido a la mitad
    public void defenderse(int daño) {
        if (!estaVivo) {
            System.out.println(this.nombre + " no puede defenderse porque está muerto.");
            return;
        }
        int dañoReducido = daño / 2;
        this.vidaHp -= dañoReducido;
        verificarEstado();
        System.out.println(this.nombre + " se defiende y reduce el daño a " + dañoReducido + ". Vida restante: " + this.vidaHp);
    }

    // Método para recuperar vidaHp, aumentando la cantidad de puntos especificada
    public void recuperar(int puntos) {
        if (!estaVivo) {
            System.out.println(this.nombre + " no puede recuperarse porque está muerto.");
            return;
        }
        this.vidaHp += puntos;
        System.out.println(this.nombre + " se ha recuperado. Vida actual: " + this.vidaHp);
    }

    // Método para mostrar las estadísticas actuales del personaje
    public void mostrarEstadisticas() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fuerza: " + this.fuerza);
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Vida: " + this.vidaHp);
        System.out.println("Estado: " + (this.estaVivo ? "Vivo" : "Muerto"));
    }

    // Método para verificar si el personaje está vivo o muerto
    protected void verificarEstado() {
        if (this.vidaHp <= 0) {
            this.estaVivo = false;
            System.out.println(this.nombre + " ha muerto.");
        }
    }
}