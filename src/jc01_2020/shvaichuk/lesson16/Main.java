package jc01_2020.shvaichuk.lesson16;

/*
*
* Написать игру крестики нолики, где два игрока-потока играют друг с другом
* Ходят по очереди.
* Вывести в консоль результат партии и итоговое игровое поле
*
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Vitaly");
        Player player2 = new Player("Valery");

        Game game = new Game(player1, player2);
        game.start();


        //ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        /*service.execute(player1);
        service.execute(player2);*/
       //⊠⊡⊙
    }

}
