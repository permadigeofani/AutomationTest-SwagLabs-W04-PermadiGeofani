#   Automation Testing SwagLabs

This is an automation testing project for the [Swag Labs](https://www.saucedemo.com/) website using **Java**, **Selenium WebDriver**, **Cucumber BDD**, **TestNG** and **ExtentReports**.

---

## 📄 Test Scenario & Test Case

You can view the detailed test scenarios documented in the following Google Sheet:

📋 [SwagLabs Test Scenarios Documentation](https://docs.google.com/spreadsheets/d/1JpxsmvGMyZcny0N8Kau3MOHCyKq9s5ho3bI4Lw4JqGw/edit?usp=sharing)

---

## ⚙️ How to Run the Project

### 1. Clone the Repository

Clone this repository to your local machine:

```bash
git clone git@github.com:permadigeofani/SwagLabs-Automation-Testing-.git
cd SwagLabs-Automation-Testing-
```
---
### 2. Run the Tests
Run all automated test scenarios using the command below:
```bash
mvn test
```
---
### 3. View the Test Report
After test execution, the HTML report is generated here:
```bash
reports/extent-report.html
```
You can open this file in your browser to view the detailed test results.

### ♻️ Test Features
```bash
Login with valid and invalid credentials

Add products to the cart

Continue shopping
```

---
### 📄 Tech Stack
```bash
Java: Main programming language

Selenium WebDriver: Web UI automation tool

Cucumber: BDD framework for writing test scenarios

TestNG: Test runner for managing test execution flow

ExtentReports: HTML reporting library

Maven: Project build and dependency management tool
```
