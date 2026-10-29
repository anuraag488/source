package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 implements ai3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21242a;

    /* JADX INFO: renamed from: b */
    public ai3 f21243b;

    public /* synthetic */ ib1(byte b) {
        this.f21242a = b;
    }

    @Override // p000.ai3
    public final Object get() {
        wm0 wm0Var = null;
        switch (this.f21242a) {
            case 0:
                String packageName = ((Context) this.f21243b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                xy4.m12782k("Cannot return null from a non-@Nullable @Provides method");
                return null;
            case 1:
                Context context = (Context) this.f21243b.get();
                int iIntValue = Integer.valueOf(iw3.f21847d).intValue();
                iw3 iw3Var = new iw3(context, "com.google.android.datatransport.events", null, iIntValue);
                iw3Var.f21850b = false;
                iw3Var.f21849a = iIntValue;
                VarHandle.storeStoreFence();
                return iw3Var;
            default:
                lt0 lt0Var = (lt0) this.f21243b.get();
                e44 e44Var = new e44();
                e44Var.f17688a = lt0Var;
                C0638f5.m5528H(new it1((Object) e44Var, wm0Var, (byte) 26));
                VarHandle.storeStoreFence();
                return e44Var;
        }
    }
}
