package tddClass;


public class Baby {
    private String name;
    private int age;
    private double weightInKg;

    public Baby(String name, double weightInKg, int newAge){
        this.name = name;
        this.weightInKg = weightInKg;
        age = newAge;
    }

    public Baby(){

    }
    public String getName(){
        return name;
    }
}
