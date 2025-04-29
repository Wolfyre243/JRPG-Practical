package Practical3;

import java.util.Arrays;

class Lecturer {
    private String name;
    private int staffID;

    // Constructor
    public Lecturer(String name, int staffID) {
        this.name = name;
        this.staffID = staffID;
    }

    // Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getStaffID() {
        return this.staffID;
    }

    // Methods
    public double calcMonthlyPay() {
        return 0.0;
    }
}

class FullTimeLecturer extends Lecturer {
    private String[] PTClass;
    private int[] classSize;
    private double salary;
    
    public FullTimeLecturer(String name, int staffID, String[] PTClass, int[] classSize, double salary) {
        super(name, staffID);

        this.PTClass = PTClass;
        this.classSize = classSize;
        this.salary = salary;
    }

    public double calcMonthlyPay() {
        return this.salary;
    }

    public double calcPTLunchSubsidy() {
        return Arrays.stream(classSize).sum() * 10.0;
    }
}

class PartTimeLecturer extends Lecturer {
    private double hourlyRate;
    private double monthlyHours;

    public PartTimeLecturer(String name, int staffID, double hourlyRate, double monthlyHours) {
        super(name, staffID);
        this.hourlyRate = hourlyRate;
        this.monthlyHours = monthlyHours;
    }

    public double calcMonthlyPay() {
        return this.hourlyRate * this.monthlyHours;
    }
}

public class LecturerUser { 
    public static void main(String[] args) {
        Lecturer[] lecArray = new Lecturer[4];
        lecArray[0] = new FullTimeLecturer("John", 1, new String[]{"1A / 01", "1A / 02"}, new int[]{20, 22}, 3500);
        lecArray[1] = new FullTimeLecturer("Jack", 2, new String[]{"1B / 01", "1B / 02"}, new int[]{25, 22}, 4000);
        lecArray[2] = new PartTimeLecturer("Joe", 11, 60, 60);
        lecArray[3] = new PartTimeLecturer("Janny", 12, 60, 45);

        for (int i = 0; i < lecArray.length; i++) {
            System.out.printf("Name: %s (ID %d)\n", lecArray[i].getName(), lecArray[i].getStaffID());
            System.out.printf("Monthly Pay: %.2f\n\n", lecArray[i].calcMonthlyPay());
        }
    }
}
