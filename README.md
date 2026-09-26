# 🌸 OvaCare -Period Tracker Dashboard

OvaCare is a responsive, lightweight web-based health application designed to simplify the monitoring of menstrual health parameters. Built as a 3rd-year engineering mini-project, it features dynamic calculations for predicting upcoming cycle phases and estimating fertility windows, paired with local database persistence to ensure secure, offline data management.

## 🚀 Key Features

* **Deterministic Cycle Predictions:** Automatically estimates the exact start date of the next cycle based on historical user metrics.
* **Fertile Window Computation:** Calculates estimated ovulation and fertile windows using precise time-manipulation heuristics.
* **Zero-Latency Local Storage:** Utilizes browser `LocalStorage` to save cycle history logs locally, preventing data loss across page refreshes without needing heavy server overhead.
* **Contextual Wellness Engine:** Displays real-time, context-aware behavioral insights covering hydration, diet, and light exercise.
* **Fluid Responsive UI:** Designed with modern CSS Grid and Flexbox web structural paradigms to adapt seamlessly across mobile, tablet, and desktop screens.
* **Scalable Architecture:** Structured folder footprint that integrates a pre-configured Spring Boot boilerplate for future centralized backend database pipelines.

## 🛠️ Tech Stack & Architecture

* **Frontend:** HTML5, Modern CSS3 (CSS Variables, Flexbox, Grid), JavaScript (ES6+ Vanilla Engine)
* **Storage Component:** Browser Native LocalStorage API
* **Backend Skeleton Pipeline:** Java 17/21, Spring Boot Framework

## 📂 Repository Directory Layout

```text
OvaCare-Period-Tracker/
└── demo/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/example/demo/
    │   │   │   │   ├── DemoApplication.java       # Main Server Switch
    │   │   │   │   └── TrackerController.java     # Scalable REST API Architecture
    │   │   └── resources/
    │   │       ├── application.properties         # Server Configuration Profile
    │   │       └── static/
    │   │           └── index.html                 # Core Frontend Dashboard Engine
    └── pom.xml                                    # Maven Dependency Controller
```

## 🧠 Algorithmic Execution Workflow

1. **Cycle Math:** The system processes the input base date string and parses it into native JavaScript `Date` vectors.
2. **Next Period Prediction:** Computed deterministically via `Next Cycle = Last Start Date + Average Cycle Length`.
3. **Ovulation Timeline:** The peak ovulation milestone is pinpointed using standard biological heuristics: `Ovulation Day = Next Period Date - 14 Days`.
4. **Fertile Phase Boundary:** Boundaries are mapped relative to the ovulation instance:
   * *Fertile Start Window:* `Ovulation Day - 5 Days`
   * *Fertile End Window:* `Ovulation Day + 1 Day`

## 🔮 Future Enhancement Scope

* **Centralized Data Synchronization:** Linking the active frontend logic to the existing Spring Boot REST mapping (`TrackerController.java`) to sync inputs with secure MySQL or PostgreSQL remote tables.
* **Predictive Machine Learning Tilt:** Integrating regression pipelines to handle highly irregular cycles and dynamically increase tracking precision over long-term operations.
* **Automated Communication Matrix:** Embedding alert channels through JavaMail API or SMS framework gateways to trigger notifications 2-3 days before phase shifts.

---
Developed as a 3rd Year Web Engineering Mini Project.
