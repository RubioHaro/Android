package MVVM;

public class Activity extends AppCompatActivity {
    private UserViewModel viewModel;
    private TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        nameTextView = findViewById(R.id.nameTextView);
        viewModel = new ViewModelProvider(this).get(UserViewModel.class);

        viewModel.getUserName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String name) {
                nameTextView.setText(name);
            }
        });

        findViewById(R.id.updateButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.updateUserName("Jane Doe");
            }
        });
    }
}
