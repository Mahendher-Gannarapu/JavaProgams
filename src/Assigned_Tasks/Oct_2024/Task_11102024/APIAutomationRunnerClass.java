package Assigned_Tasks.Oct_2024.Task_11102024;

import October_2024._11102024_SuperKeyword.Example2.TestClass1;

public class APIAutomationRunnerClass {
    public static void main(String[] args) {

        BaseTestAPI b = new TestCaseAPI();
        b.setId(1111,true);
        b.performGET();
        b.performPOST();
        b.performPATCH();
        b.performDELETE();
        b.performPUT();
    }
}
