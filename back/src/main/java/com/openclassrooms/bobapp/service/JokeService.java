package com.openclassrooms.bobapp.service;

import com.openclassrooms.bobapp.data.JsonReader;
import com.openclassrooms.bobapp.model.Joke;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;


@Service
public class JokeService {

    private final JsonReader jsonReader;

    JokeService(JsonReader jsonReader) {
        this.jsonReader = jsonReader;
    }


    public Joke getRandomJoke() {
        List<Joke> jokes = this.jsonReader.getJokes();
        SecureRandom random = new SecureRandom();
        int randomIndex = random.nextInt(jokes.size());
        return jokes.get(randomIndex);
    }


}
