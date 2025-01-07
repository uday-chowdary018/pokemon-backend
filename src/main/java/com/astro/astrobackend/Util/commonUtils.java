package com.astro.astrobackend.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class commonUtils {


    public static LocalDate convertStringToDateObject(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, formatter);
    }
}
