package jung.foo

class MyCustomSteps implements Serializable{

    private final JenkinsExecutor jenkinsExecutor

    MyCustomSteps(JenkinsExecutor jenkinsExecutor){
        this.jenkinsExecutor = jenkinsExecutor
    }
    
    void execute(){
        this.jenkinsExecutor.sh("echo 'hia'")
    }
}