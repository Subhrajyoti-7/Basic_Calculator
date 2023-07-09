package com.mycode.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    TextView result, calculation;
    Button one, two, three, four, five, six, seven, eight, nine, zeroSingle, zeroDouble, dot, ac, percent, divide, multiple, plus;
    ImageView clear, minus, equal;
    String text = "", temp = "";
    boolean add, sub, mul, div, start = true, point = true, reset;
    double num, oldNum = 0, res = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        zeroSingle.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "0";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "0");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        zeroDouble.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "00";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "00");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        one.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "1";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "1");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        two.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "2";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "2");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        three.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "3";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "3");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        four.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "4";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "4");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        five.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "5";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "5");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        six.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "6";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "6");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        seven.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "7";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "7");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        eight.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "8";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "8");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });
        nine.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            text = text + "9";
            calculation.setText(text);
            num = Double.parseDouble((int)oldNum + "9");
            if(start) {
                if(temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(text);
            }
            else{
                result();
                oldNum = num;
            }
        });

        dot.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            if(point) {
                point = false;
                temp = result.getText().toString();
                text = text + ".";
                calculation.setText(text);
                num = Double.parseDouble( (int)oldNum + ".0");
                if (start) {
                    if (temp.endsWith(".0")) {
                        temp = temp.replace(".0", "");
                    }
                    result.setText(text);
                } else {
                    result();
                    oldNum = num;
                }
            }
        });
        plus.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            res = Double.parseDouble(temp);
            oldNum = 0.0;
            text = text + "+";
            calculation.setText(text);
            add = true;
            sub = false;
            mul = false;
            div = false;
            start = false;
            point = true;
        });
        minus.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            res = Double.parseDouble(temp);
            oldNum = 0.0;
            text = text + "-";
            calculation.setText(text);
            add = false;
            sub = true;
            mul = false;
            div = false;
            start = false;
            point = true;
        });
        multiple.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            res = Double.parseDouble(temp);
            oldNum = 0.0;
            text = text + "*";
            calculation.setText(text);
            add = false;
            sub = false;
            mul = true;
            div = false;
            start = false;
            point = true;
        });
        divide.setOnClickListener(v-> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            res = Double.parseDouble(temp);
            oldNum = 0.0;
            text = text + "/";
            calculation.setText(text);
            add = false;
            sub = false;
            mul = false;
            div = true;
            start = false;
            point = true;
        });
        equal.setOnClickListener(v-> {
            res = 0.0;
            oldNum = 0.0;
            start = true;
            point = true;
            add = false;
            sub = false;
            mul = false;
            div = false;
            calculation.setTextSize(40);
            result.setTextSize(70);
            reset = true;
        });
        ac.setOnClickListener(v-> {
            reset();
        });
        clear.setOnClickListener(v -> {
            if(reset) {
                reset = false;
                reset();
            }
            if(!text.equals("")) {
                StringBuilder sb = new StringBuilder(text);
                sb.deleteCharAt(sb.length() - 1);
                text = sb.toString();
                if(add) {
                    oldNum = 0;
                    res = res - num;
                    num = Double.parseDouble(String.valueOf((int) num / 10));
                    oldNum = num;
                }
                if(sub) {
                    oldNum = 0;
                    res = res + num;
                    num = Double.parseDouble(String.valueOf((int) num / 10));
                    oldNum = num;
                }
                if(mul) {
                    oldNum = 1;
                    res = res / num;
                    num = Double.parseDouble(String.valueOf((int) num / 10));
                    if(num == 0) {
                        num = 1;
                        oldNum = 0;
                    }
                }
                if(div) {
                    oldNum = 1;
                    res = res * num;
                    num = Double.parseDouble(String.valueOf((int) num / 10));
                    if(num == 0) {
                        num = 1;
                        oldNum = 0;
                    }
                }
                if(!add || !sub || !mul || !div) {
                    result.setText(text);
                }
                result();
                calculation.setText(text);
            }else {
                reset();
            }
        });
        percent.setOnClickListener(v -> {
            if(reset) {
                reset = false;
                reset();
            }
            temp = result.getText().toString();
            res = Double.parseDouble(temp) /100;
            text = text + "%";
            calculation.setText(text);
            result.setText(String.valueOf(res));
        });
    }

    void findId() {
        result = findViewById(R.id.result);
        calculation = findViewById(R.id.calculation);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zeroSingle = findViewById(R.id.zeroSingle);
        zeroDouble = findViewById(R.id.zeroDouble);
        dot = findViewById(R.id.dot);
        ac = findViewById(R.id.ac);
        percent = findViewById(R.id.percent);
        divide = findViewById(R.id.divide);
        multiple = findViewById(R.id.multiple);
        plus = findViewById(R.id.plus);
        clear = findViewById(R.id.clear);
        minus = findViewById(R.id.minus);
        equal = findViewById(R.id.equal);
    }

    @SuppressLint("SetTextI18n")
    void result() {
        if(add) {
            res = (res - oldNum) + num;
            temp = String.valueOf(res);
            if(temp.endsWith(".0")) {
                temp = temp.replace(".0", "");
            }
            result.setText(temp);
        }
        if(sub) {
            res = (res + oldNum) - num;
            temp = String.valueOf(res);
            if(temp.endsWith(".0")) {
                temp = temp.replace(".0", "");
            }
            result.setText(temp);
        }
        if(mul) {
            if(oldNum != 0) {
                res = (res / oldNum) * num;
            }
            else {
                res = (res) * num;
            }
            temp = String.valueOf(res);
            if(temp.endsWith(".0")) {
                temp = temp.replace(".0", "");
            }
            result.setText(temp);
        }
        if(div) {
            if(num != 0) {
                if (oldNum != 0) {
                    res = (res * oldNum) / num;
                } else {
                    res = (res) / num;
                }
                temp = String.valueOf(res);
                if (temp.endsWith(".0")) {
                    temp = temp.replace(".0", "");
                }
                result.setText(temp);
            }
            else {
                result.setText("Infinite");
            }
        }
    }

    void reset() {
        calculation.setText("");
        result.setText("");
        res = 0.0;
        num = 0.0;
        oldNum = 0.0;
        text = "";
        temp = "";
        calculation.setTextSize(70);
        result.setTextSize(40);
        start = true;
        point = true;
        add = false;
        sub = false;
        mul = false;
        div = false;
    }
}
