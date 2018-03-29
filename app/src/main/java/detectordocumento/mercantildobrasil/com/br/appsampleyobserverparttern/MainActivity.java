package detectordocumento.mercantildobrasil.com.br.appsampleyobserverparttern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer { //implements RepositoryObserver {

    TextView mTextViewUserAge;
    TextView mTextViewUserFullName;
    UserDataRepository mUserDataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewUserAge = findViewById(R.id.txtText);
        mTextViewUserFullName = findViewById(R.id.txtText1);


        mUserDataRepository = UserDataRepository.getInstance();
        mUserDataRepository.addObserver(this);
        //mUserDataRepository.registerObserver(this);
    }

    /*@Override
    public void onUserDataChanged(String fullname, int age) {
        mTextViewUserFullName.setText(fullname);
        mTextViewUserAge.setText(String.valueOf(age));
    }*/

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof UserDataRepository) {
            UserDataRepository userDataRepository = (UserDataRepository) o;
            mTextViewUserFullName.setText(userDataRepository.getmFullName());
            mTextViewUserAge.setText(String.valueOf(userDataRepository.getmAge()));
        }
    }
}
