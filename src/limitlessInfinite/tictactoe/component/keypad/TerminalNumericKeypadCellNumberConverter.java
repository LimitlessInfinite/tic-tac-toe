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

package limitlessInfinite.tictactoe.component.keypad;

import limitlessInfinite.tictactoe.component.CellNumberConverter;
import limitlessInfinite.tictactoe.model.Cell;

public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {
    @Override
    public Cell toCell(char number) {
        final int value = number - '0' - 1;
        return new Cell(value / 3, value % 3);
    }

    @Override
    public char toNumber(Cell cell) {
        return (char) ('0' + (cell.getRow() * 3 + cell.getCol() + 1));
    }
}
