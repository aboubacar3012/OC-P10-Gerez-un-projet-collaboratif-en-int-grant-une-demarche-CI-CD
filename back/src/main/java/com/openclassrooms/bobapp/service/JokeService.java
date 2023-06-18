package com.openclassrooms.bobapp.service;

import com.openclassrooms.bobapp.data.JsonReader;
import com.openclassrooms.bobapp.model.Joke;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class JokeService {

    private final JsonReader jsonReader;

    JokeService(JsonReader jsonReader) {
        this.jsonReader = jsonReader;
    }


    public Joke getRandomJoke() {
        List<Joke> jokes = this.jsonReader.getJokes();
        int randomIndex = ThreadLocalRandom.current().nextInt(jokes.size());
        return jokes.get(randomIndex);
    }


}
