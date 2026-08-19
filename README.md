# Demonstrator for an IntelliJ IDEA sbt 2 integration bug

Steps to reproduce:

* Import `sbt-2-project` into IDEA with sbt shell for builds disabled
* Hit "Build Project"
* The code does not compile because IDEA doesn't see the configured compiler plugins
* The same code compiles fine from CLI
  ```bash
  sbt cleanFull compile
  ```

Do the same for the `sbt-1-project` and see that sbt 1 integration doesn't have the same issue.

Tested on:

* JDK: 17
* OS: macOS 15.7.4
* PC: M1 MBP
* IntelliJ IDEA
  ```
  IntelliJ IDEA 2026.2.1
  Build #IU-262.9437.185, built on August 9, 2026
  ```
* IDEA Scala plugin: 2026.2.16
