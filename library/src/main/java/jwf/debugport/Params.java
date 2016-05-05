package jwf.debugport;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Configuration parameters for the {@link DebugPortService}
 */
public class Params implements Parcelable {
    public Params() {
    }

    /**
     * Set the port on which the {@link jwf.debugport.internal.TelnetServer} should be made available.
     */
    public Params setPort(int port) {
        return this;
    }

    /**
     * Get the port on which the {@link jwf.debugport.internal.TelnetServer} will be made available.
     */
    public int getPort() {
        return 0;
    }

    /**
     * Set an array of commands which should be executed on the interpreter before the telnet client
     * is given control.  This can be useful if you need to run a bunch of <code>import</code>
     * statements, or configure some state.
     */
    public Params setStartupCommands(String[] commands) {
        return this;
    }

    /**
     * Get the startup commands which will be executed on the interpreter before each telnet client
     * is given control.
     */
    public String[] getStartupCommands() {
        return new String[0];
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public static final Creator<Params> CREATOR = new Creator<Params>() {
        @Override
        public Params createFromParcel(Parcel source) {
            Params p = new Params();
            return p;
        }

        @Override
        public Params[] newArray(int size) {
            return new Params[size];
        }
    };
}
