package com.latief.idngram.model

class Post {
    private var postid: String = ""
    private var postimage: String = ""
    private var publisher: String = ""
    private var description: String = ""

    constructor()
    constructor(postid: String, postimage: String, publisher: String, description: String) {
        this.postid = postid
        this.postimage = postimage
        this.publisher = publisher
        this.description = description
    }

    //get
    fun getPostid(): String{
        return postid
    }

    fun getPostimage(): String{
        return postimage
    }

    fun getPublisher(): String{
        return publisher
    }

    fun getDescription(): String{
        return description
    }

    //set
    fun setPostid(postid: String){
        this.postid = postid
    }

    fun setPostimage(postimage: String){
        this.postimage = postimage
    }

    fun setPublisher(publisher: String){
        this.publisher = publisher
    }

    fun setDescription(description: String){
        this.description = description
    }
}