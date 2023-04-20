package org.launchcode.studio7;

public class CD extends BaseDisc {

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private final String gener;
    private final String productionCo;
    public CD(String titel, String author, String discType,String gener,String productionCo) {

        super(titel, author, discType);
        this.gener=gener;
        this.productionCo=productionCo;
    }

    // TODO: Implement your custom interface.
  public String toString(){
        return super.toString()+
                " \nGener: "+gener+
                "\n Production Company: "+productionCo;
  }

    @Override
    public Void readData() {
        System.out.println(this);
    }

    @Override
    public void runFile(File file) {
        System.out.println(this);

    }

//    @Override
//    public void WriteData(File file) {
//
//    }




}
