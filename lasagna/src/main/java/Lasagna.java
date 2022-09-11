public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int timeSpentInOven){
        return 40 - timeSpentInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return 2 * numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int timeInOven){
        return preparationTimeInMinutes(numberOfLayers) + timeInOven;
    }
}
