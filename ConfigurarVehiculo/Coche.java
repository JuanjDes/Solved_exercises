package clases.objetos;

public class Coche {
    // Estas propiedades de un coche son fijas, no variarán
    private int peso_chasis;
    private double motor, largo, ancho;

    // Estas propiedades de un coche sí van a poder variar
    private String color;
    private boolean asientos_cuero, climatizador;
    private int precio_final = 15000;

    // En este constructor inicializamos las propiedades fijas
    public Coche() {
        largo = 4000; ancho = 1500; motor = 1900; peso_chasis = 1200;
    }

// -------------- A PARTIR DE AQUÍ SE DECLARAN LOS MÉTODOS O FUNCIONES QUE SE VAN A UTILIZAR EN EL MAIN --------------

    // Este es un método Getter -> devuelve algo
    public String dime_datos() {
        return "La plataforma del vehículo tiene: \n"
                + "------------------------------------ \n"
                + "un largo de " + largo/1000 + " metros \n"
                + "un ancho de " + ancho/1000 + " metros \n"
                + "un motor de " + motor/1000 + " CC \n"
                + "un peso del chasis de " + peso_chasis + " Kg";
    }

    /* Este es un método Setter -> recibe el String color del Main y asigna su valor a la variable color
        de esta Clase */
    public void establece_color(String color) {
        this.color = color;
    }

    // Creamos otro método Getter para que devuelva al Main el valor de la variable color
    public String dime_color() {
        return "Color: " + this.color;
    }

    // Otro Setter -> recibe el String asientos_cuero del Main
    public void config_asientos(int asientos_cuero) {
         if (asientos_cuero == 0) { this.asientos_cuero = true; }
         else { this.asientos_cuero = false; }
    }

    // Otro Getter. Dependiendo del valor de asientos_cuero, devuelve al Main una cosa u otra
    public String dime_asientos() {
        if (asientos_cuero) { return "Asientos de cuero"; }
        else { return "Asientos de serie"; }
    }

    public void config_clima(int climatizador) {
        if (climatizador == 0) {this.climatizador = true;}
        else {this.climatizador = false;}
    }

    public String tiene_clima() {
        if (climatizador) { return "Climatizador";}
        else {return "Sin Climatizador";}
    }

    public int precio_coche() {
        if (asientos_cuero) {this.precio_final += 1200;}
        if (climatizador) {this.precio_final += 1000;}

        return precio_final;
    }
}
