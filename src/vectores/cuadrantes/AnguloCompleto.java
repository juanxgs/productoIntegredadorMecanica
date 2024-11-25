package vectores.cuadrantes;

public class AnguloCompleto {
    public static double calcularAngulo(double x, double y) {
        double angulo = Math.toDegrees(Math.atan2(y, x));
        if (angulo < 0) {
            angulo = angulo + 360;
        }
        // ATAN2 YA AJUSTA EL ANGULO
        return angulo;
    }

    public static void calcularCuadrante(double x, double y){

        // MOSTRAR CUADRANTE
        if (x > 0 && y > 0) {
            System.out.println("Esta en el primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Esta en el segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Esta en el tercer cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("Esta en el cuarto cuadrante");
        }

    }


}
