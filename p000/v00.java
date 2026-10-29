package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v00 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public boolean f32280a;

    /* JADX INFO: renamed from: b */
    public LinkedBlockingQueue f32281b;

    /* JADX INFO: renamed from: a */
    public final IBinder m11689a() throws TimeoutException {
        y42.m12853Z("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f32280a) {
            C1077qn.m9989o("Cannot call get on this connection more than once");
            return null;
        }
        this.f32280a = true;
        IBinder iBinder = (IBinder) this.f32281b.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f32281b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
