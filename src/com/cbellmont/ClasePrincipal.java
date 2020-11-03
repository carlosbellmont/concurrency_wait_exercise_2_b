package com.cbellmont;

interface Callback {
    void onCamareroFinished();
    void onClienteFinished();
}

public class ClasePrincipal implements Callback {

    public ClasePrincipal() {
        Camarero camarero  = new Camarero(this);
        camarero.start();
    }

    @Override
    public void onCamareroFinished() {
        Cliente cliente = new Cliente(this);
        cliente.run();
    }

    @Override
    public void onClienteFinished() {
        Camarero camarero = new Camarero(this);
        camarero.run();
    }
}
