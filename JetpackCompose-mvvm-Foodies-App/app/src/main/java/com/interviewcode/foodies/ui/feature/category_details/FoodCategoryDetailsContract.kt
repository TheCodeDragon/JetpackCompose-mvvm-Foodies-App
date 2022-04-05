package com.interviewcode.foodies.ui.feature.category_details


import com.interviewcode.foodies.model.FoodItem


class FoodCategoryDetailsContract {
    data class State(
        val category: FoodItem?,
        val categoryFoodItems: List<FoodItem>
    )
}