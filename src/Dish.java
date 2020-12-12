public abstract class Dish {
    double capacity;
    String [] TypeOfCook;

    double getCapacity(){
        return capacity;
    }
    void setCapacity(double c){
        capacity = c;
    }

    String getTypeOfCook(int NumberOfMeal){ return TypeOfCook[NumberOfMeal]; }
    abstract  void cook();
}

class Plate extends Dish{
    void cook(){
        TypeOfCook = new String[]{"мясо", "салат", "суши", "пицца"};
    }
}

class Cup extends Dish{
    void cook(){
        TypeOfCook = new String[]{"сок", "кофе", "вода", "чай"};
    }
}

class Bowl extends Dish{
    void cook(){
        TypeOfCook = new String[]{"суп", "каша", "рагу"};
    }
}
