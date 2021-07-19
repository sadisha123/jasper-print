import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.util.HashMap;
import java.util.Map;

public class ReportWithParamsDemo {

    public static void main(String[] args) throws JRException {
        JasperDesign jasperDesign = JRXmlLoader.load(ReportWithParamsDemo.class.getResourceAsStream("/report/report-with-param.jrxml"));
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        Map<String, Object> params = new HashMap<>();
        params.put("Id",1);
        params.put("Name","Sadisha");
        params.put("Address","Tangalle");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource(1));
        JasperViewer.viewReport(jasperPrint);
    }
}
