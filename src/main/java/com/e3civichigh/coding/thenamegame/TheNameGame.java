package com.e3civichigh.coding.thenamegame;

public class TheNameGame {
    public static void main(String[] args) {
        String name = "Patrick"; // TODO 1 Change this to your name

        TheNameGame game = new TheNameGame();
        String song = game.createSong(name);
        System.out.println(song);
    }

    @SuppressWarnings("WeakerAccess")
    public String createSong(String name) {
        // TODO 2 Create the name game song from the parameter name
        String Sep= (", ");
        String nameEnd = (name.substring(1));
        String song = name+Sep+name+Sep+"bo-b"+nameEnd+"\n";
        song = song+"Banana-fana fo-f"+nameEnd+"\n";
        song = song+"Fee-fi-mo-m"+nameEnd+"\n"+name+"!\n";
        return song;
    }
}
