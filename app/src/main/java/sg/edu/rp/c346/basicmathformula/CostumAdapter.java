package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by 16003806 on 16/7/2018.
 */

public class CostumAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<FormulaList> forList;

    public CostumAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        forList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);

        FormulaList currentForm = forList.get(position);
        String name = currentForm.getName();
        String type = currentForm.getType();
        String word[] = name.split(" ",2);
        String formula = currentForm.getFormula();

        tvName.setText(name);
        tvFormula.setText(formula);
        tvType.setText(type + word[0]);

        return rowView;

    }
}
