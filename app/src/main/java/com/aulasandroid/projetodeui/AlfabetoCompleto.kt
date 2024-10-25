package com.aulasandroid.projetodeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aulasandroid.projetodeui.ui.theme.ProjetoDeUiTheme
import kotlin.random.Random

class AlfabetoCompleto : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoDeUiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                       alfabeto(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun letraA(modifier: Modifier?) {
    Column {
        Row {
            Text(text ="       *   ", color = getColor() )
        }

        Row {
            Text(text ="     *  *     ", color = getColor())
        }

        Row {
            Text(text ="    *     *      ", color = getColor())
        }

        Row {
            Text(text ="   *******      ", color = getColor())
        }

        Row {
            Text(text ="  *          *     ", color = getColor())
        }

        Row {
            Text(text ="*              * ", color = getColor())
        }
    }
}
@Composable
fun letraB(modifier: Modifier?){
    Column {
        Row {
            Text(text ="* *        ", color = getColor())
        }

        Row {
            Text(text ="*      *        ", color = getColor())
        }

        Row {
            Text(text ="*         *        ", color = getColor())
        }

        Row {
            Text(text ="*      *           ", color = getColor())
        }

        Row {
            Text(text ="* *              ", color = getColor())
        }

        Row {
            Text(text ="*      *     ", color = getColor())
        }
        Row {
            Text(text ="*         *     ", color = getColor())
        }
        Row {
            Text(text ="*      *     ", color = getColor())
        }
        Row {
            Text(text ="*  *     ", color = getColor())
        }

    }
}
@Composable
fun letraC(modifier: Modifier?){
    Column {
        Row {
            Text(text ="          *    *        ", color = getColor())
        }

        Row {
            Text(text ="     *              *   ", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="*    ", color = getColor())
        }

        Row {
            Text(text ="*         ", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="     *            * ", color = getColor())
        }

        Row {
            Text(text ="        *    *  ", color = getColor())
        }
    }
}
@Composable
fun letraD(modifier: Modifier?){
    Column {
        Row {
            Text(text = "*    *        ", color = getColor())
        }

        Row {
            Text(text = "*          *   ", color = getColor())
        }

        Row {
            Text(text ="*               *", color = getColor())
        }

        Row {
            Text(text = "*                 *", color = getColor())
        }

        Row {
            Text(text = "*                 *", color = getColor())
        }

        Row {
            Text(text = "*               *", color = getColor())
        }

        Row {
            Text(text = "*          * ", color = getColor())
        }

        Row {
            Text(text = "*    *  ", color = getColor())
        }
    }
}
@Composable
fun letraE(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*********        ", color = getColor())
        }

        Row {
            Text(text ="*              ", color = getColor())
        }

        Row {
            Text(text ="*                 ", color = getColor())
        }

        Row {
            Text(text ="*                 ", color = getColor())
        }

        Row {
            Text(text ="*********              ", color = getColor())
        }

        Row {
            Text(text ="*           ", color = getColor())
        }
        Row {
            Text(text ="*              ", color = getColor())
        }
        Row {
            Text(text ="*           ", color = getColor())
        }
        Row {
            Text(text ="*********     ", color = getColor())
        }

    }
}
@Composable
fun letraF(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*********        ", color = getColor())
        }

        Row {
            Text(text ="*              ", color = getColor())
        }

        Row {
            Text(text ="*                 ", color = getColor())
        }

        Row {
            Text(text ="*                 ", color = getColor())
        }

        Row {
            Text(text ="*********              ", color = getColor())
        }

        Row {
            Text(text ="*           ", color = getColor())
        }
        Row {
            Text(text ="*              ", color = getColor())
        }
        Row {
            Text(text ="*           ", color = getColor())
        }
        Row {
            Text(text ="*     ", color = getColor())
        }

    }
}
@Composable
fun letraG(modifier: Modifier?){
    Column {
        Row {
            Text(text ="          *    *        ", color = getColor())
        }

        Row {
            Text(text ="     *              *   ", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="*    ", color = getColor())
        }

        Row {
            Text(text ="*         ********", color = getColor())
        }

        Row {
            Text(text ="*                    *   ", color = getColor())
        }

        Row {
            Text(text ="     *            * ", color = getColor())
        }

        Row {
            Text(text ="        *    *  ", color = getColor())
        }
    }
}
@Composable
fun letraH(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*             *        ", color = getColor())
        }

        Row {
            Text(text ="*             *        ", color = getColor())
        }

        Row {
            Text(text ="*             *        ", color = getColor())
        }

        Row {
            Text(text ="*             *           ", color = getColor())
        }

        Row {
            Text(text ="**********              ", color = getColor())
        }

        Row {
            Text(text ="*             *     ", color = getColor())
        }
        Row {
            Text(text ="*             *     ", color = getColor())
        }
        Row {
            Text(text ="*             *     ", color = getColor())
        }
        Row {
            Text(text ="*             *     ", color = getColor())
        }

    }
}
@Composable
fun letraI(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*******         ", color = getColor())
        }

        Row {
            Text(text ="     *              ", color = getColor())
        }

        Row {
            Text(text ="     *                 ", color = getColor())
        }

        Row {
            Text(text ="     *                 ", color = getColor())
        }

        Row {
            Text(text ="     *               ", color = getColor())
        }

        Row {
            Text(text ="     *           ", color = getColor())
        }
        Row {
            Text(text ="     *              ", color = getColor())
        }
        Row {
            Text(text ="     *           ", color = getColor())
        }
        Row {
            Text(text ="*******       ", color = getColor())
        }

    }
}
@Composable
fun letraJ(modifier: Modifier?){
    Column {
        Row {
            Text(text ="     ********         ", color = getColor())
        }

        Row {
            Text(text ="           *              ", color = getColor())
        }

        Row {
            Text(text ="           *                 ", color = getColor())
        }

        Row {
            Text(text ="           *                 ", color = getColor())
        }

        Row {
            Text(text ="           *               ", color = getColor())
        }

        Row {
            Text(text ="           *           ", color = getColor())
        }
        Row {
            Text(text ="*         *              ", color = getColor())
        }
        Row {
            Text(text ="*        *           ", color = getColor())
        }
        Row {
            Text(text ="  *   *       ", color = getColor())
        }

    }
}
@Composable
fun letraK(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*              *        ", color = getColor())
        }

        Row {
            Text(text ="*           *        ", color = getColor())
        }

        Row {
            Text(text ="*         *        ", color = getColor())
        }

        Row {
            Text(text ="*      *           ", color = getColor())
        }

        Row {
            Text(text ="* *              ", color = getColor())
        }

        Row {
            Text(text ="*      *     ", color = getColor())
        }
        Row {
            Text(text ="*         *     ", color = getColor())
        }
        Row {
            Text(text ="*           *     ", color = getColor())
        }
        Row {
            Text(text ="*              *     ", color = getColor())
        }

    }
}
@Composable
fun letraL(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*        ", color = getColor())
        }

        Row {
            Text(text ="*              ", color = getColor())
        }

        Row {
            Text(text ="*                 ", color = getColor())
        }

        Row {
            Text(text ="*                 ", color = getColor())
        }

        Row {
            Text(text ="*              ", color = getColor())
        }

        Row {
            Text(text ="*           ", color = getColor())
        }
        Row {
            Text(text ="*              ", color = getColor())
        }
        Row {
            Text(text ="*           ", color = getColor())
        }
        Row {
            Text(text ="*********     ", color = getColor())
        }

    }
}
@Composable
fun letraM(modifier: Modifier?){
    Column {
        Row {
            Text(text ="       *                      *", color = getColor() )
        }

        Row {
            Text(text ="     *  *                  *   *", color = getColor())
        }

        Row {
            Text(text ="    *     *              *      *", color = getColor())
        }

        Row {
            Text(text ="   *        *          *         *", color = getColor())
        }

        Row {
            Text(text ="  *          *       *            *", color = getColor())
        }

        Row {
            Text(text ="*                *                  *", color = getColor())
        }
    }
}
@Composable
fun letraN(modifier: Modifier?){
    Column {
        Row {
            Text(text =" *                    *", color = getColor() )
        }

        Row {
            Text(text ="*    *               *   ", color = getColor())
        }

        Row {
            Text(text ="*      *             *      ", color = getColor())
        }

        Row {
            Text(text ="*          *         *         ", color = getColor())
        }

        Row {
            Text(text ="*             *      *            ", color = getColor())
        }

        Row {
            Text(text ="*                   *                  ", color = getColor())
        }
    }
}
@Composable
fun letraO(modifier: Modifier?){
    Column {
        Row {
            Text(text ="          *    *        ", color = getColor())
        }

        Row {
            Text(text ="     *              *   ", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="*                      *", color = getColor())
        }

        Row {
            Text(text ="*                      *", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="     *            * ", color = getColor())
        }

        Row {
            Text(text ="        *    *  ", color = getColor())
        }
    }
}
@Composable
fun letraP(modifier: Modifier?){
    Column {
        Row {
            Text(text ="* *        ", color = getColor())
        }

        Row {
            Text(text ="*      *        ", color = getColor())
        }

        Row {
            Text(text ="*         *        ", color = getColor())
        }

        Row {
            Text(text ="*      *           ", color = getColor())
        }

        Row {
            Text(text ="* *              ", color = getColor())
        }

        Row {
            Text(text ="*            ", color = getColor())
        }
        Row {
            Text(text ="*              ", color = getColor())
        }
        Row {
            Text(text ="*                ", color = getColor())
        }
        Row {
            Text(text ="*                  ", color = getColor())
        }

    }
}
@Composable
fun letraQ(modifier: Modifier?){
    Column {
        Row {
            Text(text ="          *    *        ", color = getColor())
        }

        Row {
            Text(text ="     *              *   ", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="*                      *", color = getColor())
        }

        Row {
            Text(text ="*                      *", color = getColor())
        }

        Row {
            Text(text ="*             *      *     ", color = getColor())
        }

        Row {
            Text(text ="     *            * ", color = getColor())
        }

        Row {
            Text(text ="        *    *       *", color = getColor())
        }
    }
}
@Composable
fun letraR(modifier: Modifier?){
    Column {
        Row {
            Text(text ="* *        ", color = getColor())
        }

        Row {
            Text(text ="*      *        ", color = getColor())
        }

        Row {
            Text(text ="*         *        ", color = getColor())
        }

        Row {
            Text(text ="*      *           ", color = getColor())
        }

        Row {
            Text(text ="* *              ", color = getColor())
        }

        Row {
            Text(text ="*      *      ", color = getColor())
        }
        Row {
            Text(text ="*         *     ", color = getColor())
        }
        Row {
            Text(text ="*           *     ", color = getColor())
        }
        Row {
            Text(text ="*             *     ", color = getColor())
        }

    }
}
@Composable
fun letraS(modifier: Modifier?){
    Column {
        Row {
            Text(text ="          *    *        ", color = getColor())
        }

        Row {
            Text(text ="     *             *   ", color = getColor())
        }

        Row {
            Text(text ="  *                  *   ", color = getColor())
        }

        Row {
            Text(text ="     *    ", color = getColor())
        }

        Row {
            Text(text ="            *         ", color = getColor())
        }

        Row {
            Text(text =" *                  *   ", color = getColor())
        }

        Row {
            Text(text =" *                 * ", color = getColor())
        }

        Row {
            Text(text ="    *            *   ", color = getColor())
        }
    }
}
@Composable
fun letraT(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*************         ", color = getColor())
        }

        Row {
            Text(text ="         *              ", color = getColor())
        }

        Row {
            Text(text ="         *                 ", color = getColor())
        }

        Row {
            Text(text ="         *                 ", color = getColor())
        }

        Row {
            Text(text ="         *               ", color = getColor())
        }

        Row {
            Text(text ="         *           ", color = getColor())
        }
        Row {
            Text(text ="         *              ", color = getColor())
        }
        Row {
            Text(text ="         *           ", color = getColor())
        }
        Row {
            Text(text ="         *       ", color = getColor())
        }

    }
}
@Composable
fun letraU(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*                     *        ", color = getColor())
        }

        Row {
            Text(text ="*                      *   ", color = getColor())
        }

        Row {
            Text(text ="*                      *   ", color = getColor())
        }

        Row {
            Text(text ="*                      *", color = getColor())
        }

        Row {
            Text(text ="*                      *", color = getColor())
        }

        Row {
            Text(text ="*                     *   ", color = getColor())
        }

        Row {
            Text(text ="     *            * ", color = getColor())
        }

        Row {
            Text(text ="        *    *  ", color = getColor())
        }
    }
}
@Composable
fun letraV(modifier: Modifier?){
    Column {
        Row {
            Text(text ="       *                    *", color = getColor() )
        }

        Row {
            Text(text ="        *                  *   ", color = getColor())
        }

        Row {
            Text(text ="         *              *      ", color = getColor())
        }

        Row {
            Text(text ="           *          *         ", color = getColor())
        }

        Row {
            Text(text ="            *       *            ", color = getColor())
        }

        Row {
            Text(text ="                *                  ", color = getColor())
        }
    }
}
@Composable
fun letraX(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*                  *", color = getColor())
        }

        Row {
            Text(text ="  *               *", color = getColor())
        }

        Row {
            Text(text ="    *           *", color = getColor())
        }

        Row {
            Text(text ="      *       *", color = getColor())
        }

        Row {
            Text(text ="         * *            ", color = getColor())
        }

        Row {
            Text(text ="     *        * ", color = getColor())
        }
        Row {
            Text(text ="   *            *    ", color = getColor())
        }
        Row {
            Text(text =" *                * ", color = getColor())
        }
        Row {
            Text(text ="*                   *", color = getColor())
        }

    }
}
@Composable
fun letraW(modifier: Modifier?){
    Column {
        Row {
            Text(text ="       *                    **                  *", color = getColor() )
        }

        Row {
            Text(text ="        *                  *   *               *", color = getColor())
        }

        Row {
            Text(text ="         *              *       *             *", color = getColor())
        }

        Row {
            Text(text ="           *          *          *          *", color = getColor())
        }

        Row {
            Text(text ="            *       *             *       * ", color = getColor())
        }

        Row {
            Text(text ="                *                     *", color = getColor())
        }
    }
}
@Composable
fun letraY(modifier: Modifier?){
    Column {
        Row {
            Text(text ="*                  *", color = getColor())
        }

        Row {
            Text(text ="  *               *", color = getColor())
        }

        Row {
            Text(text ="    *           *", color = getColor())
        }

        Row {
            Text(text ="      *       *", color = getColor())
        }

        Row {
            Text(text ="         * *            ", color = getColor())
        }

        Row {
            Text(text ="          * ", color = getColor())
        }
        Row {
            Text(text ="          *    ", color = getColor())
        }
        Row {
            Text(text ="          * ", color = getColor())
        }
        Row {
            Text(text ="          *", color = getColor())
        }

    }
}
@Composable
fun letraZ(modifier: Modifier?){
    Column {
        Row {
            Text(text ="************         ", color = getColor())
        }

        Row {
            Text(text ="                  *              ", color = getColor())
        }

        Row {
            Text(text ="              *                 ", color = getColor())
        }

        Row {
            Text(text ="          *                 ", color = getColor())
        }

        Row {
            Text(text ="      *               ", color = getColor())
        }

        Row {
            Text(text ="   *           ", color = getColor())
        }
        Row {
            Text(text ="************              ", color = getColor())
        }
    }
}

@Composable
fun alfabeto(modifier: Modifier?){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        letraA(modifier = null)
        letraB(modifier = null)
        letraC(modifier = null)
        letraD(modifier = null)
        letraE(modifier = null)
        letraF(modifier = null)
        letraG(modifier = null)
        letraH(modifier = null)
        letraI(modifier = null)
        letraJ(modifier = null)
        letraK(modifier = null)
        letraL(modifier = null)
        letraM(modifier = null)
        letraN(modifier = null)
        letraO(modifier = null)
        letraP(modifier = null)
        letraQ(modifier = null)
        letraR(modifier = null)
        letraS(modifier = null)
        letraT(modifier = null)
        letraU(modifier = null)
        letraV(modifier = null)
        letraX(modifier = null)
        letraW(modifier = null)
        letraY(modifier = null)
        letraZ(modifier = null)
    }
}
fun getColor(): Color = Color(red = Random.nextInt(255),
    green = Random.nextInt(255), blue = Random.nextInt(255))

@Composable
@Preview
fun alfabetoPreview(){
    ProjetoDeUiTheme {
        alfabeto(modifier = null)
    }
}






