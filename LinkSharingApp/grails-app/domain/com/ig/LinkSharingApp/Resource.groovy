package com.ig.LinkSharingApp

abstract class Resource {
    String description
    User createdBy
    Date dateCreated
    Date lastUpdated

    static hasMany = [readingitems:ReadingItem]

    static belongsTo = [topic:Topic]

    static constraints = {
        description maxSize: 1024
    }
}
