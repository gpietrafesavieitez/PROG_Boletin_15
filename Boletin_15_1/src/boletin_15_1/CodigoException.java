package boletin_15_1;

public class CodigoException extends Exception {

    public CodigoException() {
        super();
    }
    
    public CodigoException(String msg) {
        super("[!] Error: " + msg);
    }  
}
