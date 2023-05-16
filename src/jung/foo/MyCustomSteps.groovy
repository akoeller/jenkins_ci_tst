package jung.foo

class MyCustomSteps extends DefaultJenkinsExecutor{

    void execute(){
        this.sh("echo 'hi'")
    }
}