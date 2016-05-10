package jwf.debugport;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Configuration parameters for the {@link DebugPortService}
 */
public class Params implements Parcelable {
    public static final int DEFAULT_ANDROID_PORT = 8562;
    public static final int DEFAULT_SQLITE_PORT = 8563;

    public Params() {
    }

    /**
     * Set the port on which the {@link jwf.debugport.internal.TelnetServer} should be made available.
     * @deprecated Use {@link #setDebugPort(int)} instead.
     */
    @Deprecated
    public Params setPort(int port) {
        return this;
    }

    /**
     * Get the port on which the {@link jwf.debugport.internal.TelnetServer} will be made available.
     * @deprecated Use {@link #getDebugPort()} instead.
     */
    @Deprecated
    public int getPort() {
        return 0;
    }

    /**
     * Set the port on which the debug port server will be made available.
     */
    public Params setDebugPort(int port) {
        return this;
    }

    /**
     * Get the port on which the debug port server will be made available.
     */
    public int getDebugPort() {
        return 0;
    }

    /**
     * Set the port on which the SQLite-context server will be made available.
     */
    public Params setSQLitePort(int port) {
        return this;
    }

    /**
     * Get the port on which the SQLite-context server will be made available.
     */
    public int getSQLitePort() {
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
