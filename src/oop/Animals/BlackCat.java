package oop.Animals;

public final class BlackCat extends Cat {
    public static final String COLOR = "black";

    public BlackCat(String name){
        super(name, COLOR);
        //spróbuj zmienić wartość pola 'COLOR'
    }

    public String getColor(){
        return COLOR;
    }

    public void setColor(){
//        COLOR = "white";
//        Nie możemy zmienić wartości pola, które jest oznaczone jako 'final'
    }

//    public void chaseMouse(){
//        System.out.println("Jestem czarnym kotem i gonię mysz");
//    }
//    Nie możemy nadpisać (overide) metody oznaczonej jako 'final'

    public static void unluck(){
        System.out.println("Przynoszę pecha");
    }
}
