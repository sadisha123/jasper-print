import model.Customer;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportWithBeanDataSource {

    public static void main(String[] args) throws JRException {
        JasperDesign jasperDesign = JRXmlLoader.load(ReportWithBeanDataSource.class.getResourceAsStream("/report/report-with-bean-ds.jrxml"));
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Sadisha","Tangalle"));
        customerList.add(new Customer(2,"Eranga","Kottawa"));
        customerList.add(new Customer(3,"Jayani","Athurugiriya"));


        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), new JRBeanCollectionDataSource(customerList));
        JasperViewer.viewReport(jasperPrint);
    }
}
