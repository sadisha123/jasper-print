import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.util.HashMap;

public class HelloJasperDemo {

    public static void main(String[] args) throws JRException {
        JasperDesign jasperDesign = JRXmlLoader.load(HelloJasperDemo.class.getResourceAsStream("/report/hello-jasper.jrxml"));
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), new JREmptyDataSource(5));
        JasperViewer.viewReport(jasperPrint);
    }
}
