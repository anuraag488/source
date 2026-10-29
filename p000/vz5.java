package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vz5 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f32992e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f32993f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f32994g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ x36 f32995h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f32996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz5(x36 x36Var, String str, String str2, Bundle bundle) {
        super(x36Var, true);
        this.f32993f = str;
        this.f32994g = str2;
        this.f32996i = bundle;
        Objects.requireNonNull(x36Var);
        this.f32995h = x36Var;
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        switch (this.f32992e) {
            case 0:
                gx5 gx5Var = this.f32995h.f33967g;
                y42.m12854a0(gx5Var);
                gx5Var.clearConditionalUserProperty(this.f32993f, this.f32994g, (Bundle) this.f32996i);
                break;
            case 1:
                gx5 gx5Var2 = this.f32995h.f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.getConditionalUserProperties(this.f32993f, this.f32994g, (zw5) this.f32996i);
                break;
            default:
                gx5 gx5Var3 = this.f32995h.f33967g;
                y42.m12854a0(gx5Var3);
                gx5Var3.setCurrentScreenByScionActivityInfo((pz5) this.f32996i, this.f32993f, this.f32994g, this.f20287a);
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: b */
    public void mo6202b() {
        switch (this.f32992e) {
            case 1:
                ((zw5) this.f32996i).mo7338h(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz5(x36 x36Var, String str, String str2, zw5 zw5Var) {
        super(x36Var, true);
        this.f32993f = str;
        this.f32994g = str2;
        this.f32996i = zw5Var;
        Objects.requireNonNull(x36Var);
        this.f32995h = x36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz5(x36 x36Var, pz5 pz5Var, String str, String str2) {
        super(x36Var, true);
        this.f32996i = pz5Var;
        this.f32993f = str;
        this.f32994g = str2;
        Objects.requireNonNull(x36Var);
        this.f32995h = x36Var;
    }
}
