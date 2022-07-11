package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {
    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException()
            throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.B2));
        logic.move(Cell.A1, Cell.E5);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundException()
            throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.B1));
        logic.move(Cell.B2, Cell.D4);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveThenFinish()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.H7);
    }
}