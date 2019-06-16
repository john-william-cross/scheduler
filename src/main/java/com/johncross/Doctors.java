package com.johncross;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Doctors {


    void createSchedule() {
        HashMap<String, ArrayList<String>> doctorsAndTimes = new HashMap<>();
        ArrayList<String> times = new ArrayList<>();
        times.add(0, "8:00");
        times.add(1, "9:00");
        times.add(2, "10:00");
        times.add(3, "11:00");
        times.add(4, "12:00");

        doctorsAndTimes.put("Dr. Who", times);
        doctorsAndTimes.put("Dr. Strangelove", times);
        doctorsAndTimes.put("Dr. Frankenstein", times);
        doctorsAndTimes.put("Dr. Seuss", times);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor name: ");
        String name = scanner.nextLine();
        if (doctorsAndTimes.containsKey(name)) {
            System.out.println("\nAppointment times begin every hour starting at 8:00 and end at 12:00.");
            System.out.println("Enter your desired appointment time: ");
            String desiredAppointmentTime = scanner.next();
            if (times.contains(desiredAppointmentTime)) {
                System.out.println("sweet");
                }
        } else {
            System.out.println("Incorrect name entered.");
        }
    }



}
