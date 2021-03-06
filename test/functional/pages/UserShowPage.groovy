package pages

import geb.Page   
import pages.*


class UserShowPage extends Page {
    
        static at = {
            title.endsWith('Show User')
        }
        
        def a = 'a'
        def input = 'input'
		def button = 'button'
        static content = {
            //This button currently does not work
          //  createAHuntButton(to: CreateHuntPage) {$('li.g', text: endsWith('Create Hunt') )}
            
            
            //The navbar buttons
            scavengrButton(to: HomePage){$(a , id:'scavengrButton')}
            helloButton(to: UserShowPage){$(a, text: startsWith('Hello,')) }
            logoutButton() {$(a, text: 'Log out')}
            navbarCreateButton(to: CreateAHuntPage){$(a, text: 'Create A Hunt')}
            userCreateAHuntButton(){$(a, text:'Create Hunt')}
			
			scavengrButton(to: HomePage) {$(a , text: 'Scavengr')}
			changeEmail(){$(a, id:'changeEmail')}
			newEmail(){$(input, id:'newEmail')}
			confirmEmail(){$(input, id:'confirmEmail')}
			confirmEmailButton(){$(button, id:'submitEmail')}
			
			downloadPhotos(){$(a, text:'Download My Photos')}
			
			changePassword(){$(a, text:'Change Password')}
			currentPasswordBox(){$('input', id:'changePassword')}
			newPasswordBox(){$('input', id:'newPassword')}
			confirmNewPasswordBox(){$('input', id:'confirmPassword')}
			confirmPasswordButton(){$('button', id:'submitChange')}
			
			showTrees(to: HuntShowPage){$('a', text:'Trees')}
        }
}
