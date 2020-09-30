package javajihe.Collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int ages;

    public Person(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAges()-o.getAges();//年龄升序
        //return o.getAges()-o.getAges();//年龄降序

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }
}
