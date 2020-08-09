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


## Below are the implemented design patterns
- [Strategy Pattern](StrategyPattern)
- [Observer Pattern](ObserverPattern)