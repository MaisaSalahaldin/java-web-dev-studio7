package org.launchcode.studio7;

import java.util.ArrayList;

public  abstract class BaseDisc implements opticalDisc{
private final String title;
    private final String author;

    private final String discType;

    private ArrayList <File> files=new ArrayList<>();
    public BaseDisc(String title,String author,String discType ){
        this.title=title;
        this.author=author;
        this.discType=discType;
//        this.speed=SPEED.get(discType);
//        this.capacity=CAPACITIES.get(discType);

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDiscType() {
        return discType;
    }



    public ArrayList<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "\n"+discType+":"+
                "\nTitle='" + title +
                "\nAuthor='" + author +
                "\nSpeed=" + SPEED.get(discType) +
                "\ncapacity=" + CAPACITIES.get(discType) ;

    }
    public int getSpaceUsed(){
        int totel=0;for(File file:files){
            totel+=file.getSize();
        }
        return totel;
    }
@Override
    public void spinDisc(){
System.out.println("The "+discType+" "+title+" is spaining at "+CAPACITIES.get(discType));
    }
    @Override
    public abstract Void readData();
    public abstract void runFile(File file);
    @Override
    public void WriteData(File file){
if(getSpaceUsed() + file.getSize() >CAPACITIES.get(discType)){
    System.out.println("There is no enough space on disc");
}
else
    files.add(file);
    }
}
