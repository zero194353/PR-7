public abstract class Dog {
    String fur;
    String size;

    String getFur(){
        return fur;
    }
    String getSize(){
        return size;
    }
    void setFur(String fur){
        this.fur = fur;
    }
    void setSize(String s){
        size = s;
    }

    public abstract String toString();
}

class Beagle extends Dog{
    Beagle(){
         size = "Средняя";
         fur = "Короткошёрстная";
    }

    @Override
    public String toString() {
        return "Beagle";
    }
}

class Shepherd extends Dog{
    Shepherd(){
        size = "Большая";
        fur = "Короткошёрстная";
    }
    @Override
    public String toString() {
        return "Shepherd";
    }
}

class CockerSpaniel extends Dog{
    CockerSpaniel(){
        size = "Средняя";
        fur = "Длинношёрстная";
    }
    @Override
    public String toString() {
        return "Cocker Spaniel";
    }
}
