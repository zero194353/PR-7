public abstract class Furniture {
    public abstract String toString();
}

class Chair extends Furniture{
    public String toString(){
        return "В корзину добавлен стул.";
    }
}

class Bed extends Furniture{
    public String toString(){
        return "В корзину добавлена кровать.";
    }
}

class Table extends Furniture{
    public String toString(){
        return "В корзину добавлен стол.";
    }
}
