import jung.foo.Constants
import jung.foo.DockerEcr
import jung.foo.Git


def call(Map config = [:]) {
	sh "echo Hello ${config.name}, today is ${config.dayOfWeek}"
	sh "echo ${Constants.TEST}"

	def dockerEcr = new DockerEcr()
	dockerEcr.buildDockerImage("joo")

}