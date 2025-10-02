package com.example.colorpicker;

import androidx.lifecycle.MutableLiveData;

import java.util.LinkedList;

public class ColorViewModel {
    private MutableLiveData<LinkedList<String>> colorsLL;

    public ColorViewModel() {
        this.colorsLL = new MutableLiveData<>();
    }

    public ColorViewModel(MutableLiveData<LinkedList<String>> colorsLL) {
        this.colorsLL = colorsLL;
    }

    public void setColors(LinkedList<String> l) {
        colorsLL.setValue(l);
    }

    public LinkedList<String> getColors(){
        return colorsLL.getValue();
    }

    public void addColor(String c){
        LinkedList<String> l = getColors();
        l.add(c);

        colorsLL.setValue(l);
    }

}
