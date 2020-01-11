/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: freemark_learn
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/1/11 1.0          guchaolong          Creation File
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Test1DataModel {

    private static Map getDataModel(){
        Map root = new HashMap();
        root.put("key1", "张三");

        List<String> animals = new ArrayList<String>();
        animals.add("老虎");
        animals.add("狮子");
        animals.add("大象");
        root.put("animals", animals);

        String[] arrays = {"aa", "bb"};
        root.put("arrays",arrays);

        Map map2 = new HashMap();
        map2.put("key2", "value2");
        map2.put("key3", "value3");
        root.put("maps", map2);

        Person person = new Person("王五",29);
        root.put("person", person);

        root.put("key4", null);

        root.put("key5", "value5");

        root.put("key6", "qwertyui");
        root.put("key7", "helloWord!");

        return root;
    }
    public static void main(String[] args) throws Exception{
        Map root = getDataModel();
        FreeMarkUtils.write(root);
    }
}