import jung.foo.Constants
import jung.foo.MyCustomSteps

def call(Map config = [:]) {
	sh "echo Hello ${config.name}, today is ${config.dayOfWeek}"
	sh "echo ${Constants.TEST}"

	def x = new MyCustomSteps()
	x.execute()
	
}