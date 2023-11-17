package com.basit.percentage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basit.percentage.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        setButtonClickListeners();
//





        binding.bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.year.setText("");
                binding.months.setText("");
                binding.rate.setText("");
                binding.months.setText("");
                binding.answer.setText("");
//                binding.tvsec.setText("");
            }
        });



        binding.btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the values from the obtained and total EditText fields
                String obtainedValue = binding.year.getText().toString().trim();
                String obtainedValue1 = binding.months.getText().toString().trim();
                String totalValue = binding.rate.getText().toString().trim();
                String amount = binding.amount.getText().toString().trim();

                // Check if either obtained or total value is empty
                if (obtainedValue.isEmpty() || totalValue.isEmpty() ||amount.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter time rate and amount values", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
//                    double obtainedValue1 = Double.parseD(binding.obtained.getText().toString().trim());
                    double year = Double.parseDouble(binding.year.getText().toString().trim());
                    double months = Double.parseDouble(binding.months.getText().toString().trim());
                    double rate = Double.parseDouble(binding.rate.getText().toString().trim());
                    double amount1 = Double.parseDouble(binding.amount.getText().toString().trim());


                    double totalYears = year + (months / 12.0);

                    // Calculate the simple interest
                    double interest = (amount1 * rate * totalYears) / 100;

                    String resultMessage = String.format(Locale.getDefault(), "Simple Interest: %.2f", interest);

                    // Display the result
                    binding.answer.setText(resultMessage);
//
                }


            }
        });




    }


    private void setButtonClickListeners() {
        // Set click listeners for numeric buttons
        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("1");
            }
        });

        binding.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("2");
            }
        });

        binding.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("3");
            }
        });

        binding.b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("4");
            }
        });



        binding.b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("5");
            }
        });

        binding.b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("6");
            }
        });

        binding.b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("7");
            }
        });

        binding.b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("8");
            }
        });

        binding.b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("9");
            }
        });

        binding.b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton("0");
            }
        });






        binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendTextFromButton(".");
//                Toast.makeText(MainActivity.this, "Basit", Toast.LENGTH_SHORT).show();
            }
        });

        binding.year.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    binding.year.setInputType(InputType.TYPE_NULL);
                    binding.bc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (binding.year != null) {
                                String val = binding.year.getText().toString();
                                if (!val.isEmpty()) {
                                    val = val.substring(0, val.length() - 1);
                                    binding.year.setText(val);
                                }
                            }
                        }
                    });
                    hideKeyboard();
                }
            }
        });
        binding.rate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    binding.rate.setInputType(InputType.TYPE_NULL);


                    binding.bc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (binding.rate != null) {
                                String val = binding.rate.getText().toString();
                                if (!val.isEmpty()) {
                                    val = val.substring(0, val.length() - 1);
                                    binding.rate.setText(val);
                                }
                            }
                        }
                    });
                    hideKeyboard();
                }
            }
        });
        binding.amount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    binding.amount.setInputType(InputType.TYPE_NULL);


                    binding.bc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (binding.amount != null) {
                                String val = binding.amount.getText().toString();
                                if (!val.isEmpty()) {
                                    val = val.substring(0, val.length() - 1);
                                    binding.amount.setText(val);
                                }
                            }
                        }
                    });
                    hideKeyboard();
                }
            }
        });
        binding.months.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    binding.months.setInputType(InputType.TYPE_NULL);


                    binding.bc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (binding.months != null) {
                                String val = binding.months.getText().toString();
                                if (!val.isEmpty()) {
                                    val = val.substring(0, val.length() - 1);
                                    binding.months.setText(val);
                                }
                            }
                        }
                    });
                    hideKeyboard();
                }
            }
        });

    }

    // Method to append text from buttons to the EditText
    private void appendTextFromButton(String buttonText) {
        // Find the focused EditText
        EditText focusedEditText = getFocusedEditText();

        if (focusedEditText != null) {
            // Get the current cursor position
            int cursorPosition = focusedEditText.getSelectionStart();

            // Insert the button text at the current cursor position
            focusedEditText.getText().insert(cursorPosition, buttonText);
        }
    }

    // Method to determine the focused EditText
    private EditText getFocusedEditText() {
        if (binding.year.hasFocus()) {

            hideKeyboard();
            return binding.year;
        }else if (binding.months.hasFocus()) {
            hideKeyboard();
            return binding.months;
        }
        else if (binding.rate.hasFocus()) {
            hideKeyboard();
            return binding.rate;
        }
        else if (binding.amount.hasFocus())
        {
            hideKeyboard();
            return binding.amount;
        }

        else {
            // If neither has focus, you can choose a default or handle it as needed
            return null;
        }
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}



