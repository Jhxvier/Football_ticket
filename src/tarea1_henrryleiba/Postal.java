

//AUTHOR: HENRRY JAVIER LEIBA CALERO

/* 
    Graphical interface made in Java for the creation of an application to buy feed for quail.
*/

package tarea1_henrryleiba;


public class Postal {
    
    private String secc;
    private double costo, total, total_oficial;

    public double getTotal_oficial() {
        return total_oficial;
    }

    public void setTotal_oficial(double total_oficial) {
        this.total_oficial = total_oficial;
    }
    private String[][] Factura;
    
    public Postal(String seccion) {
        this.secc = seccion;
        this.Factura = new String[25][4];
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public String[][] getFactura() {
        return Factura;
    }

    public void setFactura(String[][] Factura) {
        this.Factura = Factura;
        this.total = 0;
    }

    
    public void contador(String secc, int pulsar_compra){
        if (secc.equals("Página Principal")){
            costo = 150;
            total = costo + total;
        } else if (secc.equals("Estadios")){
            costo = 100;
            total = costo + total;
        } else if (secc.equals("Extra Sticker")){
            costo = 150;
            total = costo + total;
        } else if (secc.equals("Postales")){
            costo = 200;
            total = costo + total;
        } else if (secc.equals("Museo Fifa")){
            costo = 150;
            total = costo + total;
        }
        setTotal(total);
    }
    
    public void sumar_compras(double sumar[], int contador ,String seccion){
        double acumulador = 0;
        for (int i = 0; i < contador; i++) {
            acumulador += sumar[i];
        }
        total_oficial = acumulador;
        
        //MÉTODO QUE UTILICÉ PARA AUMENTAR 3000 COLONES DE ENVÍO
        if (seccion.equals("Domicilio")){
            total_oficial += 3000;
        } else if (seccion.equals("No Domicilio") && total_oficial >= 3000){
            total_oficial -= 3000;
        }
        
        setTotal_oficial(total_oficial);
    }
}
