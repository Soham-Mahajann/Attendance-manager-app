# 📱 Attendance Manager App

A team-developed Android application designed to simplify **student attendance management and tracking**.

The application allows users to select their academic details, manage attendance records, and view attendance results through a simple Android interface with graphical visualization.

---

## 🚀 Overview

Managing attendance across different subjects, academic years, divisions, and departments can become difficult when handled manually.

The **Attendance Manager App** provides a mobile-based solution for organizing attendance information and presenting the results in an easy-to-understand format.

This project was developed as a **team-based academic project**.

---

## ✨ Features

- 📚 Department and academic year selection
- 🏫 Division-based organization
- 📝 Attendance recording and management
- 📊 Attendance result calculation
- 📈 Graphical attendance visualization
- 📱 Android-based user interface
- 🎨 Material Design components
- 🔄 Navigation between different stages of attendance management

---

## 🛠️ Tech Stack

- **Java** — Application development
- **Android** — Mobile application platform
- **Android SDK 34** — Compile and target SDK
- **AndroidX** — Android application components
- **Material Components** — UI components
- **ConstraintLayout** — UI layout
- **MPAndroidChart** — Attendance data visualization
- **Gradle** — Build and dependency management

---

## 🏗️ Project Structure

```text
Attendance-manager-app/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/okay/
│           │       ├── start.java
│           │       ├── department.java
│           │       ├── year.java
│           │       ├── Division.java
│           │       ├── attendance.java
│           │       └── result.java
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── layout/
│           │   ├── font/
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── gradle/
│   └── wrapper/
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
└── gradlew.bat
