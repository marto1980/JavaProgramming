# Handover Document: Java Programming Course (OpenBSD Edition)

## 1. Project Overview & Context
Welcome to the Java Programming Course project! This repository serves as a learning environment focused on mastering Backend development using modern Java. 

**Core Objective:** Build a solid foundation in Java, transitioning from basic syntax to complex Design Patterns and Enterprise architectures. A key aspect of this project is framing Java concepts using "Frontend-to-Backend" analogies (e.g., comparing TypeScript interfaces to Java interfaces).

## 2. Technology Stack & Environment
- **Language:** OpenJDK 25 (LTS)
- **Build Tool:** Apache Maven
- **OS Environment:** OpenBSD 7.x (Strictly enforced)
- **Editor:** Neovim (LazyVim) with `nvim-jdtls` and `sonarlint.nvim`
- **Testing Frameworks:** JUnit 5, AssertJ, and Mockito

## 3. Current State of the Codebase
The project is currently in its very early, experimental stages:
- `avante.md`: Contains the core architectural guidelines, agent instructions, and OpenBSD specifics.
- `README.md`: Basic initialization.
- `Planet.java` & `Country.java`: Initial experimental Java classes currently located in the root directory. `Planet.java` contains a basic `main` method printing to standard output.

**Immediate Technical Debt / Action Item:** The current `.java` files reside in the project root. To comply with our required Maven standards, these must be migrated to a proper package structure under `src/main/java/` (e.g., `src/main/java/com/marto/course/...`).

## 4. Coding Standards & Best Practices
- **Style Guide:** Adhere strictly to the Google Java Style Guide.
- **Naming Conventions:** Standard Java CamelCase (Classes: `PascalCase`, Methods/Variables: `camelCase`).
- **Modern Java Features:** 
  - Utilize Java 25 features heavily (Records, Pattern Matching, Virtual Threads).
  - Prefer `var` for local variable declarations where the type is obvious.
  - Use `record` instead of `class` for simple Data Transfer Objects (DTOs) to enforce immutability.
- **Documentation:** Use Javadoc (`/** ... */`) for all public classes and methods.
- **Quality Gates:** Code must pass SonarLint and Checkstyle rules.
- **Architecture:** 
  - Strictly follow SOLID principles.
  - Organize code by feature/package.
  - Maintain a clear separation of concerns: logic in Service classes, data in Models/Records.

## 5. OpenBSD Specifics & Security (CRITICAL)
This project is strictly bound to the OpenBSD ecosystem. You must adhere to the following constraints:
- **Java Path:** Always assume the Java binary is located at `/usr/local/jdk-25/bin/java`.
- **Package Management:** Never suggest installing binaries via arbitrary web scripts like `curl | bash` (e.g., SDKMAN). Always prefer OpenBSD's native `pkg_add` or manual source builds.
- **Permissions:** Respect OpenBSD's strict memory protections (W^X) and file system hierarchies.
- **Shell Commands:** Ensure any suggested shell commands are fully compatible with OpenBSD's `ksh` or `bash`, and use `doas` instead of `sudo` for privilege escalation.

## 6. Guidance for Subsequent Developers/Agents
When contributing to this project:
1. **Analyze First:** Always check the existing configurations and OpenBSD constraints before introducing new dependencies or structural changes.
2. **Teach via Analogy:** When explaining architectural concepts or design patterns, leverage the user's background by comparing them to TypeScript/React functional patterns.
3. **Refactor to Standard:** Prioritize setting up the standard Maven directory structure (`src/main/java` and `src/test/java`) and moving existing code into appropriate packages.