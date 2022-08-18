package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,8,5,5);
        imprimirNumeros(1,3);
        variosParametros("Juan", 3,5,3,2);
    }
    //--------------------------------------------------- VARARGS ---------------------------------------------------------------
    //------------------------------------Argumentos variables: pasar un argumento a un metodo, trabajar con metodo de forma obligatoria------------------------
    //------------------------------------No se especifica cuantos valores se pasan al metodo---------------------------------------
    //--------------------------------------No se necesita saber cuantos argumentos se van a pasar a ese metodo
    private static void imprimirNumeros(int... numeros){//privado por que solo se accede a partir de esta clase, y como psvm es statico igual se define como estatico
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: = " + numeros[i]);
        }
    }
    
    //------------------------------------------ Los argumentos variables deben ser el ultimo argumento del metodo ----------------------------------------
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
}
