@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_FR_TWO_THUMB_NUKE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("q"),
                    bottom = KeyC("qu"),
                    right = KeyC("pl"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("la"),
                    bottom = KeyC("lo"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("â"),
                    left = KeyC("al"),
                    bottom = KeyC("an"),
                    right = KeyC("à"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("is"),
                    bottom = KeyC("it"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("si"),
                    right = KeyC("sc"),
                    bottom = KeyC("se"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("k"),
                    left = KeyC("ç"),
                    bottom = KeyC("x"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("y"),
                    right = KeyC("fo"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ol"),
                    topLeft = KeyC("ô"),
                    left = KeyC("of"),
                    bottom = KeyC("ou"),
                    bottomRight = KeyC("œ"),
                    right = KeyC("on"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("na"),
                    left = KeyC("no"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ti"),
                    bottom = KeyC("z"),
                    right = KeyC("te"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("es"),
                    topLeft = KeyC("ê"),
                    left = KeyC("et"),
                    bottomLeft = KeyC("é"),
                    bottom = KeyC("er"),
                    bottomRight = KeyC("è"),
                    right = KeyC("em"),
                    topRight = KeyC("ée"),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("me"),
                    bottom = KeyC("w"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("j"),
                    bottom = KeyC("."),
                    right = KeyC("vu"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("uo"),
                    bottom = KeyC("'"),
                    left = KeyC("uv"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("hu"),
                    bottom = KeyC(","),
                    right = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("b"),
                    right = KeyC("dr"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("re"),
                    left = KeyC("rd"),
                    right = KeyC("rg"),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("gr"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                EMOJI_KEY_ITEM,
                SPACEBAR_FRENCH_KEY_ITEM.copy(
                    widthMultiplier = 2,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB_NUKE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Q"),
                    bottom = KeyC("Qu"),
                    right = KeyC("Pl"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("La"),
                    bottom = KeyC("Lo"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Â"),
                    left = KeyC("Al"),
                    bottom = KeyC("An"),
                    right = KeyC("À"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Is"),
                    bottom = KeyC("It"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Si"),
                    right = KeyC("Sc"),
                    bottom = KeyC("Se"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("K"),
                    left = KeyC("Ç"),
                    bottom = KeyC("X"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Y"),
                    right = KeyC("Fo"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Ol"),
                    topLeft = KeyC("Ô"),
                    left = KeyC("Of"),
                    bottom = KeyC("Ou"),
                    bottomRight = KeyC("Œ"),
                    right = KeyC("On"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Na"),
                    left = KeyC("No"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ti"),
                    bottom = KeyC("Z"),
                    right = KeyC("Te"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Es"),
                    topLeft = KeyC("Ê"),
                    left = KeyC("Et"),
                    bottomLeft = KeyC("É"),
                    bottom = KeyC("Er"),
                    bottomRight = KeyC("È"),
                    right = KeyC("Em"),
                    topRight = KeyC("Ée"),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Me"),
                    bottom = KeyC("W"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("J"),
                    bottom = KeyC("!"),
                    right = KeyC("Vu"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Uo"),
                    bottom = KeyC("\""),
                    left = KeyC("Uv"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Hu"),
                    bottom = KeyC("?"),
                    right = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("B"),
                    right = KeyC("Dr"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Re"),
                    left = KeyC("Rd"),
                    right = KeyC("Rg"),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Gr"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                EMOJI_KEY_ITEM,
                SPACEBAR_FRENCH_KEY_ITEM.copy(
                    widthMultiplier = 2,
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB_NUKE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("%", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("À"),
                    // left = KeyC("Á"),
                    // bottom = KeyC("Â"),
                    // top = KeyC("Ä"),
                ),
                KeyItemC(
                    center = KeyC("/", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("Ì"),
                    // left = KeyC("Í"),
                    bottom = KeyC("="),
                    // top = KeyC("Ï"),
                ),
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(" "),
                    // left = KeyC("#"),
                    // bottom = KeyC("Œ"),
                    // top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("Ñ"),
                    // left = KeyC("~"),
                    // bottom = KeyC("!"),
                    // top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("Z"),
                    // left = KeyC("K"),
                    // bottom = KeyC("_"),
                    // top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("*", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("\\"),
                    // left = KeyC("/"),
                    // bottom = KeyC("|"),
                    // top = KeyC("&"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("<", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("{"),
                    // left = KeyC(" "),
                    bottom = KeyC("["),
                    // top = KeyC("Æ"),
                ),
                KeyItemC(
                    center = KeyC(">", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("È"),
                    left = KeyC("}"),
                    bottom = KeyC("]"),
                    // top = KeyC("Ë"),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("Ò"),
                    // left = KeyC("Ó"),
                    // bottom = KeyC("Ô"),
                    // top = KeyC("Ö"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("\""),
                    // left = KeyC("'"),
                    // bottom = KeyC("`"),
                    // top = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(" "),
                    // left = KeyC("Y"),
                    // bottom = KeyC(" "),
                    // top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("-", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(" "),
                    // left = KeyC("G"),
                    // bottom = KeyC(" "),
                    // top = KeyC("Ÿ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("(", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("("),
                    // left = KeyC(" "),
                    // bottom = KeyC(";"),
                    top = KeyC("^"),
                ),
                KeyItemC(
                    center = KeyC(")", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("€"),
                    left = KeyC("£"),
                    // bottom = KeyC(","),
                    top = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(":"),
                    // left = KeyC("…"),
                    // bottom = KeyC("."),
                    // top = KeyC("·"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("X"),
                    // left = KeyC("Ç"),
                    // bottom = KeyC("?"),
                    // top = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC("Ù"),
                    // left = KeyC("Ú"),
                    // bottom = KeyC("Û"),
                    // top = KeyC("Ü"),
                ),
                KeyItemC(
                    center = KeyC("+", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(" "),
                    // left = KeyC("J"),
                    // bottom = KeyC(" "),
                    // top = KeyC(" "),
                ),
            ),
            listOf(
            ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(" "),
                    // left = KeyC("J"),
                    // bottom = KeyC(" "),
                    top = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\""),
                    left = KeyC("°"),
                    // bottom = KeyC(" "),
                    top = KeyC("'"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    // right = KeyC(" "),
                    // left = KeyC("J"),
                    // bottRom = KeyC(" "),
                    top = KeyC(":"),
                ),
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB_NUKE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français two thumb (Nuke)",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_TWO_THUMB_NUKE_MAIN,
                shifted = KB_EN_FR_TWO_THUMB_NUKE_SHIFTED,
                numeric = KB_EN_FR_TWO_THUMB_NUKE_NUMERIC,
            ),
    )
