package org.cb.ta.test.common;

import org.testng.ITestResult;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTxt {

    FileWriter writer;

    public FileWriterTxt(String path) throws IOException {

        writer=new FileWriter(path,false);
    }
    public void onStart(ITestResult result, int nmbrTest){
        if(nmbrTest==1){
            try {
                writer.write(result.getTestClass().getName()+"\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }
        }
        try {
            writer.write(nmbrTest+". "+result.getName() +" Test case started: ");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public void passed(){
        try {
            writer.write("PASSED\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
    public void failed(){
        try {
            writer.write("FAILED\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public void skipped(){
        try {
            writer.write("SKIPPED\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
    public void closed(int nmbrTest, int nmbrPassed, int nmbrFailed,int nmbrSkipped){
        try {
            writer.write("Total test run: "+nmbrTest+" Passes: "+nmbrPassed+" Failure: "+nmbrFailed+" Skips: "+nmbrSkipped);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
