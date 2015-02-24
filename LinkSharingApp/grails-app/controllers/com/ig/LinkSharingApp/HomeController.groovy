package com.ig.LinkSharingApp

class HomeController {

    def index() {
        render(view: '/login')
    }

    def dashboard()
    {
        if(session["username"]) {
            render(view: "/user/Dashboard")
            //render "hehe"

        }
        else{
            render "haha"


        }


    }
}
