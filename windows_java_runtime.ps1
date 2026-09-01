param (
    [string]$JavaFile = "Day_Three/Day_Three_Challenge_Two_NumberGuessingGame.java"
)

$JavaFile = $JavaFile.Replace("\", "/")

docker run --rm -it `
  -v "${PWD}:/app" `
  -w /app `
  eclipse-temurin:21 `
  java "$JavaFile"

# to run, use this command: .\windows_java_runtime.ps1 .\Day_Four_Project.java