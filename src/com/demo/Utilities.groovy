package com.demo

class Utilities {
    def static getBuildCause(def context){
        def cause = context.currentBuild.getBuildCauses()[0]
        if(cause.upstreamProject)
            return cause.upstreamProject
        return cause.userId
    }
}