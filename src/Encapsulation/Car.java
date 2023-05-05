//package Encapsulation;
//
//public class Car {
//    private String make;  // since these are all private, we make the public getter methods at the bottom to get these private items
//    private String model;
//    private int year;
//
//    Car(String make, String model, int year) {
//        this.setMake(make);
//        this.setModel(model);  // for setters
//        this.setYear(year);
//    }
//    Car(Car x) { // Calls upon copy function at bottom to put it in effect as soon as new car is created
//        this.copy(x);
//    }
//
//    public String getMake() {  //
//        return make;
//    }
//
//    public String getModel() {  // Getter methods
//        return model;
//    }
//
//    public int getYear() {
//        return year;
//    }                           //
//
//    public void setMake(String make) {  //
//        this.make = make;
//    }
//
//    public void setModel(String model) {  // Setter methods
//        this.model = model;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }                                   //
//
///////////////////////////////////////// COPYING OBJECTS////////////////////////////////////////////////////////////////
//    public void copy(Car x) {
//        this.setMake(x.getMake());
//        this.setModel(x.getModel());
//        this.setYear(x.getYear());
//    }
//
//}
