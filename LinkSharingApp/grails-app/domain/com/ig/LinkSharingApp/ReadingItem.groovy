package com.ig.LinkSharingApp

class ReadingItem {

    User user
    boolean isRead

    static belongsTo = [resource:Resource]
    static constraints = {

    }
}
