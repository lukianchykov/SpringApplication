package ua.lukianchykov.springapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Andrey Lukianchykov
 */
@Component
public class MusicPlayer {
    //private List<Music> musicList = new ArrayList<>();
    private ClassicalMusic classicalMusicList;
    private RockMusic rockMusicList;
    private RapMusic rapMusicList;

    //IoC
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusicList, RockMusic rockMusicList, RapMusic rapMusicList) {
        this.classicalMusicList = classicalMusicList;
        this.rockMusicList = rockMusicList;
        this.rapMusicList = rapMusicList;
    }


//    @Autowired
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public void playMusic(MusicGenre mGenre) {
        Random random = new Random();
        int randNumber = random.nextInt(3);
        if (mGenre == MusicGenre.CLASSICAL) {
            System.out.println("Playing: " + classicalMusicList.getSongs().get(randNumber));
        } else if (mGenre == MusicGenre.ROCK) {
            System.out.println("Playing: " + rockMusicList.getSongs().get(randNumber));
        } else {
            System.out.println("Playing: " + rapMusicList.getSongs().get(randNumber));
        }
    }

}
