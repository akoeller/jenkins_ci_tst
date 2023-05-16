import jung.foo.Constants

def call(Map config = [:]) {
	sh "echo Hello ${config.name}, today is ${config.dayOfWeek}"
	sh "echo ${Constants.TEST}"
}