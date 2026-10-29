package p000;

import ads_mobile_sdk.el3;
import ads_mobile_sdk.n94;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t75 implements uq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30978a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ el3 f30979b;

    @Override // p000.uq1
    public final Object apply(Object obj) {
        byte b = this.f30978a;
        el3 el3Var = this.f30979b;
        byte[] bArr = (byte[]) obj;
        switch (b) {
            case 0:
                el3Var.m832a((n94) el3Var.f3089b.get(), bArr, false);
                break;
            default:
                el3Var.m832a((n94) el3Var.f3089b.get(), bArr, true);
                break;
        }
        return null;
    }
}
