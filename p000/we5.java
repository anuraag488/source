package p000;

import ads_mobile_sdk.EnumC0410xy;
import ads_mobile_sdk.nc3;
import ads_mobile_sdk.q12;
import ads_mobile_sdk.yz0;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we5 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f33281b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33282c;

    public /* synthetic */ we5(byte b) {
        this.f33281b = b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f33281b;
        Object obj = this.f33282c;
        switch (b) {
            case 0:
                ((q12) obj).m2014a(true);
                break;
            case 1:
                ((nc3) obj).f7649g.set(true);
                break;
            default:
                ((yz0) obj).mo838a(EnumC0410xy.f13430b);
                break;
        }
    }
}
