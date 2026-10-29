package p000;

import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n56 extends Exception {
    public n56(int i, String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public final C0641f8 m8537a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        String message = super.getMessage();
        C0641f8 c0641f8 = new C0641f8((byte) 7);
        c0641f8.f18827b = message;
        VarHandle.storeStoreFence();
        return c0641f8;
    }

    public n56(int i, String str, IOException iOException) {
        super(str, iOException);
    }
}
