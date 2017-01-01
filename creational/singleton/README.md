Singleton
===

- Singleton is a design pattern that restricts instantiation of a class to an object.
- Useful when only when one instance of object is required throughout the system.
- Some systems work efficiently when only one instance of a class exists.
    - This however can have negative effects.
    - Sometimes its better to have multiple instances than one.
- It can be used to store configuration or state in one place.
- It is a better alternative to global variables as they pollute global namepace.
- It can be lazily allocated and initialized.
- Only one instance of Singleton class should exist.
- The instance should be globally accessible.
