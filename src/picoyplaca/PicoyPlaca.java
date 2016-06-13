/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Carolina Herrera
 */
public class PicoyPlaca {

    private final Integer placa0 = 0; // ultimo digito 0
    private final Integer placa1 = 1; // ultimo digito 1
    private final Integer placa2 = 2; // ultimo digito 2
    private final Integer placa3 = 3; // ultimo digito 3
    private final Integer placa4 = 4; // ultimo digito 4
    private final Integer placa5 = 5; // ultimo digito 5
    private final Integer placa6 = 6; // ultimo digito 6
    private final Integer placa7 = 7; // ultimo digito 7
    private final Integer placa8 = 8; // ultimo digito 8
    private final Integer placa9 = 9; // ultimo digito 9

    public PicoyPlaca() {

    }

    // metodo que compara los datos de la placa, fecha y hora y retorna si el usuario puede circular o no
    public String circulacion(String placaString, String fechaString, String hora) {

        try {

            System.out.println("Placa: " + placaString + " Fecha: " + fechaString + " Hora: " + hora);

            if (placaString.length() != 7) { // validacion de la placa. Debe contener 7 digitos

                System.out.println("Error! Por favor ingrese la placa en el formato correcto (XXX1234)");
                System.exit(0);

            }

            Placa placa = new Placa(placaString); // inicializa la placa con el numero ingresado
            FechaConverter fecha = new FechaConverter();
            Date date = fecha.transformDate(fechaString); /// convierte la fecha ingresada en string en Date 
            String[] horasSplit = hora.split(":"); // obtiene la hora
            LocalTime time = LocalTime.of(Integer.valueOf(horasSplit[0]), Integer.valueOf(horasSplit[1])); // inicializa la hora en LocalTime

            if (placa.getUltimoDigito().equals(placa1) || placa.getUltimoDigito().equals(placa2)) { // si la placa termina en 1 o 2

                if (fecha.dayOfweek(date) == 2) { // si el dia de la semana es Lunes

                    if (time.isAfter(LocalTime.of(6, 59)) && time.isBefore(LocalTime.of(9, 30)) || time.isAfter(LocalTime.of(15, 59))
                            && time.isBefore(LocalTime.of(19, 30))) { // si se encuentra en las horas de pico y placa

                        System.out.println("No puede circular");

                    } else {

                        System.out.println("Si puede circular");

                    }

                } else {

                    System.out.println("Si puede circular");
                }

            } else if (placa.getUltimoDigito().equals(placa3) || placa.getUltimoDigito().equals(placa4)) { // si la placa termina en 3 o 4
                if (fecha.dayOfweek(date) == 3) { // si el dia de la semana es Martes

                    if (time.isAfter(LocalTime.of(6, 59)) && time.isBefore(LocalTime.of(9, 30)) || time.isAfter(LocalTime.of(15, 59))
                            && time.isBefore(LocalTime.of(19, 30))) { // si se encuentra en las horas de pico y placa

                        System.out.println("No puede circular");

                    } else {

                        System.out.println("Si puede circular");

                    }

                } else {

                    System.out.println("Si puede circular");
                }

            } else if (placa.getUltimoDigito().equals(placa5) || placa.getUltimoDigito().equals(placa6)) { // si el ultimo digito de la placa termina en 5 o 6
                if (fecha.dayOfweek(date) == 4) { // si el dia de la semana es Miercoles

                    if (time.isAfter(LocalTime.of(6, 59)) && time.isBefore(LocalTime.of(9, 30)) || time.isAfter(LocalTime.of(15, 59))
                            && time.isBefore(LocalTime.of(19, 30))) { //si se encuentra en las horas de pico y placa

                        System.out.println("No puede circular");

                    } else {

                        System.out.println("Si puede circular");

                    }

                } else {

                    System.out.println("Si puede circular");
                }

            } else if (placa.getUltimoDigito().equals(placa7) || placa.getUltimoDigito().equals(placa8)) { // si el ultimo digito de la placa termina en 7 u 8
                if (fecha.dayOfweek(date) == 5) { // si el dia de la semana es Jueves

                    if (time.isAfter(LocalTime.of(6, 59)) && time.isBefore(LocalTime.of(9, 30)) || time.isAfter(LocalTime.of(15, 59))
                            && time.isBefore(LocalTime.of(19, 30))) { //si se encuentra en las horas de pico y placa

                        System.out.println("No puede circular");

                    } else {

                        System.out.println("Si puede circular");

                    }

                } else {

                    System.out.println("Si puede circular");
                }

            } else if (placa.getUltimoDigito().equals(placa9) || placa.getUltimoDigito().equals(placa0)) { // si el ultimo digito de la placa es 9 o 0
                if (fecha.dayOfweek(date) == 6) { // si el dia de la semana es viernes

                    if (time.isAfter(LocalTime.of(6, 59)) && time.isBefore(LocalTime.of(9, 30)) || time.isAfter(LocalTime.of(15, 59))
                            && time.isBefore(LocalTime.of(19, 30))) { //si se encuentra en las horas de pico y placa

                        System.out.println("No puede circular");

                    } else {

                        System.out.println("Si puede circular");

                    }

                } else { // si es sabado o domingo

                    System.out.println("Si puede circular");
                }
            }
        } catch (ParseException e) {
            System.out.println("Error! Por favor ingrese la fecha en el formato Correcto (dd MMM aaaa). ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! Por favor ingrese  la hora en el formato Correcto (8:30). ");
        }

        return "success";
    }

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        PicoyPlaca pico = new PicoyPlaca();

        pico.circulacion("PBX2903", "14 Jun 2016", "19:00");
    }

}
