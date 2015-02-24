package com.ig.LinkSharingApp

class ResourceRating {
    User user
    Integer score

    static belongsTo = [resource:Resource]

    static constraints = {
    }

}
