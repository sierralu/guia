public class Metodos {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean raiz;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean secante;
    private boolean cosecante;
    private boolean cotangente;
    private boolean alcuadrado;
    private boolean alapotencia;
    private boolean calcularIva;

    // Constructor
    public Metodos() {
        cadena = "";
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        seno = false;
        coseno = false;
        tangente = false;
        cotangente = false;
        secante = false;
        cosecante = false;
        alcuadrado = false;
        alapotencia = false;
        calcularIva = false;
    }

    public String concatenamiento(String cadena) {
        this.cadena = this.cadena + cadena;
        return this.cadena;
    }

    public void suma(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        suma = true;
        this.cadena = "";
    }

    public void resta(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        resta = true;
        this.cadena = "";
    }

    public void multiplicacion(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        multiplicacion = true;
        this.cadena = "";
    }

    public void division(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        division = true;
        this.cadena = "";
    }

    public void raiz(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        raiz = true;
        this.cadena = "";
    }

    public void seno(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        seno = true;
        this.cadena = "";
    }

    public void coseno(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        coseno = true;
        this.cadena = "";
    }

    public void tangente(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        tangente = true;
        this.cadena = "";
    }

    public void cotangente(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        cotangente = true;
        this.cadena = "";
    }

    public void secante(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        secante = true;
        this.cadena = "";
    }

    public void cosecante(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        cosecante = true;
        this.cadena = "";
    }

    public void alcuadrado(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        alcuadrado = true;
        this.cadena = "";
    }

    public void alapotencia(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        alapotencia = true;
        this.cadena = "";
    }

    public void calcularIVA(double cantidad, double porcentajeIVA) {
        this.resultado = cantidad + (cantidad * (porcentajeIVA / 100));
        this.cadena = "";
    }

    public double resultado(String numero) {
        boolean alcuadrado = false;
        if (suma) {
            resultado = resultado + Double.parseDouble(numero);
        } else if (resta) {
            resultado = resultado - Double.parseDouble(numero);
        } else if (multiplicacion) {
            resultado = resultado * Double.parseDouble(numero);
        } else if (division) {
            resultado = resultado / Double.parseDouble(numero);
        } else if (raiz) {
            resultado = Math.sqrt(Double.parseDouble(numero));
        } else if (seno) {
            double seno = Math.toRadians(resultado);
            resultado = Math.sin(seno);
        } else if (coseno) {
            double coseno = Math.toRadians(resultado);
            resultado = Math.cos(coseno);
        } else if (tangente) {
            double tangente = Math.toRadians(resultado);
            resultado = Math.tan(tangente);
        } else if (cotangente) {
            double cotangente = Math.toRadians(resultado);
            resultado = 1 / Math.tan(cotangente);
        } else if (cosecante) {
            double cosecante = Math.toRadians(resultado);
            resultado = 1 / Math.sin(cosecante);
        } else if (secante) {
            double secante = Math.toRadians(resultado);
            resultado = 1 / Math.cos(secante);
        } else if (alcuadrado) {
            resultado = Math.pow(resultado, 2);
        } else if (alapotencia) {
            resultado = Math.pow(resultado, Double.parseDouble(numero));
        }

        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        seno = false;
        coseno = false;
        tangente = false;
        cotangente = false;
        secante = false;
        cosecante = false;
        alcuadrado = false;
        alapotencia = false;

        return resultado;
    }

    public double calcularIva(double cantidad, double porcentajeIVA) {
        return cantidad * (porcentajeIVA / 100);
    }

    void calcularIva(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
