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

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class FreeMarkUtils {

    public static void write(Map map) throws Exception{
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(new File("templates"));
        Template template = cfg.getTemplate("helloword.ftl");
        Writer out = new OutputStreamWriter(System.out);
        template.process(map,out);
        out.flush();
        out.close();
    }

}