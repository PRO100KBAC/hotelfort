package hotelfort

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(redirect: '/hotels')
        get "/hotels"(controller:"hotel", action:"index")
        post "/hotels/search"(controller: "hotel", action: "search")
        get "/hotels/create"(controller:"hotel", action:"create")
        post "/hotels/$id/update"(controller:"hotel", action:"update")
        post "/hotels/$id"(controller:"hotel", action:"delete")
        get "/countries"(controller:"country", action:"index")
        get "/countries/create"(controller:"country", action:"create")
        post "/countries/$id/update"(controller:"country", action:"update")
        post "/countries/$id"(controller:"country", action:"delete")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
