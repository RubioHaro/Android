public class Example extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflar la vista
        setContentView(R.layout.activity_main);

        // Actuar como controlador
        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Manejar el clic y actualizar el modelo o la vista
                TextView myTextView = findViewById(R.id.myTextView);
                myTextView.setText("Button clicked!");
            }
        });
    }
}
