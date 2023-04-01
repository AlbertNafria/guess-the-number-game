# guess-the-number-game

Simple project for practising with spring-framework libraries and logging with `slf4j`

Using stereotype annotations and qualifiers instead of xml files

## Notes

Good rule to use constructor for mandatory dependencies and setter methods for
optional dependencies.
3 args for constructor should be the maximum
Not-null checks must be performed everywhere the code uses the dependency.
Spring team recommends constructor injection as it enables to implement application components as immutable objects and to ensure
that required dependencies are not null.

## Annotation vs XML Configuration

XML is outside java classes, separation of concerns. So if changing config doesn't need to re-compile the code.
Annotations lead to shorter and more concise configurations. Also self-document a class.
Annotations leads to decentralized config of metadata.

## Stereotype annotations

@Component, @Service and @Controller
Stereotype means something conforming to a fixed or general pattern.
@Component is a generic stereotype, @Repository and @Service are speciallizations of @Component.

Application events follow the observer design pattern

A qualifier is an annotation that you apply to a bean. Used when there is a need for fine-tuning annotation-based autowiring.
