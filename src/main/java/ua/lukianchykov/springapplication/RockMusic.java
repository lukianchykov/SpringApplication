package ua.lukianchykov.springapplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Lukianchykov
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Avengers Sevenfold: Almost Easy";
    }

//    private List<String> rockMusicList = new ArrayList<>();
//
//    public RockMusic(List<String> rockMusicList) {
//        rockMusicList.add("Avengers Sevenfold: Almost Easy");
//        rockMusicList.add("Empty Mirrors: Everyone Love a Villain");
//        rockMusicList.add("Eisbrecher: Frommer Mann");
//        this.rockMusicList = rockMusicList;
//    }
//
//    @Override
//    public List<String> getSongs() {
//        return rockMusicList;
//    }
}
