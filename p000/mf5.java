package p000;

import ads_mobile_sdk.C0055bw;
import ads_mobile_sdk.C0305qy;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf5 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f24867b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C0305qy f24868c;

    public /* synthetic */ mf5(byte b) {
        this.f24867b = b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f24867b;
        C0305qy c0305qy = this.f24868c;
        switch (b) {
            case 0:
                C0055bw c0055bw = c0305qy.f10504a;
                if (c0055bw != null) {
                    c0055bw.invoke();
                }
                break;
            default:
                C0055bw c0055bw2 = c0305qy.f10504a;
                if (c0055bw2 != null) {
                    c0055bw2.invoke();
                }
                break;
        }
    }
}
