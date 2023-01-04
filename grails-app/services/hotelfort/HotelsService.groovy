package hotelfort

import grails.gorm.services.Service

@Service(Hotels)
interface HotelsService {

    Hotels get(Serializable id)

    List<Hotels> list(Map args)

    Long count()

    void delete(Serializable id)

    Hotels save(Hotels hotels)

}