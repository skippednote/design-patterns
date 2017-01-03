Observer
===

- Observer pattern defines one to many dependency between objects.
    - When one object updates the other dependent objects are notified and updated automatically.
- Observer pattern can be push or pull based.
    - In push based Observer, the Subject gets updated and notifies the Observers.
    - In pull based Observer, the Subject gets updated by one of the Observers and rest get notified.
- Observer is used to implement distributed event handling systems.
    - Also used when implementing MVC pattern, Model can be the Subject and views being the observers.
- Observer pattern implements Subject and Observers.
- Subject
    - Subject is an independent abstraction.
    - Subject has a collection of dependents called Observers.
    - On state change Subject notifies the collection of dependents.
    - On state change Subject notifies the dependents by calling `updated` method on them.
    - Subject can unregister it's dependent observers.
        - This can lead to memory leaks as observers need to be explicitly unregisterd.
- Observer
    - Observer is an dependent abstraction (on Subject).
    - Observer is added to the Subject so it can be notified on change.
    - Everytime the Subject's state updates it loops through the collection of it's observer and calls the update method on each of them.
        - `update` method on Observer updates the state of the observer.