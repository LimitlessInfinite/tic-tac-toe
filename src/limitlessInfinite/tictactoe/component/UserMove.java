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

import java.util.Scanner;

public class UserMove {

    public UserMove(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    private final CellNumberConverter cellNumberConverter;

    public void make(final GameTable gameTable) {
        while (true) {
            final Cell cell = getUserInput();
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else System.out.println("Can't make move, because the cell is not free!");

        }
    }

    private Cell getUserInput() {
        while (true) {
            System.out.println("Please type number between 1 and 9: ");
            final String getUserInput = new Scanner(System.in).next();
            if (getUserInput.charAt(0) >= '1' & getUserInput.charAt(0) <= '9' & getUserInput.length() == 1) {
                return cellNumberConverter.toCell(getUserInput.charAt(0));
            } else System.out.println("Please type number between 1 and 9: ");
        }
    }
}
