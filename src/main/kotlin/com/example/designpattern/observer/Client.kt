package com.example.designpattern.observer


fun main() {

    val follower1 = Follower("Tom")
    val follower2 = Follower("Ken")

    val influencer = Influencer(mutableListOf(),"")
    influencer.registerObserver(follower1)
    influencer.registerObserver(follower2)

    influencer.setNewNews("this newNews is for Tom and Ken  ")

    influencer.removeObserver(follower1)
    influencer.setNewNews("this newNews is only for ken ")

}

