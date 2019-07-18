package com.company.Homework3;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WebServiceController {

    //Initializing Random function
    Random random = new Random();

    //Creating Quote class objects list
    List<Quote> quotesList = new ArrayList<>();

    //Creating WordofDay class objects list
    List<WordOfDay> wordList = new ArrayList<>();

    //Creating Magic8Ball class objects list
    List<Magic8Ball> magic8BallList = new ArrayList<>();


    public WebServiceController() {
        //Adding quotes and authors to list
        this.quotesList.add(new Quote("Don't cry because it's over, smile because it happened", "Dr. Seuss"));
        this.quotesList.add(new Quote("Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.", "Albert Einstein"));
        this.quotesList.add(new Quote("You've gotta dance like there's nobody watching, Love like you'll never be hurt, Sing like there's nobody listening, and live like it's heaven on earth.", "William W. Purkey"));
        this.quotesList.add(new Quote("You only live once, but if you do it right, once is enough", "Mae West"));
        this.quotesList.add(new Quote("Be the change that you wish to see in the world.", "Mahatma Gandhi"));
        this.quotesList.add(new Quote("If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.", "J.K. Rowling"));
        this.quotesList.add(new Quote("In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"));
        this.quotesList.add(new Quote("No one can make you feel inferior without your consent.", "Eleanor Roosevelt"));
        this.quotesList.add(new Quote("I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel", "Maya Angelou"));
        this.quotesList.add(new Quote("Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.", "Martin Luther King Jr."));

        //Adding words and definitions to list
        this.wordList.add(new WordOfDay("Instantiate", "To represent as or by an instance."));
        this.wordList.add(new WordOfDay("Touche", "Exclamation used as an acknowledgment during a discussion of a good or clever point made at one's expense by another person."));
        this.wordList.add(new WordOfDay("Ideogram", "A written symbol that represents an idea or object directly rather than a particular word or speech sound, as a Chinese character."));
        this.wordList.add(new WordOfDay("Cosplay", "The art or practice of wearing costumes to portray characters from fiction, especially from manga, animation, and science fiction."));
        this.wordList.add(new WordOfDay("Barmecidal", "Giving only the illusion of plenty"));
        this.wordList.add(new WordOfDay("Remora", "An obstacle, hindrance, or obstruction."));
        this.wordList.add(new WordOfDay("Raison d’être", "Reason or justification for being or existence"));
        this.wordList.add(new WordOfDay("Infare", "A party or reception for a newly married couple."));
        this.wordList.add(new WordOfDay("Federalese", "Awkward, evasive, or pretentious prose said to characterize the publications and correspondence of U.S. federal bureaus."));
        this.wordList.add(new WordOfDay("Peccable", "Liable to sin or error."));

        //Adding 8Ball responses to list
        this.magic8BallList.add(new Magic8Ball(null,"It is certain!"));
        this.magic8BallList.add(new Magic8Ball(null,"Ask again later..."));
        this.magic8BallList.add(new Magic8Ball(null,"Don't count on it."));
        this.magic8BallList.add(new Magic8Ball(null,"Without a doubt!"));
        this.magic8BallList.add(new Magic8Ball(null,"Very doubtful"));
        this.magic8BallList.add(new Magic8Ball(null,"Outlook good!"));


    }

    //Get random quote
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getRandomQuote() {
        int x = random.nextInt(quotesList.size());
        return quotesList.get(x);
    }

    //Get random word
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public WordOfDay getRandomWord() {
        int x = random.nextInt(wordList.size());
        return wordList.get(x);
    }

    //Get random 8Ball answer
    @RequestMapping(value = "/magic", method = RequestMethod.GET)
    public Magic8Ball ask8Ball(@RequestBody Magic8Ball Question) {
        int x = random.nextInt(magic8BallList.size());
        return magic8BallList.get(x) ;

    }


}
