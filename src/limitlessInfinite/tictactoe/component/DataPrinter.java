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

public class DataPrinter {
    public DataPrinter(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    private final CellNumberConverter cellNumberConverter;

    public void printMappingTable() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-".repeat(13));
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + cellNumberConverter.toNumber(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-".repeat(13));
    }


    public void printGameTable(final GameTable gameTable) {

        for (int i = 0; i < 3; i++) {
            System.out.println("-".repeat(13));
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-".repeat(13));
    }
}
