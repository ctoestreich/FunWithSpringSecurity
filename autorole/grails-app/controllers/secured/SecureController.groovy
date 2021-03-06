package secured

import grails.plugin.springsecurity.annotation.Secured

class SecureController {

	@Secured('ROLE_USER')
	def index() {
		render "You have ROLE_USER or ROLE_ADMIN: $principal"
	}

	@Secured('ROLE_ADMIN')
	def admin() {
		render "ROLE_ADMIN: $principal"
	}
}
