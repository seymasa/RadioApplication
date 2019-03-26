package com.example.radyofirmarehberim;

import java.util.ArrayList;

public class Radyo {

    private String radyoName;
    private int imageID;

    public Radyo() {
        this.radyoName = radyoName;
        this.imageID = imageID;
    }


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

        for (int i = 0; i< radyoImages.length; i++){
            Radyo temp = new Radyo();
            temp.setImageID(radyoImages[i]);
            temp.setRadyoName(radyoNames[i]);
            radyoArrayList.add(temp);
        }
        return radyoArrayList;
    }
}
