package org.sofkau.exercise.exercise18;

public class Main {

    static MessagesExercise18 message = MessagesExercise18.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        //Creación de dos array de Series y Videp juegos
        Serie[] listaSerie = new Serie[5];
        VideoGame[] listaGame = new VideoGame[5];

        //creacion objeto Serie en cada posicion del array
        listaSerie[0] = new Serie();
        listaSerie[1] = new Serie("Maldita", "Netflix");
        listaSerie[2] = new Serie("valhala", "Raul Mendez", 4, "Combate");
        listaSerie[3] = new Serie("Messi", "FoxSport", 1, "Futbol");
        listaSerie[4] = new Serie("Comando", "Fox");

        //Creacion objetos de video juegos en casa posicion del array
        listaGame[0] = new VideoGame();
        listaGame[1] = new VideoGame("Spider Man", 20);
        listaGame[2] = new VideoGame("Infinity", 12, "Accion", "Xbox Game");
        listaGame[3] = new VideoGame("resident evil", 16, "Terror", "Genesis");
        listaGame[4] = new VideoGame();

        //Devolver algunas series prestadas
        listaSerie[0].Deliver();
        listaSerie[3].Deliver();

        //Devolver algunos juegos prestados
        listaGame[2].Deliver();
        listaGame[4].Deliver();
        listaGame[0].Deliver();

        message.showGetInfo();              // Mensaje del programa
        isReturned(listaGame, listaSerie); // Metodo para logica de los juegos y series prestados

        //Creamos dos objetos en la posicion 0 para enviarlo como el primer objeto a comparar
        Serie serieMax = listaSerie[0];
        VideoGame gameMax = listaGame[0];

        //Recorrer el array para saber cual objeto tiene el numero mayor de temporadas
        for (int i = 1; i < listaSerie.length; i++){
            if(listaSerie[i].compareTo(serieMax) == 1){
                serieMax = listaSerie[i];
            }
        }

        //Recorrer el array para saber cual objeto tiene el numero mayor de horas
        for (int i = 1; i < listaGame.length; i++){
            if(listaGame[i].compareTo(gameMax) == 1){
                gameMax = listaGame[i];
            }
        }
        message.showGetSerieMax();
        message.printToString(serieMax.toString());
        message.showGetGameMax();
        message.printToString(gameMax.toString());

    }

    /**
     * Metodo para devolver cuantos juegos hay entregrado en los objetos
     */
    public static void isReturned(VideoGame[] a, Serie[] b) {
        //Viedo juegos entregados
        Integer countGames = 0;
        Integer countSeries = 0;

        // foreach para contar los juegos entregados y devolverlos
        for (VideoGame element : a) {
            if (Boolean.TRUE.equals(element.isDevoted())) {
                countGames++;
                element.repay();
            }
        }

        // foreach para contar las series entregados y devolverlos
        for (Serie element : b) {
            if (Boolean.TRUE.equals(element.isDevoted())) {
                countSeries++;
                element.repay();
            }
        }

        message.showGetGameDeliver(countGames);
        message.showGetSeriesDeliver(countSeries);

    }
}

