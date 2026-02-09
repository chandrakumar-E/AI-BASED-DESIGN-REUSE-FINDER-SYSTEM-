# AI-Based Design Reuse Opportunity Finder for PLM Systems

## 1. Project Overview
Product Lifecycle Management (PLM) systems such as Siemens Teamcenter store vast amounts of historical design data including CAD metadata, BOMs, specifications, and engineering descriptions. However, most PLM systems lack intelligent mechanisms to automatically identify reusable legacy designs. Engineers often redesign components that already exist, leading to increased development time, cost, and redundancy.

This project proposes an **AI-based Design Reuse Opportunity Finder** that analyzes PLM data using Natural Language Processing (NLP) and Machine Learning (ML) techniques to identify and recommend reusable mechanical component designs. The system is developed as a **Teamcenter-compatible, industry-simulated solution** suitable for academic and enterprise demonstration.

---

## 2. Problem Statement
Existing PLM systems store large volumes of legacy mechanical design data but lack intelligent capabilities to automatically identify reusable designs. This results in redundant engineering effort, increased product development cost, and longer design cycles.

---

## 3. Objectives
- To design a PLM-compatible data model representing Items, Revisions, BOMs, and metadata.
- To develop an AI engine that analyzes textual and attribute-based design data.
- To identify and recommend reusable mechanical components using similarity analysis.
- To simulate Teamcenter integration using REST-based backend services.
- To deploy the system using containerized (Docker) architecture.

---

## 4. Scope of the Project
- Focuses on **mechanical component design reuse**
- Uses **metadata and textual descriptions**, not direct CAD geometry
- Simulates Teamcenter integration (no licensed Teamcenter required)
- Suitable for academic, demonstration, and proof-of-concept purposes

---

## 5. System Architecture

Frontend (Streamlit UI)
        |
Spring Boot Backend (PLM Layer & APIs)
        |
Python AI Engine (NLP + ML Similarity)
        |
PostgreSQL Database (PLM Metadata)

---

## 6. Technology Stack

### Backend
- Java 17
- Spring Boot
- RESTful APIs
- Hibernate / JPA

### AI & Machine Learning
- Python 3
- TF-IDF Vectorization
- Sentence-BERT Embeddings
- Cosine Similarity
- scikit-learn

### Database
- PostgreSQL

### Frontend
- JavaScript (ReactJS)

### Deployment & DevOps
- Docker
- Docker Compose

### Tools
- Git & GitHub
- IntelliJ IDEA
- Postman

---

## 7. AI Methodology
- Textual design descriptions are preprocessed using NLP techniques.
- TF-IDF and sentence embeddings are generated.
- Cosine similarity is used to compute similarity scores.
- Components with similarity above a defined threshold are recommended as reuse candidates.

---

## 8. Teamcenter Integration Approach
- Uses a **PLM-compatible data schema** (Item, Item Revision, BOM).
- REST APIs simulate Teamcenter SOA/REST services.
- Designed to be extendable to real Teamcenter Active Workspace or SOA APIs in industry environments.

---

## 9. Deployment Strategy
- Each module (Backend, AI Engine, Database, Frontend) runs in a separate Docker container.
- Docker Compose orchestrates service communication.
- Enables easy setup, scalability, and portability.

---

## 10. Expected Outcomes
- Reduction in redundant mechanical design effort.
- Faster design decision-making using AI recommendations.
- Improved reuse of legacy design knowledge.
- Demonstration of AI integration in PLM systems.

---

## 11. Academic & Industry Relevance
- Aligns with Mechanical Engineering, PLM, and AI domains.
- Reflects real-world enterprise architecture used in companies like Capgemini.
- Suitable for final-year project evaluation, viva, and interviews.

---

## 12. Future Enhancements
- Integration with real Teamcenter SOA APIs
- CAD geometry-based similarity analysis
- Deep learning-based ranking models
- Cost and manufacturability-aware reuse recommendations

---

## 13. Authors
Final Year Mechanical Engineering Students  
Specialization: PLM & AI Integration

---

## 14. License
This project is developed for academic purposes.
