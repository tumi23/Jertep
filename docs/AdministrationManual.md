#Administration Manual

To play Tic Tac Toe on your computer, you have to do the following:

####Java

You need to have java runtime environment on your computer. 

If you use windows, go to [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/jre7u9-downloads-1859586.html) there are instructions on how to install it. 

If you use Mac or Linux go to [Homebrew](http://brew.sh) and copy the Url and run in the Terminal. 
You also need to do the following:
 - brew tap caskroom/cask
 - brew install brew-cask
 - brew cask install java

-
####Git

You need to have git instaalled on the computer. You can get it on [Git](http://git-scm.com/download/win "Download and install git")

####Gradle

You need to have Gradle in your computer. 

If you use windows you can download Gradle and then you will unzip it and set it up. You can follow these [Instructions]( https://docs.gradle.org/current/userguide/installation.html "instructions for gradle"). 

- You have to be sure to:
    - Add GRADLE_HOME/bin to your PATH environment variable
    - Add a valid JDK to the environment variable JAVA_HOME.

If you are using Mac or Linux you go to [Homebrew](http://brew.sh) and copy the Url and run in the Terminal. 
You also need to do the following:
 - brew install gradle

-
####Play Tic Tac Toe on your computer.
Now you have to go to[GitHub](https://github.com/peturs15/Jertep) and download the project as .zip/.tar.gz

On Unix/Linux open the command prompt and go the location of the folder. Write the command *./bin/deploy* to run the game

On Unix/Linux open the terminal and go to the location of the folder. Write the command *sh .\bin\deploy*

####.jar
After you run the game on your computer it saves a .jar file in a directory named jar on the root of your computer. Go to the jar directory and type the command *java -jar ticktacktoe.jar* to play the game as a console project.

####How to play Tic Tac Toe

lýsing á hvernig leikurinn er spilaður