/**
 * @Author alexandre.gaia
 */

public class Person {
    private String name;
    private String hairColor;
    private int age;

    //definindo o objeto para a instanciação.
    public Person(String name, String hairColor, int age){
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showPersonInformation(){
        System.out.println("Name: " + name);
        System.out.println("HairColor: " + hairColor);
        System.out.println("age: " + age);
    }


    //criação do método de exibição dos detalhes.
    public void personInfo(){
        System.out.println("My name is " + name + ", my hair color is " + hairColor + " and I'm " + age + " years old.");
    }
    //criação do método de andar.
    public void walk(){
        System.out.println(name + " has started walking.");
    }
    //criação do método de correr.
    public void run(){
        System.out.println(name + " has started running.");
    }
    //criação do método de parar.
    public void stop(){
        System.out.println(name + " has stopped.");
    }


    public static void main(String[] args){
        //instanciando o Person
        Person person = new Person("Alexandre", "Black", 20);

        //chamando os métodos.
        person.personInfo();
        person.walk();
        person.run();
        person.stop();
    }
}
