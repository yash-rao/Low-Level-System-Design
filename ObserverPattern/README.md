# 🧠 Observer Pattern (Low-Level System Design)

This project demonstrates the **Observer Design Pattern** in Java, where observers subscribe to a subject and are notified when its state changes.

---

## 📊 UML Diagram

<p align="center">
  <img src="./UML_Diagram_Observer%20Pattern.png" alt="Observer Pattern UML Diagram" width="900">
</p>

---

## 🧩 Class Structure

| Role | Class / Interface | Description |
|------|------------------|-------------|
| **Subject (Observable)** | `StockObservable`, `IphoneStocksObservable` | Holds observers and notifies on state change |
| **Observer** | `NotificationAlertObserver` | Defines `update()` |
| **Concrete Observers** | `EmailAlertObserver`, `MessageAlertObserver` | React to updates |
| **Client** | `Main` | Wires everything and changes stock |

---

## 📂 Project Layout

