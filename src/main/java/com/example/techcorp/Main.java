package com.example.techcorp;
 
public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp", 50000);
 
        Employee anna  = new Employee("Anna",  8, 7000);
        Employee piotr = new Employee("Piotr", 6, 6500);
        Employee marta = new Employee("Marta", 9, 8000);

        company.hire(anna);
        company.hire(piotr);
        company.hire(marta);
 
        Project project = new Project("Mobile App", 100);
        project.addEmployee(anna);
        project.addEmployee(piotr);
        project.addEmployee(marta);
        company.startProject(project);
        Project project2 = new Project("Website Redesign", 50);
        project2.addEmployee(marta);
        company.startProject(project2);

 
        int turns = 0;
        while (!project.isComplete()) {
        project.workOneTurn();
        turns++;
}
System.out.println("Completed in " + turns + " turn(s).");

    }
}
