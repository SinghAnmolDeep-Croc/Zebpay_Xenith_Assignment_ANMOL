# Android Project Template

Architecture followed-> Clean& MVVM blend with modularisation.

This Android project follows modern development practices using **Jetpack Compose**, **Kotlin**, and **Modular Architecture**. The project is configured with the latest stable versions of key libraries and tools, enabling rapid development with high maintainability.

## 🛠 Tech Stack

- **Kotlin 2.0.0**
- **Jetpack Compose BOM 2025.06.01**
- **Android Gradle Plugin 8.7.3**
- **Koin for Dependency Injection**
- **Ktor for Networking**
- **Coil for Image Loading**
- **Firebase Integration (Analytics, Messaging, Crashlytics)**
- **Paging 3 for infinite list/data loading**
- **Kotlinx Serialization for JSON Parsing**

---

## 📦 Modules / Libraries

| Library                             | Purpose                                             |
|-------------------------------------|-----------------------------------------------------|
| `androidx.core:core-ktx`            | Kotlin extensions for Android core APIs             |
| `androidx.lifecycle:lifecycle-runtime-ktx` | Lifecycle-aware components                  |
| `androidx.activity:activity-compose`| Compose integration with Activity                   |
| `androidx.compose:*`                | UI development with Jetpack Compose                 |
| `org.jetbrains.kotlinx:kotlinx-serialization-json` | JSON serialization with Kotlin               |
| `io.ktor:*`                         | Networking (client, serialization, logging)         |
| `io.insert-koin:*`                  | Dependency injection framework                      |
| `io.coil-kt:coil-compose`          | Image loading in Compose                            |
| `androidx.paging:*`                | Efficient pagination support                        |
| `androidx.compose.ui:ui-text-google-fonts` | Google Fonts in Compose Material3            |
| `com.google.firebase:*`           | Firebase services like Analytics, Messaging, etc.   |

---

## 🔌 Plugins

- `com.android.application`
- `org.jetbrains.kotlin.android`
- `org.jetbrains.kotlin.plugin.compose`

---

## ✅ Testing

- `junit:junit:4.13.2` for unit testing
- `androidx.test.ext:junit` and `espresso-core` for Android instrumentation tests
- `compose.ui:ui-test-junit4` for UI testing in Compose

---

## 🔥 Firebase Support

Firebase BOM version `33.16.0` is used to align Firebase dependencies:
- Core
- Messaging
- Crashlytics
- Analytics

---

## 📂 Version Catalog

All dependencies are managed using a centralized `libs.versions.toml` file, ensuring maintainability and easy upgrades. Example:

```toml
[versions]
kotlin = "2.0.0"
composeBom = "2025.06.01"
coil-version = "2.7.0"
ktor-version = "2.2.4"
...
