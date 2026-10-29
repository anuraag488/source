package p000;

import ads_mobile_sdk.ll0;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb5 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34139a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ll0 f34140b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f34141c;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f34139a) {
            case 0:
                ll0.m1596a(this.f34140b, this.f34141c);
                break;
            default:
                ll0.m1598b(this.f34140b, this.f34141c);
                break;
        }
    }
}
