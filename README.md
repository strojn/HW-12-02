Використовуючи Intellij IDEA, створити Maven проєкт, пакет.

Створити клас Book, зробити 3 поля та відповідні методи. Необхідно реалізувати замикання анонімного класу та лямбда-виразу.

Всі операції по роботі виконувати в класі Main.



1 функціональний інтерфейс
2 метод який приймає інстанс і викликає метод
3 викликаємо цей метод з створеним інстансом через лямбду
4 викликаємо цей метод з створеним інстансом через анонімний клас

someMethod(instance){
instance.call()
}

instance i =  () -> interface()

someMethod(i)

someMethod(new instance() {
.....
})