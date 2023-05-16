package jung.foo

interface JenkinsExecutor extends Serializable {
    String sh(String command)
}