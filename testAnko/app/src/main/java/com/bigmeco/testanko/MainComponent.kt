package com.bigmeco.testanko

import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainComponent: AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }
        }
    }
}