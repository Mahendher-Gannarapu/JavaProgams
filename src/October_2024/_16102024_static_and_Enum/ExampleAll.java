package October_2024._16102024_static_and_Enum;

public class ExampleAll {
    public static void main(String[] args) {
        ATB s1 = new ATB("MAhi", "9966886306");
        ATB s2 = new ATB("Srihansh", "9966886301");
        ATB s3 = new ATB("Suhanth", "9966886302");
        ATB s4 = new ATB("Lahari", "9966886303");

        ATB s5;
        new ATB("Raju", "9988776655");

        s1.readDocument();
        s2.readDocument();

        ATB.doAssignment();


    }
}

class ATB {
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to start a website or anything before starting the
        // web automation or api automation

        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB8x"; //All are taking course added static

    public ATB(String name, String phone) {
        this.name = name;
        this.phone = phone;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocument()
    {
        System.out.println("Non static method");
    }

    static void doAssignment()
    {
        System.out.println("Do Assignment");
    }


    static class GenAI
    {
           // 0.000001% used in Automation static class no need to concentrate
    }
}
