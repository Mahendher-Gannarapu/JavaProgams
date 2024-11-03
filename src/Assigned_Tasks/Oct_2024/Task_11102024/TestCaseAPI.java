package Assigned_Tasks.Oct_2024.Task_11102024;

public class TestCaseAPI extends BaseTestAPI{

    public TestCaseAPI() {
        super(); //Call the BaseTestAPI DC
        System.out.println("DC- TestCaseAPI");
        this.performGET("Mahendher", 1234);
        this.setId(1111, true);

    }

    @Override
    void performGET(String name, int id) {
        super.performGET(name, id);
    }

    @Override
    public void setId(int id, boolean isAuth) {
        super.setId(id, isAuth);
    }
}
