# ACTSConnect Backend

This repository contains a standalone Spring Boot backend component associated with ACTSConnect, a student/alumni networking application.

> **Repository status — 22 October 2026:** the last observed push to this repository was 30 August 2024. No GitHub Actions runs or GitHub releases were found. This copy has not been verified as equivalent to `acts-connect-backend/` in the [primary ACTSConnect repository](https://github.com/shreyashjagtap157/ACTSConnect).

## Technology

The checked-in Maven manifest identifies:

- Java 17.
- Spring Boot 3.3.2.
- Spring Web and Spring Data JPA.
- MySQL Connector/J.
- Spring Security and JWT-related libraries.
- H2 and Spring Boot testing dependencies.

The Maven manifest is the source of truth for actual dependencies.

## Prerequisites

- JDK 17.
- The checked-in Maven wrapper.
- A configured database for integration/runtime tests.

## Build and test

Linux/macOS:

```bash
./mvnw verify
```

Windows PowerShell:

```powershell
.`mvnw.cmd` verify
```

Use local, untracked configuration for database credentials, JWT signing material and other secrets. Never commit production credentials or reuse secrets from logs or examples.

## Maintenance status and next steps

1. Compare this repository with `ACTSConnect/acts-connect-backend/` and establish the canonical backend source.
2. Run Maven verification against the supported JDK and repair any failing tests before deployment.
3. Test authentication, authorization, password handling, JWT expiry/validation, database access and API input validation.
4. Add CI for the Maven wrapper, compilation, unit/integration tests and dependency-security checks.
5. Keep API contracts and deployment/setup instructions aligned with the chosen frontend repository.

No production deployment was independently verified during the repository audit. Repository age and the absence of CI do not prove that a previous deployment is offline; they mean that current build and deployment status still need evidence.

## License

Review the repository's license and dependency terms before redistribution.
