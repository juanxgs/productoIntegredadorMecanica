package dinamica;

import java.util.Scanner;

public class TerceraLey {
    public static void mostrarMenu(){
        Scanner krla = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Tension con Friccion");
            System.out.println("2. Tension sin Friccion");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion= krla.nextInt();

            switch (opcion){
                case 1:
                    tensionFriccion(krla);
                    break;
                case 2:
                    tensionSinFriccion();
            }
        } while (opcion != 0);
    }

    public static void tensionFriccion(Scanner abi){

                // Solicitar al usuario el peso del objeto (en Newtons)
                System.out.print("Ingrese el peso del objeto (en Newtons): ");
                double peso = abi.nextDouble();

                // Solicitar los angulos de las cuerdas en grados
                System.out.print("Ingrese el angulo de la primera cuerda (en grados): ");
                double angulo1 = abi.nextDouble();

                System.out.print("Ingrese el angulo de la segunda cuerda (en grados): ");
                double angulo2 = abi.nextDouble();

                // Solicitar el coeficiente de fricción (mu)
                System.out.print("Ingrese el coeficiente de fricción (mu): ");
                double mu = abi.nextDouble();

                // Convertir los angulos a radianes
                double angulo1Rad = Math.toRadians(angulo1);
                double angulo2Rad = Math.toRadians(angulo2);

                // Calcular las tensiones T1 y T2 usando las formulas de equilibrio de fuerzas con fricción
                double T1 = calcularTension1(peso, angulo1Rad, angulo2Rad, mu);
                double T2 = calcularTension2(T1, angulo1Rad, angulo2Rad, mu);

                // Mostrar las tensiones calculadas
                System.out.println("La tension en la primera cuerda (T1) es: " + T1 + " N");
                System.out.println("La tension en la segunda cuerda (T2) es: " + T2 + " N");

            }

            // Metodo para calcular la tension en la primera cuerda
            public static double calcularTension1(double peso, double angulo1Rad, double angulo2Rad, double mu) {
                // Calcular la fuerza de fricción (fuerza máxima en la dirección horizontal)
                double fFriccion = mu * peso;

                // Formula para T1, que es la solución de la ecuación vertical
                double denominador = Math.sin(angulo1Rad) + (Math.cos(angulo1Rad) * Math.sin(angulo2Rad) / Math.cos(angulo2Rad));
                double T1 = peso / denominador;

                // Verificar si la fricción es mayor que cero, si es así, agregarla al equilibrio horizontal
                double componenteHorizontalT1 = T1 * Math.cos(angulo1Rad);
                double componenteHorizontalT2 = T1 * Math.cos(angulo2Rad);

                // Asegurarse de que la fricción está dentro de los límites correctos
                double totalFriccion = fFriccion + Math.abs(componenteHorizontalT1 - componenteHorizontalT2);

                // Devolver la tensión con la fricción
                return T1;
            }

            // Metodo para calcular la tension en la segunda cuerda
            public static double calcularTension2(double T1, double angulo1Rad, double angulo2Rad, double mu) {
                // Formula para T2 usando la ecuación horizontal
                return T1 * Math.cos(angulo1Rad) / Math.cos(angulo2Rad);
            }


    public static void tensionSinFriccion(){
        Scanner krla = new Scanner(System.in);

        // Solicitar al usuario el peso del objeto (en Newtons)
        System.out.print("Ingrese el peso del objeto (en Newtons): ");
        double peso = krla.nextDouble();

        // Solicitar los angulos de las cuerdas en grados
        System.out.print("Ingrese el angulo de la primera cuerda (en grados): ");
        double angulo1 = krla.nextDouble();

        System.out.print("Ingrese el angulo de la segunda cuerda (en grados): ");
        double angulo2 = krla.nextDouble();

        // Convertir los angulos a radianes
        double angulo1Rad = Math.toRadians(angulo1);
        double angulo2Rad = Math.toRadians(angulo2);

        // Calcular las tensiones T1 y T2 usando las formulas de equilibrio de fuerzas
        double T1 = calcularTension1(peso, angulo1Rad, angulo2Rad);
        double T2 = calcularTension2(T1, angulo1Rad, angulo2Rad);

        // Mostrar las tensiones calculadas
        System.out.println("La tension en la primera cuerda (T1) es: " + T1 + " N");
        System.out.println("La tension en la segunda cuerda (T2) es: " + T2 + " N");

    }

        // Metodo para calcular la tension en la primera cuerda
        public static double calcularTension1(double peso, double angulo1Rad, double angulo2Rad) {
            // Formula para T1, que es la solución de la ecuación vertical
            double denominador = Math.sin(angulo1Rad) + (Math.cos(angulo1Rad) * Math.sin(angulo2Rad) / Math.cos(angulo2Rad));
            return peso / denominador;
        }

        // Metodo para calcular la tension en la segunda cuerda
        public static double calcularTension2(double T1, double angulo1Rad, double angulo2Rad) {
            // Formula para T2 usando la ecuación horizontal
            return T1 * Math.cos(angulo1Rad) / Math.cos(angulo2Rad);
        }

}
