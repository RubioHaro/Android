package MVP;

public class UserPresenter {
    private UserView view;
    private UserModel model;

    public UserPresenter(UserView view) {
        this.view = view;
        this.model = new UserModel("John Doe");
    }

    public void updateUserName(String name) {
        model.setName(name);
        view.showUserName(name);
    }

    public void loadUser() {
        view.showUserName(model.getName());
    }
}
