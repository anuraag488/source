package p000;

import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.b02;
import ads_mobile_sdk.b22;
import ads_mobile_sdk.s41;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w45 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33096a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ s41 f33097b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33098c;

    public /* synthetic */ w45(byte b) {
        this.f33096a = b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33096a) {
            case 0:
                b02 b02Var = (b02) this.f33098c;
                lb5.m7910S(b02Var.f823d, null, null, new C0079d3((Object) b02Var, (Object) this.f33097b, "Operation denied by user.", (wm0) null, (byte) 29), 3);
                break;
            default:
                b22 b22Var = (b22) this.f33098c;
                s41 s41Var = this.f33097b;
                cm3 cm3Var = b22.f834i;
                b22Var.m321a("User canceled the download.", s41Var, false);
                break;
        }
    }
}
