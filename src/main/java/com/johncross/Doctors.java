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


        Boolean pickingDoctor = true;
        while (pickingDoctor) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor name: ");
        String name = scanner.nextLine();
            if (doctorsAndTimes.containsKey(name)) {
                System.out.println("\nAppointment times begin every hour starting at 8:00 and end at 12:00.");
                System.out.println("Enter your desired appointment time based on the available times listed below: ");
                System.out.println(times.toString());
                String desiredAppointmentTime = scanner.next();
                if (times.contains(desiredAppointmentTime)) {
                    System.out.println("Please confirm that you would like to schedule an appointment with " + name + " at " + desiredAppointmentTime + " by pressing y/n, followed by the enter key: ");
                    String confirmAppointment = scanner.next();
                    if (confirmAppointment.equalsIgnoreCase("y")) {
                        doctorsAndTimes.remove(desiredAppointmentTime);
//                        doctorsAndTimes.remove(name);
//                        times.remove(desiredAppointmentTime);
                        System.out.println("Awesome. We will schedule your appointment.");
                        pickingDoctor = false;
                    } else {
                        System.out.println("Invalid input. Please try again!");
                        pickingDoctor = true;
                    }


                } else {
                    System.out.println("Appointment time is not available. Available times are listed below: ");
                    System.out.println(times.toString());
                }
            } else {
                System.out.println("Incorrect name entered.");
                pickingDoctor = true;

            }
        }
    }


}
