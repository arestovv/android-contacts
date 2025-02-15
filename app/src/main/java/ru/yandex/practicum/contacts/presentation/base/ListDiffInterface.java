package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T extends ListDiffInterface<T>> {

    boolean theSameAs(T t);

    boolean equals(Object o);
}