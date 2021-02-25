package com.company.polymorphism;

class Movie{
    private String naem;

    public Movie(String naem) {
        this.naem = naem;
    }
    public String plot(){
        return  "No plot here";
    }

    public String getNaem() {
        return naem;
    }
}

class Jews extends  Movie{
    public Jews(){
        super("Jaws");
    }
    public  String plot(){
        return "A shark eats lots of peaple";
    }
}

class  IndependenceDay extends  Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class  MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return super.plot();
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}


class  Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
            for(int i =0 ; i<11; i++ ){
                Movie movie  = randomMovie();
                System.out.println("Movie # "+ i +
                        " : "+movie.getNaem()+ "\n"+
                        "Plot: "+ movie.plot()+"\n");
            }

    }
    public static  Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5)+1;
        System.out.println("Random number generated was "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Jews();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return  null;
    }
}
