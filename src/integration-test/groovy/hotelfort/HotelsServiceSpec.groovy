package hotelfort

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class HotelsServiceSpec extends Specification {

    HotelsService hotelsService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Hotels(...).save(flush: true, failOnError: true)
        //new Hotels(...).save(flush: true, failOnError: true)
        //Hotels hotels = new Hotels(...).save(flush: true, failOnError: true)
        //new Hotels(...).save(flush: true, failOnError: true)
        //new Hotels(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //hotels.id
    }

    void "test get"() {
        setupData()

        expect:
        hotelsService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Hotels> hotelsList = hotelsService.list(max: 2, offset: 2)

        then:
        hotelsList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        hotelsService.count() == 5
    }

    void "test delete"() {
        Long hotelsId = setupData()

        expect:
        hotelsService.count() == 5

        when:
        hotelsService.delete(hotelsId)
        sessionFactory.currentSession.flush()

        then:
        hotelsService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Hotels hotels = new Hotels()
        hotelsService.save(hotels)

        then:
        hotels.id != null
    }
}
