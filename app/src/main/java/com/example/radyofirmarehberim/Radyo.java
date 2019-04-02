package com.example.radyofirmarehberim;

import java.util.ArrayList;

public class Radyo {

    private String radyoName;
    private int imageID;
    private String type;
    private boolean localNational;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLocalNational(boolean b) {
        return localNational;
    }

    public void setLocalNational(boolean localNational) {
        this.localNational = localNational;
    }

    public Radyo(String radyoName, int imageID, String type, boolean localNational) {
        this.radyoName = radyoName;
        this.imageID = imageID;
        this.type = type;
        this.localNational = localNational;
        this.radyoName = radyoName;
        this.imageID = imageID;
    }


    public Radyo() {}

    public String getRadyoName() {
        return radyoName;
    }

    public void setRadyoName(String radyoName) {
        this.radyoName = radyoName;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static ArrayList<Radyo> getData(){
        ArrayList<Radyo> radyoArrayList = new ArrayList<>();
        int radyoImages[] = {R.drawable.show,R.drawable.kralpop,R.drawable.power};
        String[] radyoNames = {"Show Radyo","Kral Pop","Power Türk"};
        String[] radyoTypes = {"Pop","Pop","Rock"};
        boolean[] radyoIsLocalNational ={true,true,false};

        for (int i = 0; i< radyoImages.length; i++){
            Radyo temp = new Radyo();
            temp.setImageID(radyoImages[i]);
            temp.setRadyoName(radyoNames[i]);
            temp.setType(radyoTypes[i]);
            temp.isLocalNational(radyoIsLocalNational[i]);

            radyoArrayList.add(temp);
        }
        return radyoArrayList;
    }
}
