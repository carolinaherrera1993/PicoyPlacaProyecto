/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author carol
 */
public class FechaConverter {

    private Date date;
    private Calendar calendar;

    public FechaConverter() {

    }

    public int dayOfweek(Date date) { //  retorna el dia de la semana dependiendo de la fecha. Por ejemplo, Lunes=2

        calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek;
    }

    public Date transformDate(String date) throws ParseException { // Transforma la fecha ingresada en Date de Java  para comparar con el formato estandar

        DateFormat format = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH); // lee el formato ingresado
        this.date = format.parse(date); // transforma el formato ingresado en Date de Java (formato estandar)

        return this.date;
    }

}
