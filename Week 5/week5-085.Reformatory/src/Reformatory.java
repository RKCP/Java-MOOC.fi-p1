public class Reformatory {
    
    private int weightsMeasured;

    public int weight(Person person) {
        this.weightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.weightsMeasured;
        
    }
    
    

}
