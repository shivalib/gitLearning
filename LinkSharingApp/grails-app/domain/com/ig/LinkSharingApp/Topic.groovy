package com.ig.LinkSharingApp

class Topic {
    String topicName
    Date dateCreated
    Date lastUpdated


    static hasMany = [resources:Resource,subscriptions:Subscription]

    static belongsTo = [createdBy:User]
    static constraints = {
        topicName nullable: false,blank: false
    }
}
