package ua.lukianchykov.springapplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Lukianchykov
 */
@Component
public class ClassicalMusic implements Music {

    private List<String> classicalMusicList = new ArrayList<>();

    public ClassicalMusic(List<String> classicalMusicList) {
        classicalMusicList.add("Hungarian Rhapsody");
        classicalMusicList.add("Symphony no. 5 in C Minor, op. 67");
        classicalMusicList.add("Night on Bald Mountain");
        this.classicalMusicList = classicalMusicList;
    }

    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
