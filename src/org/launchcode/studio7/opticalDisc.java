package org.launchcode.studio7;


import java.util.HashMap;
import java.util.Map;

public interface opticalDisc {

    static final Map<String,Integer> CAPACITIES=new HashMap<>(){{
       put("CD",700);
       put("DVD",17000);

    }};
    static final Map<String,Integer> SPEED=new HashMap<>(){{
        put("CD",400);
        put("DVD",1200);

    }};
   public void spinDisc();
    public  void readData();
    public  void WriteData(File file);
    public void runFile(File file);

}
