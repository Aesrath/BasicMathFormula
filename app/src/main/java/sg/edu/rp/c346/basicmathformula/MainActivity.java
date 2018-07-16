package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<FormulaList> aaFormulaList;
    CostumAdapter caFormula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFormula = findViewById(R.id.listViewFormula);

        aaFormulaList = new ArrayList<>();
        FormulaList f1 = new FormulaList("Area of Rectangle","Length x Length","Your formula is: ");
        FormulaList f2 = new FormulaList("Area of Triangle","(Length of base x Length)/2","Your formula is: ");
        FormulaList f3 = new FormulaList("Volume of Cube","Length x Length x Length","Your formula is: ");
        aaFormulaList.add(f1);
        aaFormulaList.add(f2);
        aaFormulaList.add(f3);



        caFormula = new CostumAdapter(this,R.layout.formula_list,aaFormulaList);

        lvFormula.setAdapter(caFormula);


    }
}
