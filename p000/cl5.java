package p000;

import ads_mobile_sdk.C0355ua;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.yr3;
import ads_mobile_sdk.zx2;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl5 implements InterfaceC1412zo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16111a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16112b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16113c;

    public /* synthetic */ cl5(byte b) {
        this.f16111a = b;
    }

    @Override // p000.InterfaceC1412zo
    public final zl2 apply(Object obj) {
        switch (this.f16111a) {
            case 0:
                yr3 yr3Var = (yr3) this.f16112b;
                zx2 zx2Var = (zx2) this.f16113c;
                oy3 oy3Var = yr3Var.f13808d;
                ir0 ir0Var = ir0.f5385v3;
                pq4 pq4VarM2426a = yr3Var.f13805a.m2426a(zx2Var);
                oy3Var.m1892a(ir0Var, (ik1) pq4VarM2426a);
                return pq4VarM2426a;
            case 1:
                yr3 yr3Var2 = (yr3) this.f16112b;
                zx2 zx2Var2 = (zx2) this.f16113c;
                oy3 oy3Var2 = yr3Var2.f13808d;
                ir0 ir0Var2 = ir0.f5385v3;
                pq4 pq4VarM2426a2 = yr3Var2.f13805a.m2426a(zx2Var2);
                oy3Var2.m1892a(ir0Var2, (ik1) pq4VarM2426a2);
                return pq4VarM2426a2;
            default:
                C0355ua c0355ua = (C0355ua) this.f16112b;
                return ((ec5) c0355ua.f12216b.f10899f.get()).mo308a((Context) this.f16113c);
        }
    }
}
