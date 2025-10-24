# 🧠 Observer Pattern (Low-Level System Design)

This project demonstrates the **Observer Design Pattern** implementation in Java — where multiple observers subscribe to an observable (subject) and are automatically notified when the subject’s state changes.

---

## 📘 Overview

The **Observer Pattern** is a **behavioral design pattern** that defines a **one-to-many dependency** between objects.  
When one object (the **Subject**) changes its state, all its dependents (**Observers**) are notified automatically.

**Example Scenario:**  
When the stock of iPhones becomes available again, all users subscribed to stock alerts receive notifications via email or message.

---

## 🧩 Class Structure

### Key Components

| Role | Class / Interface | Description |
|------|------------------|--------------|
| **Subject (Observable)** | `StockObservable`, `IphoneStocksObservable` | Maintains list of observers and notifies them on state change |
| **Observer** | `NotificationAlertObserver` | Defines the update() interface to receive notifications |
| **Concrete Observers** | `EmailAlertObserver`, `MessageAlertObserver` | Receive and display updates |
| **Client** | `Main` | Demonstrates adding observers and changing stock state |

---

## 🧱 Project Structure

