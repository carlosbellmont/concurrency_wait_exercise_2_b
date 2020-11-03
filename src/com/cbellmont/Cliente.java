package com.cbellmont;

public class Cliente extends Thread {

    Callback callback;

    public Cliente(Callback callback){
        this.callback = callback;
    }


    @Override
    public void run() {
        while (!Main.list.isEmpty()){
            System.out.println("Cliente - Voy a consumir un " + Main.list.get(0) + " 3 segundos");
            Main.list.remove(0);
        }
        System.out.println("Cliente - Voy a esperar a que me traigan comida...");
        callback.onClienteFinished();
    }
}
