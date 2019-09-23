public class Calculadora {

    public double calcular(double v1, double v2, String op) {
        double res = 0;

        switch (op) {
            case "[+]": {
                res = v1 + v2;
                break;
            }
            case "[-]": {
                res = v1 - v2;
                break;
            }
            case "[*]": {
                res = v1 * v2;
                break;
            }
            case "[/]": {
                res = v1 / v2;
                break;
            }
        }
        return res;
    }
}
