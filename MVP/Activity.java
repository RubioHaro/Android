package MVP;

public class Activity extends AppCompatActivity implements UserView {
    private UserPresenter presenter;
    private TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        nameTextView = findViewById(R.id.nameTextView);
        presenter = new UserPresenter(this);

        presenter.loadUser();

        findViewById(R.id.updateButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateUserName("Jane Doe");
            }
        });
    }

    @Override
    public void showUserName(String name) {
        nameTextView.setText(name);
    }
}
