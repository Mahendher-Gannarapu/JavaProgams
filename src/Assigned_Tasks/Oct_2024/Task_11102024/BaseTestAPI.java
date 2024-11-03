package Assigned_Tasks.Oct_2024.Task_11102024;

public class BaseTestAPI {

    //Used Encapsulation
    private String name;
    private int id;

    //Default Constructor
    BaseTestAPI()
    {
        System.out.println("DC- BaseTest");
    }

    //Parameterized Constructor
    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("PC- BaseTest");
    }

    //Setter and Getter methods used Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id, boolean isAuth) {
        if(isAuth) {
            this.id = id;
            System.out.println("Access Allowed");
        }else{
            System.out.println("Not allowed access");
        }
    }

    void performGET()
    {
        System.out.println("Performing GET operation");
    }
    void performGET(String name, int id)
    {
        System.out.println("API Name ="+name+ "Id ="+id);
    }
    void performPOST()
    {
        System.out.println("Performing POST operation");
    }
    void performPATCH()
    {
        System.out.println("Performing PATCH operation");
    }
    void performPUT()
    {
        System.out.println("Performing PUT operation");
    }
    void performDELETE()
    {
        System.out.println("Performing DELETE operation");
    }
}

