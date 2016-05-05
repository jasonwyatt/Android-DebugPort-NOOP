package jwf.debugport;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/**
 *
 */
public class DebugPortService extends Service {
    /**
     * Utility method to start the DebugPortService
     */
    public static void start(Context context) {
    }

    /**
     * Utility method to start the DebugPortService.
     * @param params Parameters to configure the service.
     */
    public static void start(Context context, Params params) {
    }

    /**
     * Kill the currently-running server.
     */
    public static void stop(Context context) {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
