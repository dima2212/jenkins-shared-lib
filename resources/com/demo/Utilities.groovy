package com.demo

class Utilities implements Serializable {
    def getBuildCause(context){
        def cause = context.currentBuild.getBuildCauses()[0]
        if(cause.upstreamProject)
            return cause.upstreamProject
        return cause.userId
    }
}