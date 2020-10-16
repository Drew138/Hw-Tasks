import java.net.*;
import java.io.*;

public class EjercicioEstrella {
    public static void main(String[] args) throws Exception {
        String rutaJumbo = "https://www.tiendasjumbo.co/tecnologia/televisores-y-video/proyectores";
        URL url = new URL(rutaJumbo);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String codigoFuente = "";
        String linea;
        while ((linea = reader.readLine()) != null) {
            codigoFuente = codigoFuente + linea;
        }
        while (codigoFuente.indexOf("<span itemprop=\"name\">") != -1) {
            int index = codigoFuente.indexOf("<span itemprop=\"name\">") + 22;
            codigoFuente = codigoFuente.substring(index, codigoFuente.length());
            int endTag = codigoFuente.indexOf("<");
            String nombre = codigoFuente.substring(0, endTag);
            int indexBrand = codigoFuente.indexOf("<p class=\"texto brand ") + 22;
            codigoFuente = codigoFuente.substring(indexBrand, codigoFuente.length());
            int endBrandTag = codigoFuente.indexOf(">");
            String marca = codigoFuente.substring(0, endBrandTag - 1);
            int indexPrecio = codigoFuente
                    .indexOf("<span class=\"product-prices__value product-prices__value--best-price\">") + 70;
            codigoFuente = codigoFuente.substring(indexPrecio, codigoFuente.length());
            int endPriceTag = codigoFuente.indexOf("<");
            String precio = codigoFuente.substring(0, endPriceTag);
            System.out.println("Nombre: " + nombre + ", marca: " + marca + ", Precio: " + precio);
        }
        reader.close();
        // System.out.println(codigoFuente);
        // use indexOf, substring y length
    }
}
