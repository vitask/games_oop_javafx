package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenMethodPosition() {
        BishopBlack figure = new BishopBlack(Cell.A1);
        assertThat(figure.position(), is(Cell.A1));
    }

    @Test
    public void whenMethodCopy() {
        BishopBlack figure = new BishopBlack(Cell.A1);
        assertThat(figure.copy(Cell.A1).position(), is(Cell.A1));
    }

    @Test
    public void whenMethodWay() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        Cell[] way = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(figure.way(Cell.G5), is(way));
    }

    @Test
    public void whenIsDiagonal() {
        boolean res = BishopBlack.isDiagonal(Cell.A1, Cell.H8);
        Assert.assertTrue(res);
    }

    @Test
    public void whenNotIsDiagonal() {
        boolean res = BishopBlack.isDiagonal(Cell.C1, Cell.C8);
        Assert.assertFalse(res);
    }
}