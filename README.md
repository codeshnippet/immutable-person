# immutable-person

This lesson is all about immutability. Immutable classes are ones that you can instantiate, but cannot change afterwards.

== Preparation ==

Read whatever you find on immutability and try to answer following questions:
- How to make an existing class immutable?
- When is immutability useful?

== Coding task ==

Your coding task is be to make Person class immutable.
Begin with cloning this repo:

`git clone https://github.com/codeshnippet/immutable-person.git`

Person class has to contain following fields:
- name
- height (in inches)
- birth date

Person should have following methods:
- change name to upper case

After creation of a Person object, caller code should be able to read all the values of fields above.
Caller shouldn't be able to modify the Person object after instantiation.

== Evaluation ==

When the task is finished - provide changes for the review. Reviewer should try all possible ways to modify object 'two' inside PersonTest, so that it fails.

== Additional reading ==

Topics involved:
- immutability
- 'final' keyword
- access modifiers
- inheritance
- object references
- marker interfaces (Serializable)
