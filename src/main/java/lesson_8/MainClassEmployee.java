package lesson_8;

public class MainClassEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ganna Ivanova", "AQA Engineer", "ivanova@company.com",
                "+375296789000", 8000.0, 37);
        employees[1] = new Employee("Volga Sidarava", "Manager", "sidarava@company.com",
                "+375291234545", 12000.0, 40);
        employees[2] = new Employee("Maryna Amelchenka", "Developer", "amelchenka@company.com",
                "+375291236969", 10000.0, 41);
        employees[3] = new Employee("Ivan Pupko", "Designer", "pupko@company.com",
                "+375291238899", 7000.0, 42);
        employees[4] = new Employee("Raman Sviatlo", "Devops", "sviatlol@company.com",
                "+375332455555", 11000.0, 55);

        System.out.println("Employees older than 40:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.displayInfoToConsole();
            }
        }
    }
}
