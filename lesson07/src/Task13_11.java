public class Task13_11 {
    public static void main(String[] args) {
        Employee[] company = makeCompany();
        Searcher.findEmployeeByAges(company, 12);
        Searcher.findEmployeeByName(company, "ИВАН");
    }

    static Employee[] makeCompany() {
        Employee[] company = new Employee[20];
        company[0] = new Employee("Иванов", "Иван", "Иванович", "Москва", 2010, 4);
        company[1] = new Employee("Сидоров", "Сеня", "Сидорович", "Москва", 2013, 1);
        company[2] = new Employee("Петров", "Андрей", "Иванович", "Киев", 2012, 7);
        company[3] = new Employee("Шубин", "Константин", "Сергеевич", "Москва", 2014, 12);
        company[4] = new Employee("Осипенко", "Павел", "Валентинович", "Львов", 2009, 4);
        company[5] = new Employee("Коваленко", "Татьяна", "Ивановна", "Москва", 2010, 2);
        company[6] = new Employee("Горишняя", "Александра", "Игоревна", "Киев", 2005, 4);
        company[7] = new Employee("Бунин", "Иван", "Яковлевич", "Москва", 2011, 8);
        company[8] = new Employee("Перепелкин", "Сергей", "Иванович", "Москва", 2010, 6);
        company[9] = new Employee("Жуков", "Петр", "Иванович", "Курск", 2013, 12);
        company[10] = new Employee("Яковлев", "Александр", "Иванович", "Москва", 2014, 3);
        company[11] = new Employee("Жук", "Павел", "Иванович", "Москва", 2010, 9);
        company[12] = new Employee("Лохман", "Петр", "Иванович", "Москва", 2014, 10);
        company[13] = new Employee("Лихачев", "Яков", "Иванович", "Киев", 2013, 2);
        company[14] = new Employee("Компан", "Ярослав", "Иванович", "Москва", 2010, 1);
        company[15] = new Employee("Ермашова", "Алиса", "Ивановна", "Москва", 2006, 5);
        company[16] = new Employee("Чех", "Иван", "Иванович", "Москва", 2003, 1);
        company[17] = new Employee("Кушнир", "Василий", "Иванович", "Москва", 2014, 11);
        company[18] = new Employee("Дмитренко", "Артем", "Иванович", "Минск", 2013, 8);
        company[19] = new Employee("Петрова", "Олеся", "Игорьевна", "Москва", 2013, 2);
        return company;
    }

    public static class Employee {
        String lastName;
        String firstName;
        String midName;
        String address;
        int joinYear;
        int joinMonth;

        public Employee(String lastName, String firstName, String midName, String address, int joinYear, int joinMonth) {
            this(lastName, firstName, address, joinYear, joinMonth);
            this.midName = midName;
        }

        public Employee(String lastName, String firstName, String address, int joinYear, int joinMonth) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.address = address;
            this.joinYear = joinYear;
            this.joinMonth = joinMonth;
        }

        int getFullAges() {
            int currentYear = 2015;
            int currentMonth = 01;
            return (currentMonth - this.getJoinMonth()) == 0 ? currentYear - this.getJoinYear() + 1 : currentYear - this.getJoinYear();
        }


        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getJoinYear() {
            return joinYear;
        }

        public void setJoinYear(int joinYear) {
            this.joinYear = joinYear;
        }

        public int getJoinMonth() {
            return joinMonth;
        }

        public void setJoinMonth(int joinMonth) {
            this.joinMonth = joinMonth;
        }
    }

    static class Searcher {
        static void findEmployeeByAges(Employee[] eployers, int age) {
            for (Employee worker : eployers) {
                if (worker.getFullAges() >= age) {
                    System.out.println(worker.getLastName() + " " + worker.getFirstName() + " " + worker.getMidName() + " " + worker.getAddress());
                }
            }
        }

        static void findEmployeeByName(Employee[] eployers, String name) {
            for (Employee worker : eployers) {
                if ((worker.getFirstName() + worker.getMidName() + worker.getLastName()).toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(worker.getLastName() + " " + worker.getFirstName() + " " + worker.getMidName() + " " + worker.getAddress());
                }
            }
        }
    }

}
