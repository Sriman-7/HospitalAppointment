# 🏥 Hospital Appointment System

![Java](https://img.shields.io/badge/Language-Java-orange)
![Platform](https://img.shields.io/badge/Platform-Console-blue)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-Educational-lightgrey)

---

## 📌 Project Description

The **Hospital Appointment System** is a Java-based console application that efficiently manages patient appointments using a **Priority Queue**.

Patients are attended based on the urgency of their condition, ensuring that critical cases are handled first.

---

## 🎯 Objectives

* To simulate real-world hospital appointment scheduling
* To implement **priority-based patient handling**
* To demonstrate usage of **Java Collections Framework**
* To apply **Object-Oriented Programming (OOP)** concepts

---

## 🚀 Features

* ✅ Add patient details (Name, Age, Disease, Priority)
* ✅ Automatically sort patients based on priority
* ✅ Call the next patient (highest priority first)
* ✅ View all patients in the queue
* ✅ Menu-driven interactive system

---

## 🧠 Technologies Used

* **Java**
* `PriorityQueue`
* `Comparable Interface`
* `Scanner Class`

---

## 📂 Project Structure

```id="code1"
HospitalAppointment.java

├── Patient Class
│   ├── Attributes: name, age, disease, priority
│   ├── compareTo() → Priority sorting logic
│   └── toString() → Display format
│
└── HospitalAppointment Class
    ├── Menu system
    ├── Queue operations
    └── User interaction
```

---

## ⚙️ Working Principle

* Patients are stored in a **Priority Queue (Min Heap)**
* Priority values:

  * `1 → High`
  * `2 → Medium`
  * `3 → Low`
* The system always processes the patient with the **lowest priority number first**

---

## 🔄 Flow of Execution

1. Start the program
2. Display menu
3. User selects an option
4. Perform action:

   * Add Patient → Insert into queue
   * Call Patient → Remove highest priority
   * View Patients → Display queue
5. Repeat until exit

---

## 💻 How to Run

### 🔧 Prerequisites

* Java JDK 8 or higher
* Terminal / Command Prompt / IDE

### ▶️ Steps

```bash id="code2"
# Compile the program
javac HospitalAppointment.java

# Run the program
java HospitalAppointment
```

---

## 🖥️ Sample Output

```id="code3"
--- Hospital Appointment System ---
1. Add Patient
2. Call Next Patient
3. View All Patients
4. Exit

Enter choice: 1
Enter Name: Ravi
Enter Age: 50
Enter Disease: Fever
Enter Priority (1-High, 2-Medium, 3-Low): 1

Patient Added!
```

---

## 📊 Core Logic

```java id="code4"
public int compareTo(Patient p)
{
    return this.priority - p.priority;
}
```

➡ Ensures **higher priority patients are treated first**

---

## ⚠️ Important Notes

* The `PriorityQueue` does NOT display elements in sorted order when printed
* It only guarantees correct order during removal (`poll()`)
* Lower priority value = higher importance

---

## 🔮 Future Enhancements

* 🖥️ GUI using Java Swing / JavaFX
* 🗄️ Database integration (MySQL)
* 👨‍⚕️ Doctor assignment module
* 📜 Patient history tracking
* 🌐 Web-based version

---

## 🤝 Contribution Guidelines

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Make your changes
4. Submit a Pull Request

---

## 🛠️ Author

**Sri Man**
📌 GitHub:https://github.com/Sriman-7

---

## 📄 License

This project is created for **educational purposes**.
You are free to use and modify it.

---

## ⭐ Acknowledgement

* Java Documentation
* Data Structures concepts
* Academic learning resources

---
