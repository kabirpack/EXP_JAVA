package basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class classTypeObject {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 3213124);


        /// accessing class object created by JVM

        Class c1 = s1.getClass();

        System.out.println(c1.getName());

        // can get class's methods into an array

        Method m[] = c1.getDeclaredMethods();

        for(Method method : m){
            System.out.println(method.getName());
        }

        // can get class's field

        Field f[] = c1.getDeclaredFields();

        for(Field field : f){
            System.out.println(field.getName());
        }
    }

}

class Student{

    private String name;
    private int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

