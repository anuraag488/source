package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l33 extends iz2 {

    /* JADX INFO: renamed from: c */
    public final OnBackInvokedDispatcher f23764c;

    /* JADX INFO: renamed from: d */
    public final int f23765d;

    /* JADX INFO: renamed from: e */
    public final OnBackInvokedCallback f23766e;

    /* JADX INFO: renamed from: f */
    public boolean f23767f;

    public l33(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f23764c = onBackInvokedDispatcher;
        this.f23765d = i;
        if (Build.VERSION.SDK_INT == 33) {
            C1185tk c1185tk = new C1185tk((byte) 1);
            c1185tk.f31205b = this;
            VarHandle.storeStoreFence();
            onBackInvokedCallback = c1185tk;
        } else {
            m33 m33Var = new m33();
            m33Var.f24619a = this;
            VarHandle.storeStoreFence();
            onBackInvokedCallback = m33Var;
        }
        this.f23766e = onBackInvokedCallback;
    }

    @Override // p000.iz2
    /* JADX INFO: renamed from: b */
    public final void mo6972b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f23766e;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f23764c;
        if (z && !this.f23767f) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(this.f23765d, onBackInvokedCallback);
            this.f23767f = true;
        } else {
            if (z || !this.f23767f) {
                return;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f23767f = false;
        }
    }
}
