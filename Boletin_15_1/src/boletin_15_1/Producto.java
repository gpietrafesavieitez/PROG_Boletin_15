package boletin_15_1;

public class Producto{
    private String codigo;
    private float precio;

    public Producto() {
    }

    public Producto(String codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String factura() throws CodigoException {
        if(codigo.matches("[A-Z]+\\d*")){
            return "(código:" + codigo + ",precio:" + precio + " euros)";
        }else{
            throw new CodigoException("El código debe estar formado por una letra mayúscula y uno o varios números. Por ejemplo: 'C123'.");
        }
    }
}