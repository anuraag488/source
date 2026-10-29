package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.cl0;
import ads_mobile_sdk.ll0;
import ads_mobile_sdk.sy3;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb5 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f35928a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ll0 f35929b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ol3 f35930c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ol3 f35931d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f35932e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ int f35933f;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f35928a;
        ll0 ll0Var = this.f35929b;
        ol3 ol3Var = this.f35930c;
        ol3 ol3Var2 = this.f35931d;
        int i3 = this.f35932e;
        int i4 = this.f35933f;
        zo0 zo0Var = ll0Var.f6862b;
        byte b = 0;
        byte b2 = 3;
        wm0 wm0Var = null;
        if (i == i2) {
            sy3.m2303a(zo0Var, (t82) null, new cl0(ll0Var, wm0Var, b), 3);
            return;
        }
        if (i == ol3Var.f26851a) {
            sy3.m2303a(zo0Var, (t82) null, new cl0(ll0Var, wm0Var, (byte) 1), 3);
            return;
        }
        if (i == ol3Var2.f26851a) {
            sy3.m2303a(zo0Var, (t82) null, new cl0(ll0Var, wm0Var, (byte) 2), 3);
            return;
        }
        if (i == i3) {
            sy3.m2303a(zo0Var, (t82) null, new cl0(ll0Var, wm0Var, b2), 3);
            return;
        }
        if (i == i4) {
            sy3.m2303a(zo0Var, (t82) null, new cl0(ll0Var, wm0Var, (byte) 4), 3);
            return;
        }
        AbstractC0137h.m1115c("Unsupported debug menu option: " + i, null);
        ll0Var.f6871k.set(false);
    }
}
