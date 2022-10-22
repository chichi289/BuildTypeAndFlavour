package com.chichi289.buildtypeflavour

import java.util.*


/**
 * Created by Chirag Prajapati on 15/09/22.
 * Space O Technologies
 * pchirag.spaceo@gmail.com
 */

fun String.camelCase(): String {
    val words = split("[\\W_]+")
    val builder = StringBuilder()
    for (i in words.indices) {
        var word: String = words[i]
        word = if (i == 0) {
            if (word.isEmpty()) word else word.lowercase(Locale.getDefault())
        } else {
            if (word.isEmpty()) word else word[0].uppercaseChar().toString() + word.substring(1)
                .lowercase(
                    Locale.getDefault()
                )
        }
        builder.append(word)
    }
    return builder.toString()
}