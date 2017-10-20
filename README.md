# immutable-person

This lesson is all about immutability. Immutable classes are ones that you can instantiate, but cannot change afterwards.

Read whatever you find on immutability and try to answer following questions:
- How to make an existing class immutable?
- When is immutability useful?

Your coding task would be to make Person class immutable.
Person class has to contain following fields:
- name
- height (in inches)
- birth date

After creation of a Person object, caller code should be able to read all the values of fields above.
Caller shouldn't be able to modify the Person object after instantiation.

When the task is finished - provide changes for the review. Reviewer should try all possible ways to modify object 'two' inside PersonTest, so that it fails.

Topics involved:
- 'final' keyword
- acess modifiers
- inheritance
- object references
- marker interfaces (Serializable)
