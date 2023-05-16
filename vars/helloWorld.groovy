import jung.foo.Constants
import jung.foo.MyCustomSteps
import jung.foo.JenkinsExecutor

def call(Map config = [:]) {
	sh "echo Hello ${config.name}, today is ${config.dayOfWeek}"
	sh "echo ${Constants.TEST}"

	def x = new MyCustomSteps(new JenkinsExecutor())
	x.execute()
	
}