package p000;

import ads_mobile_sdk.ll0;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb5 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35101a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ll0 f35102b;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.f35101a;
        ll0 ll0Var = this.f35102b;
        switch (b) {
            case 0:
                ll0Var.f6871k.set(false);
                break;
            case 1:
                ll0Var.f6871k.set(false);
                break;
            default:
                ll0Var.f6871k.set(false);
                break;
        }
    }
}
