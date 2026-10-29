package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qz5 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f28905e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f28906f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f28907g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f28908h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ x36 f28909i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f28910j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz5(x36 x36Var, String str, String str2, Object obj, boolean z) {
        super(x36Var, true);
        this.f28906f = str;
        this.f28907g = str2;
        this.f28910j = obj;
        this.f28908h = z;
        Objects.requireNonNull(x36Var);
        this.f28909i = x36Var;
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        switch (this.f28905e) {
            case 0:
                gx5 gx5Var = this.f28909i.f33967g;
                y42.m12854a0(gx5Var);
                gx5Var.setUserProperty(this.f28906f, this.f28907g, v23.m11711K(this.f28910j), this.f28908h, this.f20287a);
                break;
            default:
                gx5 gx5Var2 = this.f28909i.f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.getUserProperties(this.f28906f, this.f28907g, this.f28908h, (zw5) this.f28910j);
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: b */
    public void mo6202b() {
        switch (this.f28905e) {
            case 1:
                ((zw5) this.f28910j).mo7338h(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz5(x36 x36Var, String str, String str2, boolean z, zw5 zw5Var) {
        super(x36Var, true);
        this.f28906f = str;
        this.f28907g = str2;
        this.f28908h = z;
        this.f28910j = zw5Var;
        Objects.requireNonNull(x36Var);
        this.f28909i = x36Var;
    }
}
