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
		
	def 'can get to HuntShowPage'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		
		then:
		at HuntShowPage
	}
	
	def 'edit hunt button goes to HuntEditPage'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		editButton.click()
		
		then:
		at HuntEditPage
	}
	
	def 'creator link goes to UserShowPage'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		creatorLink.click()
		
		then:
		at UserShowPage
	}
	
	def 'clicking a prompt goes to PromptShowPage'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		oakLink.click()
		
		then:
		at PromptShowPage
	}
	
	def 'can add a Prompt'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		newPromptTitleField.value('New Prompt')
		newPromptDescriptionField.value('Desc')
		newPromptSubmitButton.click()
		
		then:
		at HuntShowPage
	}
	
	def 'can lock-in a hunter'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		hunterName.value('Billy')
		hunterSubmitButton.click()
		
		then:
		at HuntShowPage
	}
	
	def 'can add a Participant'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		addUserNameField.value('Edward')
		addUserSubmitButton.click()
		
		then:
		at HuntShowPage
	}
	
	def 'can add an Administrator'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		addAdminNameField.value('Edward')
		addAdminSubmitButton.click()
		
		then:
		at HuntShowPage
	}
	
	def 'can Download Photos'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		downloadPhotosButton.click()
		
		
		then:
		at HuntShowPage
	}
	
	def 'can Close Hunt'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		closeHunt.click()
		
		
		then:
		at HuntShowPage
	}
	
	def 'can Delete Hunt'() {
		when:
		loginAs('Walter', 'password')
		showTrees.click()
		deleteButton.click()
		
		
		then:
		at ListOfHuntsPage
	}
}
