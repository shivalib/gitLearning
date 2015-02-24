package com.ig.LinkSharingApp

class DocumentResource extends Resource {

    String filePath

//    static belongsTo = [resource:Resource]

    static constraints = {
        filePath nullable: false,blank: false
    }
}
