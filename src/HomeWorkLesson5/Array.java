package HomeWorkLesson5;

public class Array {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Petr","manager","Petr@gmail.com", 89991234545L, 1500,50);
        persArray[1] = new Employee("Fedor", "manager", "fedor@gmail.com", 89996662396L, 1650, 39);
        persArray[2] = new Employee("Mira", "director", "mira@gmail.com", 89996664444L, 3500, 55);
        persArray[3] = new Employee("Zina", "accountant", "mira@gmail.com", 89996673654L, 1750, 51);
        persArray[4] = new Employee("Slava", "manager", "Slava@gmail.com", 86574673254L, 1463, 23);

        for (int i = 0; i < persArray.length ; i++) {
            if (persArray[i].getAge() >= 40)
                System.out.println(persArray[i]);

        }


    }


}
