/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DARCKYACKGTZ
 */
public class mueble{

    private int cantidad;
    private String tpsala;
    private String material;
    private int mano;

    // Contructor clase
    public mueble(int cantidad, String tpsala,
            String material, int mano) {
        this.cantidad = cantidad;
        this.tpsala = tpsala;
        this.material = material;
        this.mano = mano;
    }

// Métodos SET
    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void settpsala(String tpsala) {
        this.tpsala = tpsala;
    }

    public void setmaterial(String material) {
        this.material = material;
    }

    public void setmano(int mano) {
        this.mano = mano;
    }

// Métodos GET
    public int getcantidad() {
        return cantidad;
    }

    public String gettpsala() {
        return tpsala;
    }

    public String getmaterial() {
        return material;
    }

    public int getmano() {
        return mano;
    }

}
