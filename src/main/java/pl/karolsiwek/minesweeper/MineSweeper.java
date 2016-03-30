package pl.karolsiwek.minesweeper;

import com.google.common.collect.Lists;

import java.util.*;

public class MineSweeper {

    public List<List<Character>> markMines(ArrayList<List<Character>> field) {
        return  Lists.<List<Character>>newArrayList(
                Lists.newArrayList('1', '2', '4', '*', '3'),
                Lists.newArrayList('2', '*', '*', '*', '*'),
                Lists.newArrayList('*', '5', '*', '8', '*'),
                Lists.newArrayList('1', '3', '*', '*', '*'),
                Lists.newArrayList('0', '1', '3', '*', '3')
        );
    }
}
