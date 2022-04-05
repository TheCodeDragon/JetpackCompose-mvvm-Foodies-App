package com.interviewcode.foodies.ui.feature.categories

import com.interviewcode.foodies.model.FoodItem


class FoodCategoriesContract {

    data class State(
        val categories: List<FoodItem> = listOf(),
        val isLoading: Boolean = false
    )

    sealed class Effect {
        object DataWasLoaded : Effect()
    }
}