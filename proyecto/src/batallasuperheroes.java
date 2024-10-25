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

// Clase principal para probar la simulación de batalla entre un héroe y un villano
public class batallasuperheroes {
    public static void main(String[] args) {
        // Crear una instancia de un superhéroe llamado Deadpool
        SuperHero heroe = new SuperHero("Deadpool", 30, 20, 100, true);

        // Crear una instancia de un villano llamado Doctor Doom
        Villano villano = new Villano("Doctor Doom", 25, 15, 120, true);

        // Mostrar las estadísticas iniciales de ambos personajes
        heroe.mostrarEstadisticas();
        villano.mostrarEstadisticas();

        // Simulación de una serie de acciones en la batalla
        heroe.atacar(villano); // El héroe ataca al villano
        villano.hacerTrampa(heroe); // El villano hace trampa y ataca al héroe
        villano.hacerTrampa(heroe);
        heroe.ataqueEspecial(villano); // El héroe realiza un ataque especial contra el villano
        villano.defenderse(40); // El villano se defiende de un ataque con 40 de daño
        heroe.recuperar(20); // El héroe se recupera, aumentando su vida en 20 puntos

        // Mostrar las estadísticas finales de ambos personajes
        heroe.mostrarEstadisticas();
        villano.mostrarEstadisticas();
    }
}
