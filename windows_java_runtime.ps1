param (
    [string]$JavaFile = "Day_Four_Part_Two_Exercise_One.java"
)

$JavaFile = $JavaFile.Replace("\", "/")

docker run --rm -it `
  -v "${PWD}:/app" `
  -w /app `
  eclipse-temurin:21 `
  java "$JavaFile"

# to run, use this command: .\windows_java_runtime.ps1 .\Day_Four_Project.java