package com.example.colorpicker;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class ColorViewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> colorsLL;

    public ColorViewModel() {
        this.colorsLL = new MutableLiveData<>();
        LinkedList<String> l = new LinkedList<>();
        colorsLL.setValue(l);
    }

    public void setColors(LinkedList<String> l) {
        colorsLL.setValue(l);
    }

    public MutableLiveData<LinkedList<String>> getColors(){
        return colorsLL;
    }

    public void addColor(String c){
        LinkedList<String> l = getColors().getValue();
        l.add(c);

        colorsLL.setValue(l);
    }

}
