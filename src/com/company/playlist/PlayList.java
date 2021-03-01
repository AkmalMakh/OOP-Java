package com.company.playlist;


import java.util.*;

public class PlayList {

    public static void main(String[] args) {
     List<Song>playList = new ArrayList<>();
        Album album1 = new Album("Let's get Loud", "Jennifer Lopez");
        Album album2 = new Album("Take me Home", "Jess Glynne");
        Album album3 = new Album("Are you With Me", "Lost Frequencies");
        album1.addSong("Let's Get Loud", 3.58);
        album1.addSong("Let's Get Loud-Kung Pow", 4.12);
        album1.addSong("Let's Get Loud-Castle Hill Club", 8.08);
        album1.addSong("Live Your Live", 4.12);

        album2.addSong("Take Me Home", 5.15);

        album3.addSong("Are You with Me-Radio Edi", 5.15);
        album3.addSong("Are You with Me-Extended Mix", 5.15);

        album1.addToplayList("Let's Get Loud", playList);
        album1.addToplayList("Let's Get Loud-Kung Pow", playList);
        album1.addToplayList("Let's Get Loud-Castle Hill Club", playList);
        album1.addToplayList("Live Your Live", playList);

        visit(playList);


    }
    public static void visit(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;
        boolean quit = false;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else {
            System.out.println("Now playing: "+listIterator.next().getTitle());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Music is stoped");
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now is playing: "+listIterator.next().getTitle());

                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward =false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                            goingForward = false;
                        }
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now is playing: "+listIterator.previous().getTitle());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"
                +"1 - go to next song\n"
                +"2 - go to previous song\n"
                +"3 - print menu\n");
    }
}
