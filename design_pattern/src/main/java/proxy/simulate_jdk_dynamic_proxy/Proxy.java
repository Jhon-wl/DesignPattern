package proxy.simulate_jdk_dynamic_proxy;

import org.apache.commons.io.FileUtils;
import proxy.simulate_jdk_dynamic_proxy.InvocationHandler;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/30
 */
public class Proxy {
    public static Object newInstance(Class infce,InvocationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String rt = "\r\n";

        String methodStr = "";
        for(Method method:infce.getMethods()){
            methodStr +="    @Override "+rt+
                    "    public void "+method.getName()+"() { "+rt+
                    "try{"+rt+
                    "Method md = "+infce.getName()+".class.getMethod(\""+method.getName()+"\");"+rt+
                    "h.invoke(this,md);"+rt+
                    "}catch(Exception e){e.printStackTrace();}"+rt+
                    "    } ";
        }

        String str =
        "package proxy.simulate_jdk_dynamic_proxy;"+rt+
        "import java.lang.reflect.Method;"+rt+
        "import proxy.simulate_jdk_dynamic_proxy.InvocationHandler;"+rt+
        "public class $Proxy0 implements "+infce.getName()+" {"+rt+


        "private InvocationHandler h;"+rt+

        "    public $Proxy0(InvocationHandler h) { "+rt+

         "       this.h = h; "+rt+
        "   } "+rt+
                methodStr +rt+
        " } ";

        //产生代理类的Java文件
        String filename = System.getProperty("user.dir")+"/src/main/java/proxy/simulate_jdk_dynamic_proxy/$Proxy0.java";
        File file = new File(filename);
        FileUtils.write(file,str);
        //获得当前的编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //文件管理者
        StandardJavaFileManager fileManager = compiler.getStandardFileManager
                (null,null,null);
        //获得文件
        Iterable units = fileManager.getJavaFileObjects(filename);
        //编译任务
        JavaCompiler.CompilationTask task = compiler.getTask
                (null,fileManager,null,null,null,units);
        //进行编译
        task.call();

        fileManager.close();

        //load到内存
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class clazz = loader.loadClass("proxy.simulate_jdk_dynamic_proxy.$Proxy0");

        Constructor constructor = clazz.getConstructor(InvocationHandler.class);
        return constructor.newInstance(h);
    }
}
