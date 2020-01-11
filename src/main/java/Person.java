/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: freemark_learn
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/1/12 1.0          guchaolong          Creation File
 */

/**
 *
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}