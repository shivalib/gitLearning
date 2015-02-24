import MyEnums.Seriousness
import com.ig.LinkSharingApp.DocumentResource
import com.ig.LinkSharingApp.LinkResource
import com.ig.LinkSharingApp.Resource
import com.ig.LinkSharingApp.Subscription
import com.ig.LinkSharingApp.Topic
import com.ig.LinkSharingApp.User

class BootStrap {

    def init = { servletContext ->
        createUser()
    }
    def destroy = {
    }

    void createUser() {

        (1..2).each {
            User user = new User(firstName: "User ${it}", lastName: "userLast ${it}", username: "intelligrape${it}", password: "igdefault${it}", email: "shivalib${it}@intelligrape.com", photo: 0, admin: false, active: false)

            if (user.save(flush: true, failOnError: true)) {
                5.times
                        {
                            Topic topic=createTopics(user,it)
                            5.times {
                                createLinkResource(user,topic,it)
                                createDocumentResource(user,topic,it)
                            }
                        }

            } else {
                user.hasErrors()
            }
        }
    }

    Topic createTopics(User user,Integer it) {
            Topic topic = new Topic(topicName: "Topic ${it}", createdBy: user)
            if (topic.save(flush: true, failOnError: true)) {
                user.addToTopics(topic)
                subscribeTopic(user, topic)
               // createResources(user, topic,it)
            } else {
                topic.hasErrors()
            }

        return topic
    }

    Subscription subscribeTopic(User user, Topic topic) {
        Subscription subscription = new Subscription(seriousness: Seriousness.VERY_SERIOUS, user: user, topic: topic)

        if (subscription.save(flush: true, failOnError: true)) {
            user.addToSubscriptions(subscription)
        } else {
            subscription.hasErrors()
        }
        return subscription

    }

    DocumentResource createDocumentResource(User user,Topic topic,Integer it)
    {
        DocumentResource documentResource = new DocumentResource(createdBy: user, description: "myResource", filePath: "/home/intelligrape/Documents/LinksharingRequirement.docx", topic: topic)
        topic.addToResources(documentResource)
        documentResource.save(flush: true,failOnError: true)
        return documentResource
    }

    LinkResource createLinkResource(User user,Topic topic,Integer it)
    {
        LinkResource linkResource = new LinkResource(createdBy: user, description: "myResource", url: "http://www.google.com", topic: topic)
        topic.addToResources(linkResource)
        linkResource.save(flush: true,failOnError: true)
        return linkResource

    }


}
