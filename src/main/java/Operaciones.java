/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Operaciones {

    public float suma(float x, float y) {
        return x + y;
    }

    public float resta(float x, float y) {
        return x - y;
    }

    public float multiplicacion(float x, float y) {
        return x * y;
    }

    public float division(float x, float y) {
        if (y == 0)
            throw new ArithmeticException("Zero not allowed");
        return x / y;
    }

    public String operacionToString(String operation, float x, float y) {
        String output = "";
        switch (operation) {
            case "suma":
                output = "La suma de: " + x + " + " + y + " es: " + suma(x, y);
                break;
            case "resta":
                output = "La resta de: " + x + " - " + y + " es: " + resta(x, y);
                break;
        }
        return output;
    }

}
