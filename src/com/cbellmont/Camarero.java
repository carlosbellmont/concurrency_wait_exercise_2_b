package com.cbellmont;

public class Camarero extends Thread{

    Callback callback;

    public Camarero(Callback callback){
        this.callback = callback;
    }


    @Override
    public void run() {
        prepararComanda();
        callback.onCamareroFinished();
    }

    private void prepararComanda()  {
        try {
            System.out.println("Camarero - Si he llegado aqui es porque el cliente ha pedido comida. Debo llevarla");
            Main.list.add("Zumo");
            sleep(1000);
            Main.list.add("Tostada");
            sleep(1000);
            Main.list.add("Mermelada");
            sleep(1000);
            System.out.println("Camarero - El pedido ya esta listo. Tardo 5 segundos en llevarle la comida al cliente");
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

