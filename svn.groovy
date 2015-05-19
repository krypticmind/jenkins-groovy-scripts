import hudson.scm.*
 
// Access to the Hudson Singleton
jenkinsInstance = jenkins.model.Jenkins.instance
 
// Retrieve all jobs
allJobs = jenkinsInstance.items
 
// iterate over jobs with Subversion as SCM
allJobs.each { job ->
    if (job.scm instanceof SubversionSCM) {
            println("SVN url: " + job.scm.locations[0] + " for project " + job.name)
        }
}
