#-*- mode: ruby -*-
# Written by Eric Crosson
# 2016-01-25

VERSION_NUMBER = '0.1'
JAVA_TARGET = '1.8'

repositories.remote << "http://repo2.maven.org/maven2/"
repositories.remote << "http://repo.jenkins-ci.org/releases/"

BCEL = 'org.apache.bcel:bcel:jar:5.2'
SELENIUM = 'org.seleniumhq.selenium:selenium-server-standalone:jar:2.53.0'

Java.classpath << BCEL << SELENIUM

#--- Conform to course directory structure
ass_layout = Layout.new
ass_layout[:source, :main, :java] = 'assignments/src'
ass_layout[:source, :test, :java] = 'assignments/test'

define 'assignments', :layout => ass_layout do

  compile.with BCEL
  compile.with SELENIUM

  #--- Project Group settings
  project.version = VERSION_NUMBER
  manifest['Copyright'] = 'Eric Crosson (C) 2016'

  #--- Build settings
  doc.using(:windowtitle => "Abandon All Hope", :private => true)
end

task :default => [:build, :doc]
