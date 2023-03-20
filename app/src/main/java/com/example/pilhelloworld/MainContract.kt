package com.example.pilhelloworld

interface MainContract {

    interface View {
        fun showText(onClick: String.Companion)
        fun getText(): String
    }

    interface Presenter {
        fun onButtonPressed()
    }
}
