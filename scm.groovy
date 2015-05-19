// Printing out SCM string of all projects

import jenkins.model.*;
import hudson.model.*;
import hudson.tasks.*;
import hudson.plugins.git.*;
import org.eclipse.jgit.transport.RemoteConfig;
import org.eclipse.jgit.transport.URIish;

for(project in Hudson.instance.items) {
  scm = project.scm;
  if (scm instanceof hudson.plugins.git.GitSCM) {
    for (RemoteConfig cfg : scm.getRepositories()) {
      for (URIish uri : cfg.getURIs()) {
        println("SCM " + uri.toString() + " for project " + project);    
      }
    } 
  }  
}
