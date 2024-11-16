package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, posneg, decimal, equals, add, subtract, multiply,
            divide, inverse, squareroot, square, fact, sin, cos, tan, log, ln, AC, C, openpar, closedpar, MS, MR, Msub, Madd, pi;

    TextView main, secondary;
    String pie = "3.14159265";
    double func;
    static double memory;
    int input = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intro toast
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to the Calculator", Toast.LENGTH_LONG);
        toast.show();

        //assign all buttons
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        posneg = findViewById(R.id.posneg);
        decimal = findViewById(R.id.decimal);
        equals = findViewById(R.id.equals);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        inverse = findViewById(R.id.inverse);
        squareroot = findViewById(R.id.squareroot);
        square = findViewById(R.id.square);
        fact = findViewById(R.id.fact);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        log = findViewById(R.id.log);
        ln = findViewById(R.id.ln);
        AC = findViewById(R.id.AC);
        C = findViewById(R.id.C);
        openpar = findViewById(R.id.openpar);
        closedpar = findViewById(R.id.closedpar);
        MS = findViewById(R.id.MS);
        MR = findViewById(R.id.MR);
        Madd = findViewById(R.id.Madd);
        Msub = findViewById(R.id.Msub);
        pi = findViewById(R.id.pi);

        //assign main and secondary
        main = findViewById(R.id.answer);
        secondary = findViewById(R.id.input);

        //onclick listener for all  buttons
        b0.setOnClickListener(view -> main.setText(main.getText() + "0"));
        b1.setOnClickListener(view -> main.setText(main.getText() + "1"));
        b2.setOnClickListener(view -> main.setText(main.getText() + "2"));
        b3.setOnClickListener(view -> main.setText(main.getText() + "3"));
        b4.setOnClickListener(view -> main.setText(main.getText() + "4"));
        b5.setOnClickListener(view -> main.setText(main.getText() + "5"));
        b6.setOnClickListener(view -> main.setText(main.getText() + "6"));
        b7.setOnClickListener(view -> main.setText(main.getText() + "7"));
        b8.setOnClickListener(view -> main.setText(main.getText() + "8"));
        b9.setOnClickListener(view -> main.setText(main.getText() + "9"));
        posneg.setOnClickListener(view -> {
            if (input == 0) {
                main.setText("-(" + main.getText() + ")");
            } else {
                main.setText(main.getText());
            }
            input = 0;
        });
        decimal.setOnClickListener(view -> {
            if (input == 0) {
                main.setText(main.getText() + ".");
            } else {
                main.setText(main.getText());
            }
            input = 0;
        });
        add.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                main.setText(main.getText() + "+");
            }
        });
        subtract.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                main.setText(main.getText() + "-");
            }
        });
        multiply.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                main.setText(main.getText() + "×");
            }
        });
        divide.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                main.setText(main.getText() + "÷");
            }
        });
        inverse.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = 1 / Double.parseDouble((String) main.getText());
                secondary.setText("1/" + main.getText());
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        sin.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.sin(Double.parseDouble((String) main.getText()));
                secondary.setText("sin(" + main.getText() + ")");
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        cos.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.cos(Double.parseDouble((String) main.getText()));
                secondary.setText("cos(" + main.getText() + ")");
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        tan.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.tan(Double.parseDouble((String) main.getText()));
                secondary.setText("tan(" + main.getText() + ")");
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        log.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.log10(Double.parseDouble((String) main.getText()));
                secondary.setText("log(" + main.getText() + ")");
                main.setText("");
                main.setText(String.valueOf(func));

            }
        });
        ln.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.log(Double.parseDouble((String) main.getText()));
                secondary.setText("ln(" + main.getText() + ")");
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        pi.setOnClickListener(view -> main.setText(main.getText() + pie));
        AC.setOnClickListener(view -> {
            secondary.setText("");
            main.setText("");
            input = 0;
        });
        C.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Already empty..", Toast.LENGTH_LONG).show();
            } else {
                String value = main.getText().toString();
                value = value.substring(0, value.length() - 1);
                main.setText(value);
            }
        });
        squareroot.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.sqrt(Double.parseDouble((String) main.getText()));
                secondary.setText("√(" + main.getText() + ")");
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        square.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                func = Math.pow(Double.parseDouble((String) main.getText()), 2);
                secondary.setText(main.getText() + "²");
                main.setText("");
                main.setText(String.valueOf(func));
            }
        });
        openpar.setOnClickListener(view -> main.setText(main.getText() + "("));
        closedpar.setOnClickListener(view -> main.setText(main.getText() + ")"));
        fact.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                int val = Integer.parseInt(main.getText().toString());
                int fact = factorial(val);
                secondary.setText(val + "!");
                main.setText(String.valueOf(fact));
            }
        });
        MS.setOnClickListener(view -> {
            memory = Double.parseDouble((String) main.getText());
            main.setText("");
            Toast.makeText(this, "Number has been Stored", Toast.LENGTH_LONG).show();

        });
        MR.setOnClickListener(view -> {
            main.setText("");
            main.setText(String.valueOf(memory));
        });
        Madd.setOnClickListener(view -> {
            secondary.setText(main.getText() + "+" + memory);
            Double input = Double.parseDouble(String.valueOf(memory)) + Double.parseDouble((String) main.getText());
            main.setText(String.valueOf(input));
        });
        Msub.setOnClickListener(view -> {
            secondary.setText(main.getText() + "-" + memory);
            Double input = Double.parseDouble((String) main.getText()) - Double.parseDouble(String.valueOf(memory));
            main.setText(String.valueOf(input));
        });
        equals.setOnClickListener(view -> {
            if (main.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_LONG).show();
            } else {
                String value = main.getText().toString();
                String replacedstring = value.replace('÷', '/').replace('×', '*');
                double result = calculate(replacedstring);
                main.setText(String.valueOf(result));
                secondary.setText(value);
                input = 0;
            }
        });
    }

    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    public double calculate(final String string) {
        return new Object() {
            int position = -1, ch;

            void nextChar() {
                if (++position < string.length()) ch = string.charAt(position);
                else ch = -1;
            }

            boolean next(int viewNext) {
                while (ch == ' ') nextChar();
                if (ch == viewNext) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double NegPos() {
                if (next('+')) {
                    return NegPos(); //returns positive
                }
                if (next('-')) {
                    return -NegPos(); //returns negative number
                }

                double num;
                int startPos = this.position;
                if (next('(')) { // works on parentheses before any add/sub/division/multiplication
                    num = analyzeExpression();
                    next(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        nextChar();
                    }
                    num = Double.parseDouble(string.substring(startPos, this.position));
                } else throw new RuntimeException("Unexpected: " + (char) ch);
                return num;
            }
            double analyzeTerm() { //runs this before any add/subtract
                double num = NegPos();
                while (true) {
                    if (next('*')) num *= analyzeTerm(); //Multiplication
                    else if (next('/')) num /= analyzeTerm(); //Division
                    else return num;
                }
            }
            double analyzeExpression() {
                double num = analyzeTerm(); //runs multiplication/division first
                while (true) {
                    if (next('+')) num += analyzeTerm(); //Addition
                    else if (next('-')) num -= analyzeTerm(); //Subtraction
                    else return num;
                }
            }
            double analyze() {
                nextChar();
                return analyzeExpression();
            }
        }.analyze();
    }
}
