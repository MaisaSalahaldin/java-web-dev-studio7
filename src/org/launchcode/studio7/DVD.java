package org.launchcode.studio7;

public class DVD extends BaseDisc {


private String data;

    public DVD(String title, String author, String discType) {
        super(title, author, discType);
    }

    @Override
    public Void readData() {
        return null;
    }
    public String toString(){
        return super.toString()
               ;
    }


    @Override
    public void runFile(File file) {

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
