package ir.afaghsoft.crud.models.enumeration;

public enum Gender {

    MALE, FEMALE;

    @Override
    public String toString() {

        switch (this) {
            case MALE:
                return "مرد";
            case FEMALE:
                return "زن";
        }
        return super.toString();
    }
}
