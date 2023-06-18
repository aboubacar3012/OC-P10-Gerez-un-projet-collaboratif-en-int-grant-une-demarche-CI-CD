import com.openclassrooms.bobapp.data.JsonReader;
import com.openclassrooms.bobapp.model.Joke;
import com.openclassrooms.bobapp.service.JokeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

public class JokeServiceTest {

    private JokeService jokeService;
    private JsonReader jsonReader;

    @BeforeEach
    public void setup() {
        jsonReader = Mockito.mock(JsonReader.class);
        jokeService = new JokeService(jsonReader);
    }

    @Test
    public void testGetRandomJoke() {
        List<Joke> jokes = new ArrayList<>();
        jokes.add(new Joke("Why don't scientists trust atoms?", "Because they make up everything!"));
        jokes.add(new Joke("Did you hear about the mathematician who's afraid of negative numbers?", "He'll stop at nothing to avoid them!"));
        jokes.add(new Joke("Why don’t some couples go to the gym?", "Because some relationships don't work out!"));

        // Mock the behavior of jsonReader to return the list of jokes
        Mockito.when(jsonReader.getJokes()).thenReturn(jokes);

        Joke randomJoke = jokeService.getRandomJoke();

        // Verify that the generated joke is not null
        Assertions.assertNotNull(randomJoke);

        // Verify that the generated joke is present in the list of jokes
        Assertions.assertTrue(jokes.contains(randomJoke));
    }
}
