import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class CricketApplication {
    public CricketApplication() {
        String configFileName = "application.yml";
        CricketConfiguration.loadConfiguration(configFileName);
    }

    public static void main(String[] args) throws LifecycleException {
        startTomcat();
    }

    private static void startTomcat() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8085);

        Context context = tomcat.addContext("/cricket", new File(".").getAbsolutePath());

//        tomcat.addServlet(context, "Cricket", new CricketServlet());
        context.addServletMappingDecoded("/*", "Cricket");

        tomcat.start();
        tomcat.getServer().await();
    }
}
