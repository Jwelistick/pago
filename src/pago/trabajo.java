package pago;

import java.util.Scanner;

public class trabajo {
    public static void main(String[] args) {
        int exp_Date, num_tarjeta, cvv;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca las 16 numeros de la parte delantera de la tarjeta:");
        num_tarjeta = Integer.parseInt(reader.next());
        System.out.println("Introduzca la fecha de expiracion en el formato: MMAA ");
        exp_Date = Integer.parseInt(reader.next());
        System.out.println("Introduce el codigo CVV de la tarjeta: ");
        cvv = Integer.parseInt(reader.next());
        Verificacion(numtarjeta, cvv, expDate);

    }

    public static boolean Verificacion(int numtarjeta,int  cvv,int expDate) {
        Scanner reader = new Scanner(System.in);
        boolean cobrook = false;

        System.out.println("Se cobrara la cantidad de $25.00 USD \n 1.- Aceptar \n 2.- Cancelar");

        int menu = Integer.parseInt(reader.next());
        if (menu == 1){

            System.out.println("Cobro exitoso !");
            cobrook = true;
        } else {

            System.out.println("Cobro rechazado ! \n Contacte a su institucion bancaria !");

        }



        return cobrook;


    }
}
