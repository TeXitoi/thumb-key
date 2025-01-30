@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_FR_TWO_THUMB_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("à"),
                    left = KeyC("á"),
                    bottom = KeyC("â"),
                    top = KeyC("ä"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ì"),
                    left = KeyC("í"),
                    bottom = KeyC("î"),
                    top = KeyC("ï"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC(" "),
                    bottom = KeyC("œ"),
                    top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ñ"),
                    left = KeyC("j"),
                    bottom = KeyC("!"),
                    top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("z"),
                    left = KeyC("k"),
                    bottom = KeyC(":"),
                    top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC(" "),
                    bottom = KeyC(" "),
                    top = KeyC(" "),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC(" "),
                    bottom = KeyC("q"),
                    top = KeyC("æ"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("è"),
                    left = KeyC("é"),
                    bottom = KeyC("ê"),
                    top = KeyC("ë"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ò"),
                    left = KeyC("ó"),
                    bottom = KeyC("ô"),
                    top = KeyC("ö"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC("'"),
                    bottom = KeyC(";"),
                    top = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC("y"),
                    bottom = KeyC(" "),
                    top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC("g"),
                    bottom = KeyC(" "),
                    top = KeyC(" "),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("b", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("("),
                    left = KeyC(" "),
                    bottom = KeyC(" "),
                    top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC(")"),
                    bottom = KeyC(","),
                    top = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC(" "),
                    bottom = KeyC("."),
                    top = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("x"),
                    left = KeyC("ç"),
                    bottom = KeyC("?"),
                    top = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ù"),
                    left = KeyC("ú"),
                    bottom = KeyC("û"),
                    top = KeyC("ü"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(" "),
                    left = KeyC(" "),
                    bottom = KeyC(" "),
                    top = KeyC(" "),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EMOJI_KEY_ITEM,
                SPACEBAR_FRENCH_KEY_ITEM.copy(widthMultiplier = 2),
                NUMERIC_KEY_ITEM_ALT,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("À", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("À"),
                        ),
                    bottom = KeyC("Z"),
                    top = KeyC("Â", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("É", color = MUTED),
                    left = KeyC("È", color = MUTED),
                    bottom = KeyC("R"),
                    top = KeyC("Ê", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Y"),
                    left = KeyC("Ù", color = MUTED),
                    bottom = KeyC("U"),
                    top = KeyC("Û", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ô", color = MUTED),
                    left = KeyC("P"),
                    bottom = KeyC("O"),
                    top = KeyC("Î", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("Q"),
                    top = KeyC("Œ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("F"),
                        ),
                    left = KeyC("F"),
                    bottom = KeyC("G"),
                    top = KeyC("Ë", color = MUTED),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("J"),
                    left = KeyC("K"),
                    bottom = KeyC("H"),
                    top = KeyC("Ü", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("Ï", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("W"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("W"),
                        ),
                    bottom = KeyC("X"),
                    top = KeyC("Ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("B", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français two thumb",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_TWO_THUMB_MAIN,
                shifted = KB_EN_FR_TWO_THUMB_SHIFTED,
                numeric = FRENCH_TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
