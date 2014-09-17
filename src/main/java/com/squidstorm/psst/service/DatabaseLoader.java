package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseLoader
{
    private final QuoteRepository quoteRepository;

    @Autowired
    public DatabaseLoader(QuoteRepository quoteRepository)
    {
        this.quoteRepository = quoteRepository;
    }

    @PostConstruct
    void init()
    {
        save(new Quote("Andy Kirkpatrick",
                "One day you and everyone you know will be dust, and nothing you said or did, or bought or promised, " +
                "or saved, or downloaded, or uploaded, or typed, or Tweeted will mean anything, and that day grows " +
                "closer by the second.  Your future self, 40 years down the line, will hate you if you don’t have the " +
                "balls to live now.  On your return you will find a new job, another girlfriend/boyfriend, a bed for " +
                "the night, and all those people who said not to go will be sorry they tried to stop you, and will " +
                "wish they’d had the strength to go too."));

        save(new Quote("Andre Gidé",
                "One doesn't discover new lands without consenting to lose sight, for a very long time, of the shore."));

        save(new Quote("Unknown", "Dedication is what you do when no-one is watching."));

        save(new Quote("George Eliot",
                "It's never too late to be who you might have been."));

        save(new Quote("Unknown",
                "When they say you can't.  Then you have to."));

        save(new Quote("Muhammad Ali",
                "Don't quit.  Suffer now and life the rest of your life as a champion."));

        save(new Quote("Unknown",
                "Today I will do what others won't.  So tomorrow I can do what others can't"));

        save(new Quote("Bruce Lee",
                "Do not pray for an easy life, pray for the stength to endure a difficult one."));

        save(new Quote("Bertrand Russell",
                "The whole problem with the world is that fools and fanatics are always so certain of themselves and " +
                "wiser people so full of doubts."));

        save(new Quote("Oscar Wilde",
                "A cynic is a man who knows the price of everything, and the value of nothing."));

        save(new Quote("Bruce Lee",
                "Knowing is not enough we must apply.  Willing is not enough we must do."));

        save(new Quote("Winston Churchill",
                "Attitude is a little thing that makes a big difference."));

        save(new Quote("Unknown",
                "Think training's hard?  Try losing."));

        save(new Quote("Benjamin Mays",
                "The tragedy of life doesn't lie in not reaching your goal.  The tragedy lies in having no goal to reach"));

        save(new Quote("Mark Twain",
                "In twenty years, you will be more disappointed by what you didn't do than by what you did."));

        save(new Quote("Soren Kierkegaard",
                "Life can only be understood backwards; but it must be lived forwards."));

        save(new Quote("Leonard Bernstein",
                "To achieve great things, two things are needed; a plan, and not quite enough time."));

        save(new Quote("Thomas Edison",
                "Opportunity is missed by most people because it is dressed in overalls and looks like work."));

        quoteRepository.save(new Quote("Ibsen",
                "There is always a certain risk in being alive, and if you are more alive, there is more risk."));

        quoteRepository.save(new Quote("Albert Einstein",
                "Everything should be made as simple as possible, but not simpler."));
    }

    private void save(Quote quote) {
        quoteRepository.saveQuote(quote);
    }
}
