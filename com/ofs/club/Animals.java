package com.ofs.club;

//Navya
public class Animals {
    String name;
    double water;
    int food;
    int id;
    int weight;
    public Animals(String animalname, double waterperday, int foodPerDay, int cageID, int animalWeight)
    {
        name = animalname;
        water = waterperday;
        food = foodPerDay;
        id = cageID;
        weight = animalWeight;
    }
    public void Animaloutput()
    {
        System.out.println();
        System.out.println("The animal's name is " + this.name + ", they drink " + this.water +
                " gallons of water per day and eat " + this.food + " pounds of food per day, their cage ID is " + this.id +
                " and their weight is " + this.weight + "\n");
    }
    public static void totalwater(Animals[] array )
    {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i].water;
        }
        System.out.println("The animals in total drink " + sum + " gallons of water daily.\n");
    }
    public static void averagefood(Animals[] array)
    {
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i].food;
        }
        average = sum/array.length;
        System.out.println("The animals consume an average of " + average + " pounds of food daily. \n");
    }
    public void cageID()
    {
        System.out.println("The animal " + this.name + " is held in cage number: " + this.id + ". \n");
    }
    public static void greaterWeight(Animals a, Animals b)
    {
        if (a.weight > b.weight)
        {
            System.out.println("The heavier animal is " + a.name + " with the weight of " + a.weight + "\n");
        }
        else
        {
            System.out.println("The heavier animal is " + b.name + " with the weight of " + b.weight + "\n");
        }
    }
    // Extension Problems
    public static void mostFood(Animals[] array)
    {
        int maxFood = array[0].food;
        int maxAnimal = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (maxFood < array[i].food)
            {
                maxFood = array[i].food;
                maxAnimal = i;
            }
        }
        System.out.println("The animal that eats the most food per day is " + array[maxAnimal].name + "\n");
    }
    public static void mostFoodPerWeight(Animals[] array)
    {
        int maxAverage = (array[0].food)/(array[0].weight);
        int maxAnimal = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (maxAverage < (array[i].food)/(array[i].weight))
            {
                maxAverage = (array[i].food)/(array[i].weight);
                maxAnimal = i;
            }
        }
        System.out.println("The animal that eats the most food per day per unit weight is " + array[maxAnimal].name + "\n");
    }
    // main method: instantiates/initializes the objects(Animals) and calls the methods
    // no processing done in the main method to get clean code
    public static void main (String[] args) {
        Animals tiger = new Animals("Tiger", 20.0, 25, 122, 220);
        Animals zebra = new Animals("Zebra", 3.6, 20, 97, 400);
        Animals giraffe = new Animals("Giraffe", 10.0, 75, 765, 1930);
        Animals rhino = new Animals("Rhino", 0.5, 120, 3, 2300);
        Animals[] array = {tiger, zebra, giraffe, rhino};
        tiger.Animaloutput();
        totalwater(array);
        averagefood(array);
        giraffe.cageID();
        greaterWeight(zebra, giraffe);
        mostFood(array);
        mostFoodPerWeight(array);
    }
}
 