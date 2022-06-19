package com.example.studentdetails;

public class ModelClass {

    private int imageview;
    private String textview1;
    private String divider;

    ModelClass(int imageview, String textview1, String divider)
    {
        this.imageview=imageview;
        this.textview1=textview1;
        this.divider=divider;

    }

    public int getImageview1() {
        return imageview;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getDivider() {
        return divider;
    }
}
