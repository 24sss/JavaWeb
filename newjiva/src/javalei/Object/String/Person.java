package javalei.Object.String;

public class Person {
    private String name;
    private  int ages;

    //下面两个是Person类重写toString方法

   /*public String toString(){
       return "aaaa";
   }*/


    /*@Override
   public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }
    */


    public Person() {
    }

    public Person(String name, int ages) {
        this.name = name;
        this.ages = ages;
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
