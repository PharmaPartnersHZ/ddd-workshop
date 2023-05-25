# DDD-workshop

## Getting started

Just clone the ddd-workshop repository and import the project in your IDE. 

## Topics covered in the workshop

- Entities
- ValueObjects
- Domain events
- Domain service
- Implementing policies
- Layered architecture
- Repositories
- Ubiquitous language

## Assignments
For some of these assignments below there are TODO's in the project. You can see them in the TODO list in your IDE or simply search for them using 'TODO'

1. Learn about the differences between ValueObjects and Entities. You can use [this website](https://blog.jannikwempe.com/domain-driven-design-entities-value-objects#heading-building-blocks-of-ddd) or [this one](https://afedyanin.wordpress.com/2016/04/27/ddd-tactical-design-patterns/). Or just Google it.
2. Now that you know the differences put the correct annotation on each class in the model package of the project.
3. Given the outcome of the event storm, in which we determined our ubiquitous language, apply the proper names to the methods in the domain service and repository.
4. In the application in its current state, data is stored in a H2 (in-memory) database. What would happen when the data should be written to another database (e.g. mongodb)? How would this affect our code? Would the domain layer change? And what about the infrastructure layer?
5. Apply the business logic for the BSN. See the policy sticky notes (purple) in the event storm picture. Ensure that all the logic is implemented in the domain package and all corresponding unit tests (in BurgerServiceNummerTest.java) pass.
6. Apply the business logic for Naam. Ensure that all the logic is implemented in the domain package and all corresponding unit tests (in NaamTest.java) pass.
7. Optional: Add a tussenvoegsel in the Naam and ensure that this can be stored in the database
8. Optional: When a General Practitioner wants to 'delete' a patient from his/her active patient base, how could this be implemented? What methods would be needed. And are changes in the db needed? You can apply this in the application if you want.
