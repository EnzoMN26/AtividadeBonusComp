para executar o programa siga os seguintes comandos:

java -jar JFlex.jar exemploSem.flex

yacc -tv -J exemploSem.y

javac Parser.java

java Parser