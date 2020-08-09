# Observer Pattern

###  **The Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
  
> Did you notice last 2 words of above defination "updated automatically", we will see what it really means. Actually there are 2 types of implementation of observer pattern that I am actually implementing here (Push and Pull). Here you will see how these 2 words mean different for each of them.
  
  
The basic idea of this pattern is based on loose coupling.
  
When 2 objects are loosely coupled they can interact, but have very little knowledge of each other.
  
The observer pattern provides an object design, where subjects and observers are loosely coupled.
  
- The only thing that subject knows about an observer is that it implements a certain interface (the Observer interface).
- We can add/remove observers at any time
- We never need to modify Subject to add new types of Observers. The subject will deliver informationas long as the observer implements the Observer Interface.
- We can re-use subjects and Observers independently of each other.
- Changes to either the subject or an observer will not affect the other.
  
Now lets look at the 2 different types of observer patterns:  