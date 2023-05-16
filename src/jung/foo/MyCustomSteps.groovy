package jung.foo

class MyCustomSteps extends DefaultJenkinsExecutor{

    MyCustomSteps(){
        super()
    }
    

    void execute(){
        this.sh("echo 'hi'")
    }
}