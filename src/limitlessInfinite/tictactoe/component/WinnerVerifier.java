/*
 * # Copyright (c) 2022. LimitlessInfinite
 * #
 * # Licensed under the Apache License, Version 2.0 (the "License");
 * # you may not use this file except in compliance with the License.
 * # You may obtain a copy of the License at
 * #
 * #     http://www.apache.org/licenses/LICENSE-2.0
 * #
 * # Unless required by applicable law or agreed to in writing, software
 * # distributed under the License is distributed on an "AS IS" BASIS,
 * # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * # See the License for the specific language governing permissions and
 * # limitations under the License.
 */

package limitlessInfinite.tictactoe.component;

import limitlessInfinite.tictactoe.model.Cell;
import limitlessInfinite.tictactoe.model.GameTable;

public class WinnerVerifier {
    public boolean isUserWin(final GameTable gameTable) {
        return isWinner(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {
        return isWinner(gameTable, '0');
    }

    public boolean isWinner(final GameTable gameTable, final char sign) {
        return isWinnerByRows(gameTable, sign)
                || isWinnerByCols(gameTable, sign)
                || isWinnerByFirstDiagonal(gameTable, sign)
                || isWinnerBySecondDiagonal(gameTable, sign);
    }

    public boolean isWinnerByRows(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(i, 0)) == sign &
                    gameTable.getSign(new Cell(i, 1)) == sign &
                    gameTable.getSign(new Cell(i, 2)) == sign) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinnerByCols(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(0, i)) == sign &
                    gameTable.getSign(new Cell(1, i)) == sign &
                    gameTable.getSign(new Cell(2, i)) == sign) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinnerByFirstDiagonal(final GameTable gameTable, final char sign) {
        return gameTable.getSign(new Cell(0, 0)) == sign &
                gameTable.getSign(new Cell(1, 1)) == sign &
                gameTable.getSign(new Cell(2, 2)) == sign;
    }

    public boolean isWinnerBySecondDiagonal(final GameTable gameTable, final char sign) {
        return gameTable.getSign(new Cell(2, 0)) == sign &
                gameTable.getSign(new Cell(1, 1)) == sign &
                gameTable.getSign(new Cell(0, 2)) == sign;
    }
}
