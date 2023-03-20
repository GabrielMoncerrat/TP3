package com.example.pilhelloworld

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: MainContract.Presenter

    @MockK
    private lateinit var mainView: MainContract.View

    @Before
    fun onBefore() {
        MockKAnnotations.init(this, relaxed = true)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun aTextShouldBeDisplayed() {
        every { mainView.getText() } returns "Gabo"
        mainPresenter.onButtonPressed()
        verify { mainView.showText() }
    }
}
