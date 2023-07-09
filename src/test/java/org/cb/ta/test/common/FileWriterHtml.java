package org.cb.ta.test.common;

import org.testng.ITestResult;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHtml {

    FileWriter writer;

    public FileWriterHtml(String path) throws IOException {

        writer=new FileWriter(path,false);
    }

    public void onStart(ITestResult result, int nmbrTest){
          if(nmbrTest==1){
            try {
                writer.write("<!DOCTYPE html>\n" +
                        "<html lang=\"en-US\">\n" +
                        "<head > \n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>TestReport</title> \n" +
                        "\t<style>\n" +
                        "\tbody{\n" +
                        "\tbackground-color: white;\n" +
                        "\tbackground-repeat: no-repeat;\n" +
                        "\tbackground-attachment: fixed;\n" +
                        "\tbackground-size: cover;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\th1,h2,h3,h4 {\n" +
                        "\tcolor: black;\n" +
                        "\ttext-align:left;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\t\n" +
                        "\t</style>\n" +
                        "</head>\n" +
                        "<body>");
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }
        }
        try {
            writer.write("<h2>"+nmbrTest+". "+result.getName() +" Test case started: </h2>\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public void passed(){
        try {
            writer.write("<h2 style=\"color:green\";>PASSED</h2>\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
    public void failed(){
        try {
            writer.write("<h2 style=\"color:red\";>FAILED</h2>\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public void skipped(){
        try {
            writer.write("<h2 style=\"color:yellow\";>SKIPPED</h2>\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
    public void closed(int nmbrTest, int nmbrPassed, int nmbrFailed,int nmbrSkipped){
        try {
            writer.write("<h2 style=\" color:blue\";>Total test run: "+nmbrTest+" Passes: "+nmbrPassed+" Failure: "+nmbrFailed+" Skips: "+nmbrSkipped+"</h2>\n</body>\n</html>");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
