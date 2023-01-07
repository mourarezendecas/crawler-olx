package com.api.olxcrawler.models

class ResponseModel {
    String searchTitle
    double avaragePrice
    ItemModel cheapestItem
    ItemModel moreExpensiveItem
    int adAmount
    List<ItemModel> advertisements
}
