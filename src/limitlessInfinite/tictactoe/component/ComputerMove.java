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

import java.util.Random;

public class ComputerMove {
    public void make(GameTable gameTable) {
        while (true) {
            Random random = new Random();
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable.isEmpty(new Cell(row, col))) {
                gameTable.setSign(new Cell(row, col), '0');
                break;
            }

        }
    }
}
