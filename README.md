# TestVagrant



Clone repository.

  git clone https://github.com/atishkamble70/TestVagrant.git
Command-line Instructions
Prerequisites:
Install the latest version of Java and Maven.
Set the environment variable: export GOOGLE_APPLICATION_CREDENTIALS=your-key-filename.json
You may need to set your JAVA_HOME.
cd java-docs-samples/storage/xml-api/cmdline-sample

# Compile and run
mvn compile install
mvn -q exec:java -Dexec.args="your-bucket-name"
To enable logging of HTTP requests and responses.
Eclipse Instructions
Prerequisites:

Install Eclipse, the Maven plugin, and optionally the GitHub plugin.
Set up Eclipse Preferences

Window > Preferences... (or on Mac, Eclipse > Preferences...)

Select Maven

check on "Download Artifact Sources"
check on "Download Artifact JavaDoc"
Create a new project using storage/xml-api/cmdline-sample

Create a new Java Project.
Choose the Location of the project to be the location of cmdline-sample
Select the project and Convert to Maven Project to add Maven Dependencies.
Click on Run > Run configurations
Navigate to your Java Application's configuration section
In the Arguments tab, add the name of the bucket you created above as a Program argument
In the Environment tab, create a variable GOOGLE_APPLICATION_CREDENTIALS and set it to the path to your json private key file.
Run

Right-click on project
Run As > Java Application
If asked, type "QuestionController" and click OK
