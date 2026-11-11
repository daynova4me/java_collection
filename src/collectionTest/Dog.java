package collectionTest;

public class Dog {
    private int id;
    private String name;
    private int age;


    //ㄱ Map에서 id(Key 값)이 필요하기 때문
    public int getId() {
        return id;
    }

    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
