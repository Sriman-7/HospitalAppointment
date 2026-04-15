import java.util.*;

class Patient implements Comparable<Patient>
{
    String name;
    int age;
    String disease;
    int priority;

    Patient(String name, int age, String disease, int priority)
    {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.priority = priority;
    }

    public int compareTo(Patient p)
    {
        return this.priority - p.priority;
    }

    public String toString()
    {
        return "Name: " + name +
               ", Age: " + age +
               ", Disease: " + disease +
               ", Priority: " + priority;
    }
}

public class HospitalAppointment
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        while(true)
        {
            System.out.println("\n--- Hospital Appointment System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Call Next Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    System.out.print("Enter Priority (1-High, 2-Medium, 3-Low): ");
                    int priority = sc.nextInt();

                    queue.add(new Patient(name, age, disease, priority));
                    System.out.println("Patient Added!");
                    break;

                case 2:
                    if(queue.isEmpty())
                        System.out.println("No Patients Waiting.");
                    else
                        System.out.println("Next Patient: " + queue.poll());
                    break;

                case 3:
                    if(queue.isEmpty())
                        System.out.println("No Patients.");
                    else
                    {
                        for(Patient p : queue)
                            System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}