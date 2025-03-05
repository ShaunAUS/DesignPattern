package com.example.designpattern.observer

class Influencer(
    private var observers: MutableList<Observer>,
    private var news: String,
) : News {
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyToObservers() {
        for (observer in observers) {
            observer.update(news)
        }
    }

    //새로운 소식이오면 observer(follower) 에게 알린다
    fun setNewNews(newNews: String) {
        this.news = newNews
        notifyToObservers()
    }
}