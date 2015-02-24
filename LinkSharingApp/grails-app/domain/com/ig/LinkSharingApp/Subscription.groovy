package com.ig.LinkSharingApp

import MyEnums.Seriousness

class Subscription {
    User user
    Date dateCreated
    Seriousness seriousness

    static belongsTo = [topic:Topic]

    static constraints = {
    }
}
