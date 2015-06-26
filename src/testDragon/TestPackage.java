package testDragon;

import net.gc.blazedragon.BlazeDragon;
import net.gc.blazedragon.BlazePackage;
import net.gc.blazedragon.UnfittingBlazeDataException;

/**
 * Created by Benny on 07.03.2015.
 */
public class TestPackage extends BlazePackage
{
    TestPackage(short ID)                                                                                               // F�r BlazeDragon Init
    {
        super(ID);
    }

    TestPackage()                                                                                                       // Normale Init (BD Init vorrausgesetzt))
    {
        super();
    }

    @Override
    public void defineBlazeData()
    {
        addBlazeDataType(BlazeDragon.BOOLEAN_DATA);                                                                     // Daten Hirachie
        addBlazeDataType(BlazeDragon.STRING_DATA);
        addBlazeDataType(BlazeDragon.STRING_DATA);
    }

    // Sample Getter / Setter

    void setLoggedIn(boolean bool)
    {
        // Indexstart bei 1 da 0 mit PAckInit belegt ist
        try
        {
            this.setData(1, BlazeDragon.BOOLEAN_DATA, bool);
        }
        catch (UnfittingBlazeDataException ex)
        {
            ex.printStackTrace();
        }

    }

    void setUsername(String uname)
    {
        try
        {
            this.setData(2, BlazeDragon.STRING_DATA, uname);
        }
        catch (UnfittingBlazeDataException ex)
        {
            ex.printStackTrace();
        }
    }

    void setPass(String pass)
    {
        try
        {
            this.setData(3, BlazeDragon.STRING_DATA, pass);
        }
        catch (UnfittingBlazeDataException ex)
        {
            ex.printStackTrace();
        }
    }

    boolean getLoggedIn() throws UnfittingBlazeDataException
    {
        return this.getData(1).getDataBoolean();
    }

    String getUsername() throws UnfittingBlazeDataException
    {
        return this.getData(2).getDataStr();
    }

    String getPass() throws UnfittingBlazeDataException
    {
        return this.getData(3).getDataStr();
    }
}

