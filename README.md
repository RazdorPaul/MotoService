# MotoService

[![CI](https://github.com/RazdorPaul/MotoService/actions/workflows/build.yml/badge.svg)](https://github.com/RazdorPaul/MotoService/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=RazdorPaul_MotoService&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=RazdorPaul_MotoService)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=RazdorPaul_MotoService&metric=coverage)](https://sonarcloud.io/summary/new_code?id=RazdorPaul_MotoService)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-green.svg)](https://spring.io/projects/spring-boot)

Веб-приложение для управления мото-прокатом и сервисом.

## Стек технологий
* Java 21
* Spring Boot (Web, Data JPA)
* PostgreSQL
* Gradle (Kotlin DSL)
* Lombok, Checkstyle, JaCoCo
* SonarQube

## Запуск локально

1. Убедитесь, что PostgreSQL запущен и создана база данных.
2. Создайте файл `.env` в корне проекта и заполните параметры подключения (хост, порт, имя БД, логин и пароль).
3. Запустите приложение:
   ```bash
   make run