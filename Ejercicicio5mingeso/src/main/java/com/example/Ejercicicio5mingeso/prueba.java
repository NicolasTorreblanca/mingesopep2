
package com.example.Ejercicicio5mingeso;

import java.sql.Timestamp;


public class prueba {
    public static void main(String[] args) {

        String dateTime = "2020-12-12 01:24:23";

        Timestamp timestamp = Timestamp.valueOf(dateTime);
        System.out.println(timestamp);
    }
}
