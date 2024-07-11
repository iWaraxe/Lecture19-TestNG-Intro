package com.coherentsolutions.java.webauto.section04.advanced;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class Ex06CustomReporter implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        // Custom report generation logic
        System.out.println("Generating Custom Report");
    }
}
