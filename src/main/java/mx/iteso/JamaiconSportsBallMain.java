package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball billiard = new BilliardBall();
        Ball basket =  new BaseballBall();
        Ball volley = new VolleyBall();
        Ball tennis = new TennisBall();
        Ball poke = new PokeBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performCapture());
        System.out.println(soccer.performRelease());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performCapture());
        System.out.println(american.performRelease());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performCapture());
        System.out.println(base.performRelease());

        System.out.println();

        System.out.println(billiard.roll());
        System.out.println(billiard.performBounce());
        System.out.println(billiard.performDeflate());
        System.out.println(billiard.performInflate());
        System.out.println(billiard.performCapture());
        System.out.println(billiard.performRelease());

        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.performCapture());
        System.out.println(basket.performRelease());

        System.out.println();

        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performCapture());
        System.out.println(volley.performRelease());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.performCapture());
        System.out.println(tennis.performRelease());

        System.out.println();

        System.out.println(poke.roll());
        System.out.println(poke.performBounce());
        System.out.println(poke.performDeflate());
        System.out.println(poke.performInflate());
        System.out.println(poke.performCapture());
        System.out.println(poke.performRelease());

    }
}
