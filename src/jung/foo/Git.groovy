package jung.foo

class Git implements Serializable{

    public final def script

    Git(def script){
        this.script = script
    }

    String commitHash(){
        return this.script.sh(script: getLatestGitCommitHashCommand(), returnStdout: true).trim()
    }

    private static String getLatestGitCommitHashCommand(){
        return "git rev-parse HEAD"
    }
}