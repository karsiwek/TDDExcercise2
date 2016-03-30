package pl.karolsiwek.minesweeper;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.fail;

/*
pair programming task!
one person should write one failing test which should be satisfied by other person.
after this both think about refactoring
 */
public class MineSweeperTest {

    @Test
    public void markMines_shouldThrowAnException_whenNullArgProvided() {
        //TODO
    }

    @Test
    public void markMines_shouldThrowAnException_whenEmptyListProvided() {
        //TODO
    }

    @Test
    public void markMines_shouldNotChangeField_whenOnlyMinesOnTheField() {
        //TODO
    }

    @Test
    public void markMines_shouldPutZerosOnEveryPlace_whenOnlyEmptyPlacesOnTheField() {
        //TODO
    }

    //make some more:



    @Test
    public void markMines_shouldMarkAllMines_onHappyPath() {
        MineSweeper game = new MineSweeper();
        List<List<Character>> result = game.markMines(Lists.<List<Character>>newArrayList(
                Lists.newArrayList('.', '.', '.', '*', '.'),
                Lists.newArrayList('.', '*', '*', '*', '*'),
                Lists.newArrayList('*', '.', '*', '.', '*'),
                Lists.newArrayList('.', '.', '*', '*', '*'),
                Lists.newArrayList('.', '.', '.', '*', '.')
        ));

        List<List<Character>> expected = Lists.<List<Character>>newArrayList(
                Lists.newArrayList('1', '2', '4', '*', '3'),
                Lists.newArrayList('2', '*', '*', '*', '*'),
                Lists.newArrayList('*', '5', '*', '8', '*'),
                Lists.newArrayList('1', '3', '*', '*', '*'),
                Lists.newArrayList('0', '1', '3', '*', '3')
        );

        if(!Iterables.elementsEqual(result, expected)){
            fail("failed");
        }
    }
}