package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: tk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1185tk implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31204a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31205b;

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        byte b = this.f31204a;
        Object obj = this.f31205b;
        switch (b) {
            case 0:
                wp1 wp1Var = (wp1) obj;
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                break;
            default:
                ((l33) obj).m6971a();
                break;
        }
    }
}
