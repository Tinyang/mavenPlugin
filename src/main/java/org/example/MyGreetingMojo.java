package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "sayhi")
public class MyGreetingMojo extends AbstractMojo {

    @Parameter
    private String greeting;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(greeting);
    }
}
