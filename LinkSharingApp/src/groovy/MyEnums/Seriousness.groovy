package MyEnums
/**
 * Created by intelligrape on 21/2/15.
 */
public enum Seriousness
{
    SERIOUS("serious"),
    VERY_SERIOUS("verySerious"),
    CASUAL("casual")

    String seriousness

    Seriousness(String s)
    {
        this.seriousness=s
    }
}