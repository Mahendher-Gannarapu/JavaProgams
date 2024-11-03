package Assigned_Tasks.Oct_2024.Task_11102024;

public class Explanation {
    /*
    Here’s a breakdown of its structure and functionality:

BaseTestAPI Class:

Attributes:
Private attributes name and id to follow encapsulation.
Getter and setter methods control access to these attributes, with setId implementing authorization logic (requires isAuth to be true to allow changes).
Constructors:
A default constructor that prints a message.
A parameterized constructor that initializes name and id and prints a message.
Methods:
Several perform methods simulate various API actions (GET, POST, PATCH, PUT, DELETE).
An overloaded performGET method with parameters name and id allows flexible GET calls.
These methods print the action type and associated information.

TestCaseAPI Class:

Inheritance: Inherits BaseTestAPI using extends and utilizes super() to call the base class's constructor.
Method Overriding:
Overrides performGET and setId from BaseTestAPI to add additional functionality or custom behavior.
The default constructor calls performGET with specific parameters and setId with an authorization check.
APIAutomationRunnerClass:

Main Class: Runs the program by creating a TestCaseAPI object but assigns it to a BaseTestAPI reference (demonstrating polymorphism).
Method Calls:
Calls setId to set id with authorization.
Invokes performGET without parameters and then calls the perform methods to simulate API operations.

Key Points
Encapsulation: BaseTestAPI has private variables with controlled access via getters/setters.
Inheritance: TestCaseAPI inherits BaseTestAPI, allowing code reuse.
Method Overriding: TestCaseAPI overrides performGET and setId to extend or modify base functionality.
Polymorphism: TestCaseAPI instance is referenced as BaseTestAPI in APIAutomationRunnerClass, enabling dynamic method binding.
     */
}
