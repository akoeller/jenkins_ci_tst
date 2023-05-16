

class DockerEcr implements Serializable{

    public final def script

    DockerEcr(def script){
        this.script = script
    }

    void buildDockerImage(String imageName){
        def git = new Git(this.script)
        script.sh("echo ${git.commitHash()}")
    }


}
