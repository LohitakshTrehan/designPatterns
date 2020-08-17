# Design Patterns

## Design Principles
- Identify the aspect of your application that vary, and seprate them from what stays the same
    - What it means is that we should seprate the behaviours that keep on varying, and implement them seprately
- Program to an interface (or a supertype), not an implementation
    - What this means is that we should not hardcode implementation for a specific class, rather implement it using an interface
- Favor composition (HAS-A) over inheritence (IS-A)
    - Helps in changing behaviour during runtime
- Strive for loosely coupled designs between objects that interact
    - Loosely coupled designs allow us to build flexible Object Oriented (OO) systems that can handle change because they minimize the interdependency between objects.
- Classes should be open for extension, but closed for modification.
    - Our goal should be to allow classes extend easily so as to incorporate any new behavior, without modifying the existing code. It is also called the open-closed principle. *`Be careful when choosing the areas of code that need to be extended; applying the open-closed principle "everywhere" is wasteful and unnecessary, and can lead to complex, hard-to-understand code.`*


## Below are the implemented design patterns
- [Strategy Pattern](StrategyPattern/notes.md)
- [Observer Pattern](ObserverPattern/notes.md)
- [Decorator Pattern](DecoratorPattern/notes.md)
- [Factory Pattern](FactoryPattern/notes.md)