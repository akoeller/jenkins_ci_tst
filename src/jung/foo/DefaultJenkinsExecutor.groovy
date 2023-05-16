package jung.foo

class DefaultJenkinsExecutor implements JenkinsExecutor{

    DefaultJenkinsExecutor(script){
        this.script = script 
    }

    @Override
    String sh(String command){
        script.sh(script: command, returnStdout: true)
    }
}