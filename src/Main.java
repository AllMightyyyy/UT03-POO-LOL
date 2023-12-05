// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Imagina que estás desarrollando un sistema básico para gestionar información sobre campeones en el juego League of Legends. Crea dos clases: una para representar a los campeones y otra para los jugadores.

        Clase Champion:

        Atributos:
        •	Nombre del campeón.
        •	Tipo de rol (tanque, mago, asesino, etc.).
        •	Puntos de vida (int).
        •	Puntos de ataque (int).
        Métodos:
        •	Constructor por defecto, donde el valor de la vida será 100 por
        defecto y puntos de ataque 30.
        •	Constructor que inicializa todos los atributos.
        •	Constructor copia.
        •	Método incrementarVida(int cantidad): incrementa los puntos de
        vida del campeón.
        •	Método atacar(Champion objetivo): simula un ataque del campeón a otro,
        reduciendo los puntos de vida del objetivo. Los puntos de ataque del campeón
        que llama al método, serán los puntos de vida que se deben restar al oponente
        que se le pasa por parámetro.
        •	Método toString(): devuelve una representación en cadena del campeón,
        mostrando su nombre, rol y estadísticas.

        Clase Player:

        Atributos:
        •	Nombre del jugador.
        •	Campeón actualmente seleccionado.
        •	Experiencia acumulada
        •	Nivel del jugador.
        Métodos:
        •	Constructor por defecto donde el nivel del jugador por defecto será 1.
        •	Constructor que inicializa todos los atributos.
        •	Constructor copia
        •	Método seleccionarCampeon(Champion campeon): asigna un campeón al jugador.
        •	Método subirNivel(): incrementa el nivel del jugador cuando su experiencia
        sea igual al nivel*10.
        •	Método toString(): devuelve una representación en cadena del jugador,
        mostrando su nombre, nivel y el campeón seleccionado.

        Instrucciones:

        1.	Implementa las clases Champion y Player según las especificaciones dadas.
        2.	Crea un programa principal que:
        3.	Cree instancias de varias clases Champion y Player.
        4.	Muestre información detallada utilizando el método toString() de cada clase.
        5.	Realice algunas operaciones simuladas, como ataques entre campeones y
        cambios de nivel de jugador.

         */

        Champion champion1 = new Champion("Champion1", 150, 40, Role.TANK);
        Champion champion2 = new Champion("Champion2", 120, 50, Role.HEALER);

        Player player1 = new Player("Player1", champion1, 0, 1);
        Player player2 = new Player("Player2", champion2, 15, 2);

        System.out.println("Information of Champion 1: " + champion1.toString());
        System.out.println("Information of Champion 2: " + champion2.toString());

        System.out.println("\nInformation of Player 1: " + player1.toString());
        System.out.println("Information of Player 2: " + player2.toString());

        champion1.attack(champion2);
        System.out.println("\nAfter an attack, Information of Champion 2: " + champion2.toString());

        int count = 0;
        while(count < 5) {
            player1.increaseExperience();
        }
        player1.increaseLevel();
        System.out.println("\nAfter gaining experience, Information of Player 1: " + player1.toString());
    }
}