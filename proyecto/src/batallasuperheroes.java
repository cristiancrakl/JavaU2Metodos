// Clase principal para probar la simulación de batalla entre un héroe y un villano
public class batallasuperheroes {
    public static void main(String[] args) {
        // Crear una instancia de un superhéroe  Deadpool
        SuperHero heroe = new SuperHero("Deadpool", 30, 20, 100, true);

        // Crear una instancia de un villano  Doctor Doom
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
