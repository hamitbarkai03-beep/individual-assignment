public abstract class Person implements Workable {

    // ENCAPSULATION: private variables
    private String name;
    private int age;
    private String city;

    // Static variable
    public static int totalPeople = 0;

    // CONSTRUCTOR
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        totalPeople++;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    // SETTERS
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    // ABSTRACT METHOD
    public abstract void introduce();

    // STATIC METHOD
    public static void showTotal() {
        System.out.println("Total people: " + totalPeople);
    }
}
