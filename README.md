# Demonstrator for an IntelliJ IDEA sbt 2 integration bug

Steps to reproduce:

* Import `sbt-2-project` into IDEA with sbt shell for builds disabled
<img width="275" height="93" alt="Screenshot 2026-08-19 at 12 02 50" src="https://github.com/user-attachments/assets/b23a36e2-09a1-4681-8fb6-b4470db15169" />

* Hit "Build Project"
* The code does not compile because IDEA doesn't see the configured compiler plugins
<img width="1324" height="760" alt="Screenshot 2026-08-19 at 12 03 36" src="https://github.com/user-attachments/assets/53e98c46-900f-4f07-913d-40f515709b4b" />

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
