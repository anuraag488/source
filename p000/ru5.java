package p000;

import android.os.Handler;
import android.webkit.WebView;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ru5 extends WebView {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f29646d = 0;

    /* JADX INFO: renamed from: a */
    public Handler f29647a;

    /* JADX INFO: renamed from: b */
    public C1372yl f29648b;

    /* JADX INFO: renamed from: c */
    public boolean f29649c;

    /* JADX INFO: renamed from: a */
    public final void m10444a(String str, String str2) {
        String strM3879k = c75.m3879k(str, "(", str2, ");");
        ar1 ar1Var = new ar1((byte) 12);
        ar1Var.f14798b = this;
        ar1Var.f14799c = strM3879k;
        VarHandle.storeStoreFence();
        this.f29647a.post(ar1Var);
    }
}
