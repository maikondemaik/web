import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto {
    ArrayList<double> listitaNumeros;
    
    public static void main(String []){
        ListaNumeros miLista = new  ListaNumeros();
        miLista.listaNumeros = new ArrayList();
        miLista.LeerOpcion();
        
    }

        
    }
   public void leerOpcion(){
       Scanner teclado = new Scanner (System.in);
        int opcion=0 ;
        
        do{
            System.out.println("\nLista de numeros");
            System.out.println("[1] Agregar");
            System.out.println("[2] buscar");
            System.out.println("[3] Modificar elemento ");
            System.out.println("[4] Eliminar elemento");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Mostrar elementos");
            System.out.println("[7] Salir\n");
            System.out.println("ingrese opcion (1-7):");
            opcion= teclado.nextInt();
            switch (opcion) {
                case 1:
                ingresarValor();
                break;

                case 2:
                ingresarValor();
                break;

                case 3:
                ingresarValor();
                break;

                case 4:
                ingresarValor();
                break;

                case 5:
                ingresarValor();
                break;

                case 6:
                ingresarValor();
                break;

                
                break;
        }
    }             while (opcion != 7);
}


public void ingresarValor() {
    Scanner teclado = new Scanner(System.in);
    double valor;
    System.out.println("Ingrese valor: ");
    valor = teclado.nextDouble();
    listaNumeros.add(valor);
}

public void modificarValor() {
    Scanner teclado = new Scanner(System.in);
    double valor, nuevoValor;
    int indice;
    System.out.println("Valor a modificar: ");
    valor = teclado.nextDouble();
    indice = listaNumeros.indexOf(valor);

    if (indice != -1) {
        System.out.println("Nuevo valor: "); 
        nuevoValor = teclado.nextDouble();
        listaNumeros.set(indice, nuevoValor);
} else {
        System.out.println("no se encuentra dato "); 
    }

    }

    public void eliminarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valor a eliminr: ");
        valor = entrada.nextDouble();
        indice = listaNumeros.indexOf(valor);
    }
        if (indice != -1) {
            listitaNumeros.remove(indice);
            System.out.println("dato eliminado "); 
            listaNumeros.set(indice, nuevoValor);
    } else {
            System.out.println("no se encuentra dato "); 
        }

        public void insertarValor() {
            Scanner teclado = new Scanner(System.in);
            double valor;
            int indice;
            System.out.println("Valor a incertar: ");
            valor = teclado.nextDouble();
            System.out.println("posicion donde  incertar: ");
            indice = teclado.nextInt();
            listitaNumeros.add(indice, valor);
        
           
            }

            public void mostrarLista() {
               if (!listitaNumeros.isEmpty()) {
                System.out.println("Elementos de la lista: ");
                for (int i = 0; i< listitaNumeros.size(); i++) {
                    System.out.println(listitaNumeros.get (i));
                }
               }else {
                System.out.println("No existen valores en la lista");
               }
                double valor;
                int indice;
                System.out.println("Valor a eliminr: ");
                valor = entrada.nextDouble();
                indice = listaNumeros.indexOf(valor);
            
                if (indice != -1) {
                    listitaNumeros.remove(indice);
                    System.out.println("dato eliminado "); 
                    listaNumeros.set(indice, nuevoValor);
            } else {
                    System.out.println("no se encuentra dato "); 
                }
        

            


}



                    
                   
            
           
       
        

