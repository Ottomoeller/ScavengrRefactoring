import geb.spock.GebReportingSpec
import spock.lang.*
import pages.*

class HuntShowPageSpec extends GebReportingSpec {
	
	private loginAs(user, password) {
		to HomePage
		loginUserNameBox.value(user)
		loginPasswordBox.value(password)
		loginButton.click()
	}
		
	def 'go to hunt show page'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		
		then:
		at HuntShowPage
	}
	
	def 'go to hunt edit page'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		editButton.click()
		
		then:
		at HuntEditPage
	}
}
