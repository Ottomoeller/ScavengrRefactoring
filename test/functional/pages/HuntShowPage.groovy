package pages

import geb.Page
class HuntShowPage extends Page {
    
    static at = {
        title.endsWith('Show Hunt')
    }
    
    static content = {
		
		editButton(to: HuntEditPage){$('a', text:'Edit Hunt')}
		creatorLink(to: UserShowPage){$('a', text: 'Walter')}
		oakLink(to: PromptShowPage){$('a', text: 'Oak')}
		newPromptTitleField(){$('input', name:'title')}
		newPromptDescriptionField(){$('textarea', name:'description')}
		newPromptSubmitButton(){$('button', id:'new-prompt-submit')}
		hunterName(){$('input', name:'hunter')}
		hunterSubmitButton(){$('button', text:'Lock In')}
//		deleteButton(){$('button', name:'_action_delete')}
//		
//		addUserNameField(){$('input', id:'user')}
//		addUserSubmitButton(){$('button', id: 'new-participant-submit')}
//		
//		addAdminNameField(){$('input', id: 'admin-login')}
//		addAdminSubmitButton(){$('button', id: 'new-admin-submit')}
//		
//		downloadPhotosButton(){$('button', name: '_action_downloadPhotos')}
		
    }

}
