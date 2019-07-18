package com.company.U1M3SummativeMacmanusSabrina;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController  //receives a request from the user
public class Controller {
    private List<Quote> quoteList;
    private List<Word> wordList;
    private List<Magic> magicList;
    private String question;

    public Controller(){
        quoteList = new ArrayList<>();
        wordList = new ArrayList<>();
        magicList = new ArrayList<>();

        quoteList.add(new Quote("'It's just a flesh wound.'", "Black Knight"));
        quoteList.add(new Quote("'I am serious. And don't call me Shirley.'", "Dr. Rumack"));
        quoteList.add(new Quote("'I'm about to do to you what Limp Bizkit did to music in the late 90's.'", "Deadpool"));
        quoteList.add(new Quote("'I'm in a glass case of emotion!'", "Ron Burgundy"));
        quoteList.add(new Quote("'I am Groot.'", "Groot"));
        quoteList.add(new Quote("'Just keep swimming.'", "Dory"));
        quoteList.add(new Quote("'Honey? Where's my super suit?", "Frozone"));
        quoteList.add(new Quote("'What is this? A center for ants?", "Derek Zoolander"));
        quoteList.add(new Quote("'You shall not pass!'", "Gandalf the Grey"));
        quoteList.add(new Quote("'You sit on a throne of lies!'", "Buddy the Elf"));
        quoteList.add(new Quote("'Come out to the coast, we'll get together, have a few laughs...'", "John McClane"));

        wordList.add(new Word("Allegator", "one who alleges"));
        wordList.add(new Word("Brouhaha", "an uproar"));
        wordList.add(new Word("Cockalorum", "a small, haughty man"));
        wordList.add(new Word("Codswallop", "nonsense, balderdash"));
        wordList.add(new Word("Eructation", "a belch"));
        wordList.add(new Word("Formication", "a sensation like insects crawling over the skin"));
        wordList.add(new Word("Hootenanny", "an informal gathering with folk music and sometimes dancing"));
        wordList.add(new Word("Logorrhea", "a tendency to extreme loquacity"));
        wordList.add(new Word("Mumpsimus", "a person who obstinately adheres to unreasonable customs or notions"));
        wordList.add(new Word("Dollop", "a shapeless mass or blob of something"));
        wordList.add(new Word("Blatherskite", "a person who blathers a lot"));

        magicList.add(new Magic( "As I see it, yes."));
        magicList.add(new Magic("Better not tell you now."));
        magicList.add(new Magic("Without a doubt."));
        magicList.add(new Magic("Don't count on it."));
        magicList.add(new Magic("You may rely on it."));
        magicList.add(new Magic("Signs point to yes."));
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote fetchQuote(){
        int size = quoteList.size();
        Random rand = new Random();
        int randomIndex = rand.nextInt(size);
        return this.quoteList.get(randomIndex);
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Word fetchWord(){
        int size = wordList.size();
        Random rand = new Random();
        int randomIndex = rand.nextInt(size);
        return this.wordList.get(randomIndex);
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic addQuestion(@RequestBody String question){
        Random rand = new Random();
        int randomIndex = rand.nextInt(magicList.size());
            this.magicList.get(randomIndex).getAnswer();
            this.magicList.get(randomIndex).setQuestion(question);
            return this.magicList.get(randomIndex);

        //set newQuestion to getAnswer from above
        //this.magicList.get(randomIndex).setQuestion(newQuestion);

    }

}
