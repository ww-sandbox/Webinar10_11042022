package oop.Animals;

public abstract class Animal {
    private String name;
    protected String color;
    //zmień modyfikator dostępu na private i sprawdź efekty w klasach dziedziczących
    //zmień modyfikator na domyślny i sprawdź klasę 'Fish'

    public Animal(){
        System.out.println("Konstruktor zwierzęcia");
    }

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
//        name = "abcd";
//        możemy nadpisać wartość argumentu ale jest to NIEZALECANE, jeśli użyjemy słówka final przed String name
//        nie bedzie możliwości nadpisania tego pola
        String correctName = this.validateName(name);
//        Wewnątrz tej klasy możemy skorzystać z metody oznaczonej jako prywatna (private)
        this.name = correctName;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Zwierzę | nazwa=" + name;
    }

    public void printInfo(){
        System.out.println("Cześć nazywam się " + name + "\nMój głos:");
        useVoice();
    }

    public abstract void useVoice();
    public abstract void move();

    private String validateName(String name){
        System.out.println("W tym miejscu sprawdzałbym imie");
        return name;
    }
//    Metoda private, nie będzie możliwości korzystania z niej poza klasą Animal - nawet w klasach pochodnych
}
