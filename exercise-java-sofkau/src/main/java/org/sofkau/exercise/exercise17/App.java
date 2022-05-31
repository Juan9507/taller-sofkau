package org.sofkau.exercise.exercise17;

public class App {

    static MessagesExercise17 messages = MessagesExercise17.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        Electrodomestico[] listaElectrodomestico = new Electrodomestico[10];
        listaElectrodomestico[1] = new Lavadora();
        listaElectrodomestico[2] = new Television();
        listaElectrodomestico[3] = new Electrodomestico();
        listaElectrodomestico[4] = new Lavadora(200.0, "rojo", 'A',
                50.0,10  );
        listaElectrodomestico[5] = new Television(45, true,100.0,
                "gris",'F',5.0);
        listaElectrodomestico[6] = new Electrodomestico(50.0,"azul",
                'B',78.0);
        listaElectrodomestico[7] = new Lavadora(67.0,21.0);
        listaElectrodomestico[8] = new Television(100.0,15.0);
        listaElectrodomestico[9] = new Electrodomestico();

        contarObjetos(listaElectrodomestico);
    }

    public static void contarObjetos(Electrodomestico[] listaElectrodomestico){

        Double contadorLavadora = 0.0;
        Double contadorTelevisores = 0.0;
        Double contadorElectrodomesticos = 0.0;

        int i;
        for (i = 0; i < listaElectrodomestico.length; i++){
            if (listaElectrodomestico[i] != null){
                contadorElectrodomesticos+= listaElectrodomestico[i].precioFinal();
            }

            if (listaElectrodomestico[i] instanceof Lavadora){
                contadorLavadora+= listaElectrodomestico[i].precioFinal();
            }
            if (listaElectrodomestico[i] instanceof Television){
                contadorTelevisores+= listaElectrodomestico[i].precioFinal();
            }

        }

        messages.showGetInfo();
        messages.precioFinalLavadora(contadorLavadora);
        messages.precioFinalTelevisores(contadorTelevisores);
        messages.precioFinalSuma(contadorElectrodomesticos);

    }
}
