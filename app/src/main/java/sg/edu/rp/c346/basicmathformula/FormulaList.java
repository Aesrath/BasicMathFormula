package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 16003806 on 16/7/2018.
 */

public class FormulaList {
    private String name;
    private String formula;
    private String type;

    public FormulaList(String name, String formula, String type) {
        this.name = name;
        this.formula = formula;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FormulaList{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
