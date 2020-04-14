package com.example.simplerecyclerview;

public class Model {
    private String text;
    private String subText;

    Model(String text, String subText){
        this.text = text;
        this.subText = subText;
    }

    Model(){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }
}
