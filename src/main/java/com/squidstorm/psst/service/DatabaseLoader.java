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
        quoteRepository.save(new Quote("Andy Kirkpatrick",
                "One day you and everyone you know will be dust, and nothing you said or did, or bought or promised, " +
                "or saved, or downloaded, or uploaded, or typed, or Tweeted will mean anything, and that day grows " +
                "closer by the second.  Your future self, 40 years down the line, will hate you if you don’t have the " +
                "balls to live now.  On your return you will find a new job, another girlfriend/boyfriend, a bed for " +
                "the night, and all those people who said not to go will be sorry they tried to stop you, and will " +
                "wish they’d had the strength to go too."));

        quoteRepository.save(new Quote("Andre Gidé",
                "One doesn't discover new lands without consenting to lose sight, for a very long time, of the shore."));

        quoteRepository.save(new Quote("Unknown", "Dedication is what you do when no-one is watching."));

        quoteRepository.save(new Quote("George Eliot",
                "It's never too late to be who you might have been."));

        quoteRepository.save(new Quote("Unknown",
                "When they say you can't.  Then you have to."));

        quoteRepository.save(new Quote("Muhammad Ali",
                "Don't quit.  Suffer now and life the rest of your life as a champion."));

        quoteRepository.save(new Quote("Unknown",
                "Today I will do what others won't.  So tomorrow I can do what others can't"));

        quoteRepository.save(new Quote("Bruce Lee",
                "Do not pray for an easy life, pray for the stength to endure a difficult one."));

        quoteRepository.save(new Quote("Bertrand Russell",
                "The whole problem with the world is that fools and fanatics are always so certain of themselves and " +
                "wiser people so full of doubts."));

        quoteRepository.save(new Quote("Oscar Wilde",
                "A cynic is a man who knows the price of everything, and the value of nothing."));

        quoteRepository.save(new Quote("Bruce Lee",
                "Knowing is not enough we must apply.  Willing is not enough we must do."));

        quoteRepository.save(new Quote("Winston Churchill",
                "Attitude is a little thing that makes a big difference."));

        quoteRepository.save(new Quote("Unknown",
                "Think training's hard?  Try losing."));

        quoteRepository.save(new Quote("Benajamin Mays",
                "The tragedy of life doesn't lie in not reaching your goal.  The tragedy lies in having no goal to reach"));

        quoteRepository.save(new Quote("Mark Twain",
                "In twenty years, you will be more disappointed by what you didn't do than by what you did."));

        quoteRepository.save(new Quote("Soren Kierkegaard",
                "Life can only be understood backwards; but it must be lived forwards."));

        quoteRepository.save(new Quote("Leonard Bernstein",
                "To achieve great things, two things are needed; a plan, and not quite enough time."));

        quoteRepository.save(new Quote("Thomas Edison",
                "Opportunity is missed by most people because it is dressed in overalls and looks like work."));

        quoteRepository.save(new Quote("Ibsen",
                "There is always a certain risk in being alive, and if you are more alive, there is more risk."));

        quoteRepository.save(new Quote("Albert Einstein",
                "Everything should be made as simple as possible, but not simpler."));
    }
}
