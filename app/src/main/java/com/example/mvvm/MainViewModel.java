package com.example.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<User>> user = new MutableLiveData<>();
    private MainNavigator navigator;

    public void setNavigator(MainNavigator navigator) {
        this.navigator = navigator;
    }

    public MutableLiveData<List<User>> getUser() {
        return user;
    }

    public void setUser() {
        List<User> users = new ArrayList<>();
        users.add(new User("Misko", "mrkvicka@gmail.com"));
        users.add(new User("Robko", "Robko@gmail.com"));
        users.add(new User("Janko", "Janko@gmail.com"));
        users.add(new User("Jozko", "Jozko@gmail.com"));
        users.add(new User("Andrej", "Andrej@gmail.com"));
        users.add(new User("Matko", "Matko@gmail.com"));
        users.add(new User("Misko", "mrkvicka@gmail.com"));
        users.add(new User("Robko", "Robko@gmail.com"));
        users.add(new User("Janko", "Janko@gmail.com"));
        users.add(new User("Jozko", "Jozko@gmail.com"));
        users.add(new User("Andrej", "Andrej@gmail.com"));
        users.add(new User("Matko", "Matko@gmail.com"));
        users.add(new User("Misko", "mrkvicka@gmail.com"));
        users.add(new User("Robko", "Robko@gmail.com"));
        users.add(new User("Janko", "Janko@gmail.com"));
        users.add(new User("Jozko", "Jozko@gmail.com"));
        users.add(new User("Andrej", "Andrej@gmail.com"));
        users.add(new User("Matko", "Matko@gmail.com"));
        users.add(new User("Misko", "mrkvicka@gmail.com"));
        users.add(new User("Robko", "Robko@gmail.com"));
        users.add(new User("Janko", "Janko@gmail.com"));
        users.add(new User("Jozko", "Jozko@gmail.com"));
        users.add(new User("Andrej", "Andrej@gmail.com"));
        users.add(new User("Matko", "Matko@gmail.com"));
        users.add(new User("Misko", "mrkvicka@gmail.com"));
        users.add(new User("Robko", "Robko@gmail.com"));
        users.add(new User("Janko", "Janko@gmail.com"));
        users.add(new User("Jozko", "Jozko@gmail.com"));
        users.add(new User("Andrej", "Andrej@gmail.com"));
        users.add(new User("Matko", "Matko@gmail.com"));

        this.user.setValue(users);
    }

    public void itemclick(User user) {
        navigator.onItemClick(user);
    }




}
