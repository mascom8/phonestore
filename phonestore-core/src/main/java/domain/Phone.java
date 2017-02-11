package domain;

import sun.rmi.runtime.Log;

import java.util.List;

public class Phone {
    private Long id;
    private String model;
    private String tradeMark;
    private PhoneType phoneType;
    private List<Feature> features;
}
