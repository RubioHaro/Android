package MVVM;

public class UserViewModel extends ViewModel {
    private MutableLiveData<String> userName;
    private UserModel model;

    public UserViewModel() {
        model = new UserModel("John Doe");
        userName = new MutableLiveData<>();
        userName.setValue(model.getName());
    }

    public LiveData<String> getUserName() {
        return userName;
    }

    public void updateUserName(String name) {
        model.setName(name);
        userName.setValue(name);
    }
}
