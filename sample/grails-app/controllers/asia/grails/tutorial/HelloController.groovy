package asia.grails.tutorial

class HelloController {

    def index() { 
		def lista = []
		lista.add(new Person(firstName: 'John',lastName: 'Doe', age:55))
		lista.add(new Person(firstName: 'Jane',lastName: 'Smith', age:45))
		lista << new Person(firstName: 'Sam',lastName: 'Robinson', age:47)		
		[lista:lista]
	}
	
	def hi() {
		render (view:'index.gsp')
	}
	
	def displayForm(){
		// just to provide value for age. First Name and Last name are blanks
		Person person = new Person(age:55)
		[person:person]
	}
	def save(){
		
	}
}
