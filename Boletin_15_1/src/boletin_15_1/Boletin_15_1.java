package boletin_15_1;

public class Boletin_15_1 {

    public static void main(String[] args) {
        Producto p1 = new Producto("C1",24);
        Producto p2 = new Producto("H23",234);
        Producto p3 = new Producto("M30",109);
        try{
            System.out.println(p1.factura() + "," + p2.factura() + "," + p3.factura());
            p2.setCodigo("K123");
            p2.setPrecio(247);
            System.out.println(p1.factura() + "," + p2.factura() + "," + p3.factura());
        }catch(CodigoException e1){
            System.out.println(e1.getMessage());
        }
    }   
}