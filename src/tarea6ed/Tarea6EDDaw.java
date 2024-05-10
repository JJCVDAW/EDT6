package tarea6ed;

public class Tarea6EDDaw {

    public static final double PERCENT1_CONSTANT = 0.8;
    public static final double PERCENT2_CONSTANT = 0.95;

    private void showScreenOutPut(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;

        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * PERCENT1_CONSTANT;
            showScreenOutPut(Total);
        } else {
            Total = precioProducto * PERCENT2_CONSTANT;
            showScreenOutPut(Total);
        }
    }
}
