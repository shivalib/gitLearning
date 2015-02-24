package com.ig.LinkSharingApp

class LoginController {

    def index() {
        render(view: '/login')
    }

    def ifLogin() {
        render(view: '/user/loggedIn')
    }

    def validateUser(String username, String password) {
        if (User.findByUsernameAndPassword(username, password)) {

            redirect(controller: 'user', action: 'loginHandler')
        } else {
            redirect(controller: 'login')
        }
    }

    def registerUser(User u) {
        u.admin = false
        u.active = true
        println u.validate()

        u.errors.allErrors.each {
            println it
        }

        if (!u.save()) {
            render "Not successful"
        } else {
            redirect(controller: 'login')
        }
    }
}
