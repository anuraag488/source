package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class am5 extends km5 {

    /* JADX INFO: renamed from: a */
    public final Context f14632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pt1 f14633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am5(pt1 pt1Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f14633b = pt1Var;
        Looper.getMainLooper();
        this.f14632a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = qt1.f28784a;
        pt1 pt1Var = this.f14633b;
        Context context = this.f14632a;
        int iM10123b = pt1Var.m10123b(context, i2);
        int i3 = yt1.f35521e;
        if (iM10123b == 1 || iM10123b == 2 || iM10123b == 3 || iM10123b == 9) {
            Intent intentMo9664a = pt1Var.mo9664a(context, iM10123b, "n");
            pt1Var.m9666d(context, iM10123b, intentMo9664a == null ? null : PendingIntent.getActivity(context, 0, intentMo9664a, 201326592));
        }
    }
}
