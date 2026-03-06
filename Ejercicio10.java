public class Ejercicio10 {
    public void prod(String[]args){
        ProductoOferta[][] productos= new ProductoOferta[2][2];
        int contador=0;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                if(productos[i][j]!=null && productos[i][j].enOferta){
                    contador++;
                }
            }
        }
        System.out.println("Productos en oferta: "+contador);
    }
}
