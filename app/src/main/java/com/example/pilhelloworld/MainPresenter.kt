package com.example.pilhelloworld

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.showText(onClick = (String))
    }
    override fun onButtonPressed() {
        view.showText(String)
    }
}
