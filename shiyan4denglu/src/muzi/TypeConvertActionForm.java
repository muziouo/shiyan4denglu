package muzi;

import org.apache.struts.action.ActionForm;

import java.sql.Date;

public class TypeConvertActionForm extends ActionForm {

    private int intValue;

    private double doubleValue;

    private boolean booleanValue;

    private java.sql.Date sqlDate;

    private java.sql.Date utilDate;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public java.util.Date getUtilDate() {
        return utilDate;
    }

    public void setUtilDate(Date sqlDate) {
        this.utilDate = sqlDate;
    }
}
