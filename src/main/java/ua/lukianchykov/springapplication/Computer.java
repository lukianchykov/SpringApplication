package ua.lukianchykov.springapplication;

import org.springframework.stereotype.Component;

/**
 * @author Andrey Lukianchykov
 */
@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    //IoC
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

//    @Override
//    public String toString() {
//        return "Computer{" +
//                "id=" + id +
//                ", musicPlayer=" + musicPlayer.playMusic() + "}";
//    }
}
