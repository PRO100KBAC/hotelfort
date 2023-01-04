package hotelfort

class MainController {

    def show(){
        redirect(url: '/hotels')
        render "some text"
//        def map = [hotel: Hotels.getAll()]
//        redirect([url: hotels, permantent: true])
//        return
    }

//    def displayHotels(){
//        if(Hotels.count()==0){
//            render 'User list is empty!'
//        }else {
//            println Hotels.list().size()
//            println Hotels.count()
//            for(Hotels u : Hotels.list()){
//                println u.name
//            }
//        }
//    }
}
