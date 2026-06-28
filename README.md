# 📖 TRACK SHELF

> **A modern inventory and sales management application for bookshops and stationery stores, built with Jetpack Compose.**

---

# Overview

**TrackShelf** is a clean, offline-first Android application designed to simplify inventory management for independent bookshops, school bookstores, stationery shops, and office supply retailers.

The name **Track Shelf** combines **Ink** (representing books, writing, and stationery) with **Inventory**, reflecting the application's core purpose.

Rather than being a complex ERP system with dozens of unnecessary modules, Track Shelf focuses on helping store owners answer the questions they ask every day:

* How much stock do I have?
* Which products are running low?
* What sold today?
* How much is my inventory worth?
* Which products need restocking?

Built entirely using **Jetpack Compose**, the application emphasizes simplicity, speed, and maintainability while following modern Android development best practices.

---

# Vision

To create a fast, intuitive, and reliable inventory management solution tailored specifically for bookshops and stationery businesses, empowering owners to spend less time managing stock and more time serving customers.

---

# Core Principles

Track Shelf is built around five guiding principles:

* **Simple** — Easy to learn and use.
* **Modern** — Built with the latest Android technologies.
* **Offline First** — Works without an internet connection.
* **Scalable** — Easy to extend with additional features.
* **Reliable** — Data remains safe and consistent.

---

# Key Features

## 📊 Dashboard

The dashboard provides a snapshot of the business.

### Overview Cards

* Total Products
* Products Running Low
* Today's Sales
* Total Inventory Value

### Activity Feed

Recent actions including:

* Products added
* Products updated
* Recent sales
* Stock changes

---

## 📚 Inventory Management

Maintain a complete catalog of books and stationery items.

### Product Information

Each product includes:

* Product Name
* Category
* SKU (optional)
* Barcode (optional)
* Buying Price
* Selling Price
* Quantity
* Minimum Stock Level
* Shelf Location
* Notes

Supported categories include:

* Books
* Exercise Books
* Writing Materials
* Office Supplies
* Art Supplies
* Educational Resources
* School Bags
* Accessories

---

## 🛍 Sales Management

Record sales with minimal effort.

Sales automatically:

* Reduce stock quantity
* Record transaction history
* Update dashboard statistics

Each sale stores:

* Product
* Quantity
* Selling Price
* Date
* Time

---

## 📈 Reports

Generate quick business insights.

Reports include:

* Inventory Summary
* Total Sales
* Inventory Value
* Low Stock Report
* Best Selling Products

---

## 🔎 Product Search

Instantly search products using:

* Product Name
* Category
* Barcode
* SKU

---

## ⚠ Stock Alerts

Products below their minimum quantity are automatically highlighted.

The dashboard also displays:

> "5 products require restocking."

---

## ⚙ Settings

Configure:

* Theme
* Currency
* Low Stock Threshold
* Backup Preferences
* About Application

---

# Planned Features

Future versions may introduce:

* Barcode Scanner
* Product Images
* Supplier Management
* Customer Management
* Purchase Orders
* Receipt Printing
* Cloud Synchronization
* Data Export
* User Accounts
* Multi-store Support

---

# Technology Stack

## User Interface

* Jetpack Compose
* Material Design 3
* Navigation Compose

---

## Architecture

* MVVM
* Clean Architecture
* Repository Pattern
* Unidirectional Data Flow

---

## Dependency Injection

* Hilt

---

## Local Storage

* Room Database
* DataStore

---

## Asynchronous Programming

* Kotlin Coroutines
* Kotlin Flow
* StateFlow

---

## Image Loading

* Coil

---

## Build System

* Gradle Kotlin DSL

---

# Project Structure

```text
app
│
├── core
│   ├── common
│   ├── database
│   ├── datastore
│   ├── navigation
│   ├── ui
│   ├── designsystem
│   ├── util
│   └── extensions
│
├── data
│   ├── local
│   │   ├── dao
│   │   ├── entity
│   │   └── database
│   │
│   ├── mapper
│   └── repository
│
├── domain
│   ├── model
│   ├── repository
│   └── usecase
│
├── feature
│   ├── dashboard
│   ├── inventory
│   ├── sales
│   ├── reports
│   ├── settings
│   └── onboarding
│
├── di
│
├── navigation
│
├── MainActivity.kt
│
└── TrackShelfApplication.kt
```

---

# Package Structure

```text
com.example.TrackShelf

├── core
├── data
├── domain
├── feature
├── navigation
├── di
└── ui
```

---

# Navigation Flow

```text
Splash

↓

Home

├── Dashboard
├── Inventory
├── Sales
├── Reports
└── Settings
```

Bottom navigation provides quick access to the application's primary features.

---

# Database Schema

## Product

```text
Product

id
name
category
sku
barcode
buyPrice
sellPrice
quantity
minimumStock
location
notes
createdAt
updatedAt
```

---

## Sale

```text
Sale

id
productId
quantity
unitPrice
totalPrice
timestamp
```

---

# User Interface

TrackShelf follows a clean Material Design 3 aesthetic.

## Design Goals

* Minimalist layout
* Spacious cards
* Rounded components
* Consistent spacing
* Responsive design
* Accessibility support
* Smooth transitions

---

# Theme

## Light Mode

Bright, clean interface designed for daytime use.

## Dark Mode

Comfortable viewing for low-light environments.

Supports dynamic Material You colors on compatible Android devices.

---

# Development Philosophy

Every feature should solve a real business problem.

When implementing new functionality, consider:

* Does it reduce manual work?
* Does it improve efficiency?
* Does it make inventory easier to understand?
* Does it keep the interface uncluttered?

If not, the feature should be reconsidered or postponed.

---

# Application Workflow

```text
Launch App

↓

Dashboard

↓

Inventory

↓

Select Product

↓

Update Stock

↓

Record Sale

↓

Reports Updated Automatically
```

---

# Recommended Development Order

## Phase 1

* Project setup
* Navigation
* Material Theme
* Room Database

---

## Phase 2

* Inventory Module
* CRUD Operations
* Search
* Validation

---

## Phase 3

* Sales Module
* Automatic Stock Updates
* Dashboard Statistics

---

## Phase 4

* Reports
* Settings
* Polishing
* Testing

---

# Code Style

The project follows:

* Official Kotlin Style Guide
* Feature-based modular organization
* Immutable UI state
* Single Responsibility Principle
* Reusable Compose components
* Stateless composables where possible
* Clear naming conventions

---

# Testing Strategy

The application should include:

* Unit Tests
* ViewModel Tests
* Repository Tests
* Room Database Tests
* UI Tests for Compose
* Navigation Tests

---

# Roadmap

## Version 1.0

* Dashboard
* Inventory Management
* Sales Recording
* Reports
* Search
* Settings

---

## Version 1.5

* Barcode Support
* Product Images
* Product Sorting
* Filtering

---

## Version 2.0

* Supplier Management
* Customer Profiles
* Purchase Orders
* Receipt Printing

---

## Version 3.0

* Cloud Backup
* Multi-device Sync
* Analytics Dashboard
* Business Insights

---

# Contributing

Contributions are welcome.

Before submitting changes:

* Follow the existing architecture.
* Keep composables reusable.
* Write descriptive commit messages.
* Include tests for new functionality.
* Document significant changes.

---

# License

This project is licensed under the MIT License.

---

# Final Notes

TrackShelf is more than an inventory tracker. It is a focused productivity tool designed specifically for businesses that sell books and stationery. By combining an intuitive user experience with modern Android architecture, the project demonstrates how thoughtful software design can simplify everyday retail operations while remaining easy to maintain, extend, and scale.
