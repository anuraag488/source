package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.invoke.VarHandle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ wo5 f23544a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0588dv f23545b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f23546c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Runnable f23547d;

    @Override // java.lang.Runnable
    public final void run() {
        wo5 wo5Var = this.f23544a;
        C0588dv c0588dv = this.f23545b;
        int i = this.f23546c;
        Runnable runnable = this.f23547d;
        pt3 pt3Var = (pt3) wo5Var.f33571f;
        try {
            pt3 pt3Var2 = (pt3) wo5Var.f33568c;
            Objects.requireNonNull(pt3Var2);
            mt3 mt3Var = new mt3((byte) 2);
            mt3Var.f25210b = pt3Var2;
            VarHandle.storeStoreFence();
            pt3Var.m9675k(mt3Var);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) wo5Var.f33566a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                lv4 lv4Var = new lv4();
                lv4Var.f24402a = wo5Var;
                lv4Var.f24403b = c0588dv;
                lv4Var.f24404c = i;
                VarHandle.storeStoreFence();
                pt3Var.m9675k(lv4Var);
            } else {
                wo5Var.m12350e(c0588dv, i);
            }
        } catch (bg4 unused) {
            ((jp0) wo5Var.f33569d).m7224N(c0588dv, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
